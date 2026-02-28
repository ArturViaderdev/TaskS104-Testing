package level1Exercise2.exceptions;

public class IncorrectNumberException extends Exception{
    public IncorrectNumberException()
    {
        super("Nombre incorrecte per a un dni.");
    }
}
