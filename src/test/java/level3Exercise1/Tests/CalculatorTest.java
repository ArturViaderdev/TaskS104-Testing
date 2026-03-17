package level3Exercise1.Tests;

import level3Exercise1.Calculator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;

public class CalculatorTest {
    @Test
    void CalculatorStartsWithTotalZero()
    {
        Calculator calculator = new Calculator();
        Assertions.assertEquals(calculator.getTotal(),0);
        //assertThat(calculator.getTotal()).isEqualTo(0);
    }

    @Test
    void addTest()
    {
        Calculator calculator = new Calculator();
        double oldTotal = calculator.getTotal();
        calculator.add(2);
        Assertions.assertTrue(calculator.getTotal()>oldTotal);
        //assertThat(calculator.getTotal()).isGreaterThan(oldTotal);
    }

    @Test
    void subtractTest()
    {
        Calculator calculator = new Calculator();
        double oldTotal = calculator.getTotal();
        calculator.subtract(2);
        Assertions.assertTrue(calculator.getTotal()<oldTotal);
        //assertThat(calculator.getTotal()).isLessThan(oldTotal);
    }

    @Test
    void multiplyTest()
    {
        Calculator calculator = new Calculator();
        calculator.add(2);
        calculator.multiply(3);
        Assertions.assertEquals(calculator.getTotal(),2*3);
        //assertThat(calculator.getTotal()).isEqualTo(2*3);
    }

    @Test
    void divideTest()
    {
        Calculator calculator = new Calculator();
        calculator.add(9);
        calculator.divide(3);
        Assertions.assertEquals(calculator.getTotal(),9/3);
        //assertThat(calculator.getTotal()).isEqualTo(9/3);
    }

    @Test
    void divideZeroTest()
    {
        Calculator calculator = new Calculator();
        assertThrows(ArithmeticException.class, () -> calculator.divide(0));
    }

    @Test
    void resetTest()
    {
        Calculator calculator = new Calculator();
        calculator.add(5);
        calculator.reset();
        Assertions.assertEquals(calculator.getTotal(),0);
        //assertThat(calculator.getTotal()).isEqualTo(0);
    }

    @Test
    void getTotalTest()
    {
        Calculator calculator = new Calculator();
        calculator.add(1);
        calculator.add(1);
        calculator.add(1);
        Assertions.assertEquals(calculator.getTotal(),3);
        //assertThat(calculator.getTotal()).isEqualTo(3);
    }
}
