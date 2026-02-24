package Level1Exercise2.Exceptions;

public class IncorrectNumberException extends Exception{
    public IncorrectNumberException()
    {
        super("Nombre incorrecte per a un dni.");
    }
}
