package level1Exercise1.exceptions;

public class NotFoundBookException extends Exception{
    public NotFoundBookException(){
        super("El llibre no existeix");
    }
}
