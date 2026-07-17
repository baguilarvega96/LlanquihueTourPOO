package utils;

import exception.RutInvalidoException;

// Clase utilitaria encargada de validar el RUT chileno
public class ValidadorRut {

    // Evita crear objetos de esta clase
    private ValidadorRut() {
    }

    public static void validar(String rut) {

        if (rut == null || rut.trim().isEmpty()) {
            throw new RutInvalidoException(
                    "El RUT no puede estar vacío."
            );
        }

        // Elimina puntos y guion, y convierte la letra K a mayúscula
        String rutLimpio = rut
                .replace(".", "")
                .replace("-", "")
                .trim()
                .toUpperCase();

        if (!rutLimpio.matches("\\d{7,8}[0-9K]")) {
            throw new RutInvalidoException(
                    "El formato del RUT no es válido."
            );
        }

        String cuerpo = rutLimpio.substring(
                0,
                rutLimpio.length() - 1
        );

        char digitoIngresado = rutLimpio.charAt(
                rutLimpio.length() - 1
        );

        int suma = 0;
        int multiplicador = 2;

        for (int i = cuerpo.length() - 1; i >= 0; i--) {

            suma += Character.getNumericValue(
                    cuerpo.charAt(i)
            ) * multiplicador;

            multiplicador++;

            if (multiplicador == 8) {
                multiplicador = 2;
            }
        }

        int resultado = 11 - (suma % 11);
        char digitoCalculado;

        if (resultado == 11) {
            digitoCalculado = '0';
        } else if (resultado == 10) {
            digitoCalculado = 'K';
        } else {
            digitoCalculado = Character.forDigit(
                    resultado,
                    10
            );
        }

        if (digitoIngresado != digitoCalculado) {
            throw new RutInvalidoException(
                    "El dígito verificador del RUT es incorrecto."
            );
        }
    }
}