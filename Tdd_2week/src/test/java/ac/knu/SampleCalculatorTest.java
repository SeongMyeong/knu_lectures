package ac.knu;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertTrue;

public class SampleCalculatorTest {

    private SimpleCalculator simpleCalculator;

    @Before
    public void setUp() {
        simpleCalculator = new SimpleCalculator();
    }

    @Test
    public void addToTwoNumber() {
        int result = simpleCalculator.addInt(3, 5);
        assertTrue(result == 8);
    }

    @Test
    public void multiplyToTwoIntNumber() {
        int result = simpleCalculator.multiplyInt(3, 5);
        assertTrue(result == 15);
    }

    @Test
    public void multiplyToTwoRealNumber() {
        double result = simpleCalculator.multiplyDouble(3.0, 5.0);
        assertTrue(result == 15.0);
    }
}
