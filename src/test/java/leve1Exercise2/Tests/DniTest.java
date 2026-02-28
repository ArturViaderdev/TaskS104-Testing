package leve1Exercise2.Tests;
import level1Exercise2.CalculoDni;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;


import static org.junit.Assert.assertTrue;


public class DniTest {
    @ParameterizedTest
    @CsvSource({
            "54564454,J",
            "45676545,V",
            "54564454,J",
            "45676545,V",
            "58574829,Q",
            "59675848,W",
            "58584848,F",
            "54848594,B",
            "58493939,V",
            "69686867,H",
            "48484939,L",
            "68694409,X",
            "-1,-",
            "100000000,-"
    })
    public void dniTest(int number, char expectedletter) {
        boolean correct = true;
        char letter;
        try
        {
            letter = CalculoDni.letterDni(number);
            correct = true;
            if (letter != expectedletter) {
                correct = false;
            }
        } catch (Exception ex) {
            if(number<0 || number>=100000000)
            {
                correct = true;
            }
            else
            {
                correct = false;
            }
        }
        Assertions.assertTrue(correct);
    }
}
