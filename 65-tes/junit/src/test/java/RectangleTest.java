import org.junit.Test;

import static org.junit.Assert.*;

public class RectangleTest {

    @Test
    public void getArea() {
        // Arrange
        double height = 3;
        double base = 2;
        double expected = 6;

        // Act
        Rectangle rectangle = new Rectangle(base, height);
        double result = rectangle.getArea();

        // Assert
        assertEquals(expected, result, 0);
    }
}