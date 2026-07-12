package ui;

import data.GestorEntidades;
import data.GestorServicios;
import model.ColaboradorExterno;
import model.GuiaTuristico;
import model.Vehiculo;

import javax.swing.JOptionPane;

// Clase principal del programa
public class Main {

    public static void main(String[] args) {

        // Mantiene la demostración realizada durante la Semana 7
        mostrarServiciosTuristicos();

        // Crea el gestor que almacenará las nuevas entidades
        GestorEntidades gestorEntidades = new GestorEntidades();

        // Inicia la interfaz gráfica
        iniciarMenu(gestorEntidades);
    }

    // Muestra en consola los servicios turísticos creados anteriormente
    private static void mostrarServiciosTuristicos() {

        System.out.println("=== AGENCIA LLANQUIHUE TOUR ===");
        System.out.println("Aplicando polimorfismo y colecciones genericas\n");

        GestorServicios gestorServicios = new GestorServicios();

        gestorServicios.mostrarServicios(
                gestorServicios.obtenerServicios()
        );
    }

    // Menú principal de la interfaz gráfica
    private static void iniciarMenu(GestorEntidades gestorEntidades) {

        int opcion;

        do {

            String menu = """
                    === LLANQUIHUE TOUR ===

                    1. Registrar guía turístico
                    2. Registrar vehículo
                    3. Registrar colaborador externo
                    4. Mostrar entidades registradas
                    0. Salir

                    Ingrese una opción:
                    """;

            String entrada = JOptionPane.showInputDialog(
                    null,
                    menu,
                    "Sistema Llanquihue Tour",
                    JOptionPane.QUESTION_MESSAGE
            );

            // Si el usuario cierra la ventana, termina el programa
            if (entrada == null) {
                opcion = 0;

            } else {

                try {

                    opcion = Integer.parseInt(entrada);

                } catch (NumberFormatException error) {

                    opcion = -1;
                }
            }

            switch (opcion) {

                case 1:
                    registrarGuia(gestorEntidades);
                    break;

                case 2:
                    registrarVehiculo(gestorEntidades);
                    break;

                case 3:
                    registrarColaborador(gestorEntidades);
                    break;

                case 4:
                    mostrarEntidades(gestorEntidades);
                    break;

                case 0:

                    JOptionPane.showMessageDialog(
                            null,
                            "Programa finalizado."
                    );

                    break;

                default:

                    JOptionPane.showMessageDialog(
                            null,
                            "Ingrese una opción válida.",
                            "Error",
                            JOptionPane.ERROR_MESSAGE
                    );
            }

        } while (opcion != 0);
    }

    // Registra un nuevo guía turístico
    private static void registrarGuia(
            GestorEntidades gestorEntidades) {

        String nombre = pedirTexto(
                "Ingrese el nombre del guía:"
        );

        if (nombre == null) {
            return;
        }

        String rut = pedirTexto(
                "Ingrese el RUT del guía:"
        );

        if (rut == null) {
            return;
        }

        String telefono = pedirTexto(
                "Ingrese el teléfono del guía:"
        );

        if (telefono == null) {
            return;
        }

        String especialidad = pedirTexto(
                "Ingrese la especialidad:"
        );

        if (especialidad == null) {
            return;
        }

        Integer experiencia = pedirNumero(
                "Ingrese los años de experiencia:",
                0
        );

        if (experiencia == null) {
            return;
        }

        GuiaTuristico guia = new GuiaTuristico(
                nombre,
                rut,
                telefono,
                null,
                especialidad,
                experiencia
        );

        gestorEntidades.agregarEntidad(guia);

        JOptionPane.showMessageDialog(
                null,
                "Guía turístico registrado correctamente."
        );
    }

    // Registra un nuevo vehículo
    private static void registrarVehiculo(
            GestorEntidades gestorEntidades) {

        String patente = pedirTexto(
                "Ingrese la patente:"
        );

        if (patente == null) {
            return;
        }

        String marca = pedirTexto(
                "Ingrese la marca:"
        );

        if (marca == null) {
            return;
        }

        String modelo = pedirTexto(
                "Ingrese el modelo:"
        );

        if (modelo == null) {
            return;
        }

        Integer capacidad = pedirNumero(
                "Ingrese la capacidad de pasajeros:",
                1
        );

        if (capacidad == null) {
            return;
        }

        Vehiculo vehiculo = new Vehiculo(
                patente,
                marca,
                modelo,
                capacidad
        );

        gestorEntidades.agregarEntidad(vehiculo);

        JOptionPane.showMessageDialog(
                null,
                "Vehículo registrado correctamente."
        );
    }

    // Registra un nuevo colaborador externo
    private static void registrarColaborador(
            GestorEntidades gestorEntidades) {

        String nombre = pedirTexto(
                "Ingrese el nombre del colaborador:"
        );

        if (nombre == null) {
            return;
        }

        String rut = pedirTexto(
                "Ingrese el RUT:"
        );

        if (rut == null) {
            return;
        }

        String telefono = pedirTexto(
                "Ingrese el teléfono:"
        );

        if (telefono == null) {
            return;
        }

        String empresa = pedirTexto(
                "Ingrese el nombre de la empresa:"
        );

        if (empresa == null) {
            return;
        }

        String servicio = pedirTexto(
                "Ingrese el servicio prestado:"
        );

        if (servicio == null) {
            return;
        }

        ColaboradorExterno colaborador =
                new ColaboradorExterno(
                        nombre,
                        rut,
                        telefono,
                        null,
                        empresa,
                        servicio
                );

        gestorEntidades.agregarEntidad(colaborador);

        JOptionPane.showMessageDialog(
                null,
                "Colaborador registrado correctamente."
        );
    }

    // Muestra todas las entidades almacenadas
    private static void mostrarEntidades(
            GestorEntidades gestorEntidades) {

        JOptionPane.showMessageDialog(
                null,
                gestorEntidades.obtenerResumenEntidades(),
                "Entidades registradas",
                JOptionPane.INFORMATION_MESSAGE
        );
    }

    // Solicita un texto y evita campos vacíos
    private static String pedirTexto(String mensaje) {

        while (true) {

            String texto = JOptionPane.showInputDialog(
                    null,
                    mensaje
            );

            if (texto == null) {
                return null;
            }

            texto = texto.trim();

            if (!texto.isEmpty()) {
                return texto;
            }

            JOptionPane.showMessageDialog(
                    null,
                    "El campo no puede quedar vacío.",
                    "Error",
                    JOptionPane.ERROR_MESSAGE
            );
        }
    }

    // Solicita un número y valida su valor mínimo
    private static Integer pedirNumero(
            String mensaje,
            int valorMinimo) {

        while (true) {

            String entrada = JOptionPane.showInputDialog(
                    null,
                    mensaje
            );

            if (entrada == null) {
                return null;
            }

            try {

                int numero = Integer.parseInt(entrada);

                if (numero >= valorMinimo) {
                    return numero;
                }

                JOptionPane.showMessageDialog(
                        null,
                        "El número debe ser igual o mayor a "
                                + valorMinimo + ".",
                        "Error",
                        JOptionPane.ERROR_MESSAGE
                );

            } catch (NumberFormatException error) {

                JOptionPane.showMessageDialog(
                        null,
                        "Debe ingresar un número válido.",
                        "Error",
                        JOptionPane.ERROR_MESSAGE
                );
            }
        }
    }
}