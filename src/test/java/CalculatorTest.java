import org.junit.Assert;
import org.junit.Test;

public class CalculatorTest {

    @Test
    public void addTest() {
        // Given
        Calculator calculator = new Calculator();
        double value1 = 7;
        double value2 = 10;
        double expected = value1 + value2;

        // When
        double actual = calculator.add(value1, value2);

        // Then
        Assert.assertEquals(expected, actual, 0.01);
    }
    @Test
    public void subtractTest() {
        // Given
        Calculator calculator = new Calculator();
        double value1 = 7;
        double value2 = 10;
        double expected = value1 - value2;

        // When
        double actual = calculator.subtract(value1, value2);

        // Then
        Assert.assertEquals(expected, actual, 0.01);
    }

    @Test
    public void multiplyTest() {
        // Given
        Calculator calculator = new Calculator();
        double value1 = 7;
        double value2 = 10;
        double expected = value1 * value2;

        // When
        double actual = calculator.multiply(value1, value2);

        // Then
        Assert.assertEquals(expected, actual, 0.01);
    }

    @Test
    public void divideTest() {
        // Given
        Calculator calculator = new Calculator();
        double value1 = 7;
        double value2 = 10;
        double expected = value1 / value2;

        // When
        double actual = calculator.divide(value1, value2);

        // Then
        Assert.assertEquals(expected, actual, 0.01);
    }

    @Test
    public void squareTest() {
        // Given
        Calculator calculator = new Calculator();
        double value = 7;
        double expected = Math.pow(value, 2);

        // When
        double actual = calculator.square(value);

        // Then
        Assert.assertEquals(expected, actual, 0.01);
    }

    @Test
    public void squareRootTest() {
        // Given
        Calculator calculator = new Calculator();
        double value = 7;
        double expected = Math.sqrt(value);

        // When
        double actual = calculator.squareRoot(value);

        // Then
        Assert.assertEquals(expected, actual, 0.01);
    }

    @Test
    public void exponentTest() {
        // Given
        Calculator calculator = new Calculator();
        double value1 = 7;
        double value2 = 10;
        double expected = Math.pow(value1, value2);

        // When
        double actual = calculator.exponent(value1, value2);

        // Then
        Assert.assertEquals(expected, actual, 0.01);
    }
}
