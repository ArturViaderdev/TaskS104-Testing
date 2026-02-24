package Level1Exercise2;

import Level1Exercise2.Exceptions.IncorrectNumberException;

public class CalculoDni {
    public static char letterDni(int numbers) throws IncorrectNumberException {
        if(numbers>=0 && numbers<=99999999) {
            String letters = "TRWAGMYFPDXBNJZSQVHLCKE";
            char letter = letters.charAt(numbers % letters.length());
            return letter;
        }
        else
        {
            throw new IncorrectNumberException();
        }
    }
}
