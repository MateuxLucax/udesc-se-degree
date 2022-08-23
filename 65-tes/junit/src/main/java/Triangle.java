public class Triangle {
    private double height;
    private double base;
    public Triangle() {
        this(0,0);
    }
    public Triangle(double base, double height) {
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
        return (getBase() * getHeight()) / 2;
    }
}