package exception;

// Excepción personalizada utilizada cuando un RUT no es válido
public class RutInvalidoException extends RuntimeException {

    public RutInvalidoException(String mensaje) {
        super(mensaje);
    }
}