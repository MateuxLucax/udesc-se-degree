public class Rectangle {
    private double height;
    private double base;
    public Rectangle() {
        this(0,0);
    }
    public Rectangle(double base, double height) {
        setBase(base);
        setHeight(height);
    }
    public double getHeight() {
        return height;
    }

    public double getBase() {
        return base;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getArea() {
        return getBase() * getHeight();
    }
}