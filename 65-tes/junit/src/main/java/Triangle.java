public class Triangle {
    private double height;
    private double base;
    private double a;
    private double b;
    private double c;

    public Triangle() {
        this(0,0);
    }

    public Triangle(double base, double height) {
        setBase(base);
        setHeight(height);
        setB(base);
        double side = Math.sqrt((base / 2)) + Math.sqrt(height);
        setA(side);
        setB(side);
    }

    public Triangle(double a, double b, double c)  {
        setA(a);
        setB(b);
        setC(c);
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

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

    public TriangleType getTriangleType() {
        if (a == b && a == c) {
            return TriangleType.EQUILATERAL;
        } else if (a == b || a == c) {
            return TriangleType.ISOSCELES;
        }
        return TriangleType.SCALENE;
    }

    public boolean sidesAreValid() {
        return ((a < (b + c) && b < (a + c) && c < (a + b)));
    }
}