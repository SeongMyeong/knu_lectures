package ac.knu;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class SimpleCalculatorTest {

    @Test
    public void plusIntegerTest() {
        SimpleCalculator simpleCalculator = new SimpleCalculator();

        int result = simpleCalculator.plusInteger(1, 2);
        assertEquals(3, result);
    }

    ;

    @Test
    public void multiplyDoubleTest() {
        SimpleCalculator simpleCalculator = new SimpleCalculator();

        int result = simpleCalculator.multiplyDouble(2, 3);
        assertEquals(6, result);
    }

    ;

    @Test
    public void divideByTest() {
        SimpleCalculator simpleCalculator = new SimpleCalculator();

        double result = simpleCalculator.divideBy(4, 2);
        assertEquals(2.0, result);
    }

    ;

    // Return ArithmeticException after running this method
    @Test(expected = ArithmeticException.class)
    public void divide_zero_should_raise_exception() {
        SimpleCalculator simpleCalculator = new SimpleCalculator();

        double result = simpleCalculator.divideBy(5, 0);
    }
}
