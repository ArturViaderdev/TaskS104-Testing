package Level3Exercise1.Tests;

import Level3Exercise1.Calculator;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CalculatorTest {
    @Test
    void CalculatorStartsWithTotalZero()
    {
        Calculator calculator = new Calculator();
        assertThat(calculator.getTotal()).isEqualTo(0);
    }

    @Test
    void addTest()
    {
        Calculator calculator = new Calculator();
        double oldtotal = calculator.getTotal();
        calculator.add(2);
        assertThat(calculator.getTotal()).isGreaterThan(oldtotal);
    }

    @Test
    void substractTest()
    {
        Calculator calculator = new Calculator();
        double oldtotal = calculator.getTotal();
        calculator.substract(2);
        assertThat(calculator.getTotal()).isLessThan(oldtotal);
    }

    @Test
    void multiplyTest()
    {
        Calculator calculator = new Calculator();
        calculator.add(2);
        calculator.multiply(3);
        assertThat(calculator.getTotal()).isEqualTo(2*3);
    }

    @Test
    void divideTest()
    {
        Calculator calculator = new Calculator();
        calculator.add(9);
        calculator.divide(3);
        assertThat(calculator.getTotal()).isEqualTo(9/3);
    }

    @Test
    void dividezeroTest()
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
        assertThat(calculator.getTotal()).isEqualTo(0);
    }

    @Test
    void getTotalTest()
    {
        Calculator calculator = new Calculator();
        calculator.add(1);
        calculator.add(1);
        calculator.add(1);
        assertThat(calculator.getTotal()).isEqualTo(3);
    }
}
