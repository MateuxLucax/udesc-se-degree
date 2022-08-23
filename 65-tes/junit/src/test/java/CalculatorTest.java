import org.junit.Test;

import static org.junit.Assert.*;

public class CalculatorTest {

    @Test
    public void sum() {
        // Arrange
        double a = 1;
        double b = 2;
        double expected = 3;

        // Act
        double result = Calculator.sum(a, b);

        // Assert
        assertEquals(expected, result, 0);
    }

    @Test
    public void subtraction() {
        // Arrange
        double a = 2;
        double b = 1;
        double expected = 1;

        // Act
        double result = Calculator.subtract(a, b);

        // Assert
        assertEquals(expected, result, 0);
    }

    @Test
    public void multiply() {
        // Arrange
        double a = 2;
        double b = 2;
        double expected = 4;

        // Act
        double result = Calculator.multiply(a, b);

        // Assert
        assertEquals(expected, result, 0);
    }

    @Test
    public void divide() {
        // Arrange
        double a = 4;
        double b = 2;
        double expected = 2;

        // Act
        double result = Calculator.divide(a, b);

        // Assert
        assertEquals(expected, result, 0);
    }
}