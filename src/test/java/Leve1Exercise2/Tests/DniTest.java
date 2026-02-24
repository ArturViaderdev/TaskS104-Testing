package Leve1Exercise2.Tests;
import Level1Exercise2.CalculoDni;
import Level1Exercise2.Exceptions.IncorrectNumberException;
import org.junit.Test;

import static org.junit.Assert.assertTrue;


public class DniTest {
    @Test
    public void testdni()
    {
        boolean correct = true;
        char letter;
        try
        {
            letter = CalculoDni.letterDni(54564454);
            if(letter!='J')
            {
                correct=false;
            }
            letter = CalculoDni.letterDni(45676545);
            if(letter!='V')
            {
                correct=false;
            }
            letter = CalculoDni.letterDni(54564454);
            if(letter!='J')
            {
                correct=false;
            }
            letter = CalculoDni.letterDni(45676545);
            if(letter!='V')
            {
                correct=false;
            }
            letter = CalculoDni.letterDni(58574829);
            if(letter!='Q')
            {
                correct=false;
            }
            letter = CalculoDni.letterDni(59675848);
            if(letter!='W')
            {
                correct=false;
            }
            letter = CalculoDni.letterDni(58584848);
            if(letter!='F')
            {
                correct=false;
            }
            letter = CalculoDni.letterDni(54848594);
            if(letter!='B')
            {
                correct=false;
            }
            letter = CalculoDni.letterDni(58493939);
            if(letter!='V')
            {
                correct=false;
            }
            letter = CalculoDni.letterDni(69686867);
            if(letter!='H')
            {
                correct=false;
            }
            letter = CalculoDni.letterDni(48484939);
            if(letter!='L')
            {
                correct=false;
            }
            letter = CalculoDni.letterDni(68694409);
            if(letter!='X')
            {
                correct=false;
            }
        }
        catch(Exception ex)
        {
            correct = false;
        }
        if(correct)
        {
            correct = false;
            try {
                letter = CalculoDni.letterDni(-1);
            } catch (IncorrectNumberException e) {
                correct = true;
            }
            if(correct)
            {
                correct = false;
                try {
                    letter = CalculoDni.letterDni(100000000);
                } catch (IncorrectNumberException e) {
                    correct=true;
                }
            }
        }
        assertTrue(correct);
    }
}
