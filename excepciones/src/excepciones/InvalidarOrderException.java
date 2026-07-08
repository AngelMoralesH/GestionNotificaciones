package excepciones;
public class InvalidarOrderException extends RuntimeException {

    //ESTA ES UNA EXCEPCION "NO" CHEQUEADA RuntimeException

    public InvalidarOrderException(String message) {
        super(message);
    }

}
