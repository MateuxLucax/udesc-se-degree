import java.awt.Rectangle;

public class Quadrado extends FormaGeometrica {

    private int lado;

    public Quadrado(String cor, int lado) {
        super(cor);
        this.lado = lado;
    }

    public Quadrado(String cor, int lado, int x, int y) {
        super(cor, x, y);
        this.lado = lado;
    }

    public boolean setLado(int lado) {
        if (lado > 0) {
            this.lado = lado;
            return true;
        }
        return false;
    }

    public int getLado() {
        return this.lado;
    }


    @Override
    public void desenhar() {
        Canvas canvas = Canvas.getCanvas();
        canvas.draw(this, getCor(), new Rectangle(getX(), getY(), lado, lado));
        canvas.wait(10);
    }
}
