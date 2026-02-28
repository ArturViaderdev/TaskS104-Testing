package level1Exercise2;

import level1Exercise2.exceptions.IncorrectNumberException;

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
