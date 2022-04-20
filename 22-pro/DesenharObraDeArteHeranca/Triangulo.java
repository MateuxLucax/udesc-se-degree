import java.awt.Polygon;

public class Triangulo extends FormaGeometrica {

    private int altura;

    private int base;

    public Triangulo(String cor, int altura, int base) {
        super(cor);
        this.altura = altura;
        this.base = base;
    }


    public Triangulo(String cor, int altura, int base, int x, int y) {
        super(cor, x, y);
        this.altura = altura;
        this.base = base;
    }

    public boolean setAltura(int altura) {
        if (altura > 0) {
            this.altura = altura;
            return true;
        }
        return false;
    }

    public int getAltura() {
        return this.altura;
    }

    public boolean setBase(int base) {
        if (base > 0) {
            this.base = base;
            return true;
        }
        return false;
    }


    @Override
    public void desenhar() {
        Canvas canvas = Canvas.getCanvas();
        int[] xpoints = { getX(), getX() + (base / 2), getX() - (base / 2) };
        int[] ypoints = { getY(), getY() + altura, getY() + altura };
        canvas.draw(this, getCor(), new Polygon(xpoints, ypoints, 3));
        canvas.wait(10);
    }

}
