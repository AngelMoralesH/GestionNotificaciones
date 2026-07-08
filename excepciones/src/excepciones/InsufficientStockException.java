package excepciones;

public class InsufficientStockException extends Exception{

    //ESTA ES UNA EXCEPCION CHEQUEADA Y LA VAMOS A USAR  Exception

    public InsufficientStockException(String message){
        super(message);
    }
}
