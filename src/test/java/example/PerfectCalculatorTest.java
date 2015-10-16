package example;

import org.junit.Assert;
import org.junit.Test;

public class PerfectCalculatorTest {

    @Test
    public void testAddition() {
	PerfectCalculator calculator = new PerfectCalculator();
	double result = calculator.add(1, 2);
	Assert.assertEquals(3, result, 0);
    }

    @Test
    public void testMultiplication() {
	PerfectCalculator calculator = new PerfectCalculator();
	double result = calculator.multiply(1, 2);
	Assert.assertEquals(2, result, 0);
    }

    @Test
    public void testMatrixMultiplication() {
	PerfectCalculator calculator = new PerfectCalculator();
	double a[][] = { { 1, 2 } };
	double b[][] = { { 3 }, { 1 } };
	double result[][] = calculator.multiplyMatrix(a, b);
	Assert.assertEquals("Row lenght; ", 1, result.length);
	Assert.assertEquals("Column lenght", 1, result[0].length);
	Assert.assertEquals("Result", 5, result[0][0], 0);
    }
}
