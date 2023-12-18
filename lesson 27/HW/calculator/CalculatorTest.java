package HW.calculator;


import org.junit.Before;
import org.junit.jupiter.api.Test;

import static org.testng.AssertJUnit.assertEquals;
import static org.testng.AssertJUnit.fail;

public class CalculatorTest {
    private Calculator calculator;

    @Before
    public void setUp() {
        calculator = new Calculator();
    }

    @Test
    public void testAdd() {
        assertEquals(5, calculator.add(2, 3));
        assertEquals(-1, calculator.add(2, -3));
        assertEquals(0, calculator.add(0, 0));
    }

    @Test
    public void testSubtract() {
        assertEquals(-1, calculator.subtract(2, 3));
        assertEquals(5, calculator.subtract(2, -3));
        assertEquals(0, calculator.subtract(0, 0));
    }

    @Test
    public void testMultiply() {
        assertEquals(6, calculator.multiply(2, 3));
        assertEquals(-6, calculator.multiply(2, -3));
        assertEquals(0, calculator.multiply(0, 0));
    }

    @Test
    public void testDivide() {
        assertEquals(2, calculator.divide(6, 3));
        assertEquals(-2, calculator.divide(6, -3));
        assertEquals(0, calculator.divide(0, 5));

        try {
            calculator.divide(5, 0);
            fail("Ожидаемое арифметическое исключение");
        } catch (ArithmeticException e) {
        }
    }

    @Test
    public void testModulo() {
        assertEquals(1, calculator.modulo(5, 2));
        assertEquals(0, calculator.modulo(6, 3));


        try {
            calculator.modulo(5, 0);
            fail("Ожидаемое арифметическое исключение");
        } catch (ArithmeticException e) {
        }
    }
}

