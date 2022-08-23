import org.junit.Test;

import static org.junit.Assert.assertEquals;

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
}