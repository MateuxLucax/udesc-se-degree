import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class TriangleTest {

    @Test
    public void getArea() {
        // Arrange
        double height = 5;
        double base = 5;
        double expected = 12.5;

        // Act
        Triangle triangle = new Triangle(base, height);
        double result = triangle.getArea();

        // Assert
        assertEquals(expected, result, 0);
    }

    @Test
    public void getTriangleType() {
        // Arrange
        double base = 2;
        double height = 4;
        TriangleType expected = TriangleType.ISOSCELES;

        // Act
        Triangle triangle = new Triangle(base, height);
        TriangleType result = triangle.getTriangleType();

        // Assert
        assertEquals(expected, result);
    }

    @Test
    public void sidesAreValid() {
        // Arrange
        double a = 2;
        double b = 2;
        double c = 2;

        // Act
        Triangle triangle = new Triangle(a, b, c);
        boolean result = triangle.sidesAreValid();

        // Assert
        assertTrue(result);
    }
}