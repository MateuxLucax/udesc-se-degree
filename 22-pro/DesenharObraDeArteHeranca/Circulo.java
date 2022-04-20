import java.awt.geom.Ellipse2D;

public class Circulo extends FormaGeometrica {

    private int diametro;

    public Circulo(String cor, int diametro) {
        super(cor);
        this.diametro = diametro;
    }

    public Circulo(String cor, int diametro, int x, int y) {
        super(cor, x, y);
        this.diametro = diametro;
    }

    public boolean setDiametro(int diametro) {
        if (diametro > 0) {
            this.diametro = diametro;
            return true;
        }
        return false;
    }

    public int getDiametro() {
        return this.diametro;
    }

    @Override
    public void desenhar() {
        Canvas canvas = Canvas.getCanvas();
        canvas.draw(this, getCor(), new Ellipse2D.Double(getX(), getY(), diametro, diametro));
        canvas.wait(10);
    }
}
