import java.util.ArrayList;

public abstract class FormaGeometrica {

    private String cor;

    private int x;

    private int y;

    public FormaGeometrica(String cor) {
        this.cor = cor;
    }

    public FormaGeometrica(String cor, int x, int y) {
        this.cor = cor;
        this.x = x;
        this.y = y;
    }

    public void moverHorizontal(int distancia) {
        apagar();
        x += distancia;
        desenhar();
    }

    public boolean setCor(String cor) {
        ArrayList<String> coresValidas = new ArrayList<>();
        coresValidas.add("red");
        coresValidas.add("yellow");
        coresValidas.add("blue");
        coresValidas.add("magenta");
        coresValidas.add("black");

        if (coresValidas.contains(cor)) {
            this.cor = cor;
            return true;
        }
        return false;
    }

    public String getCor() {
        return this.cor;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getX() {
        return this.x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getY() {
        return this.y;
    }

    public void moverVertical(int distancia) {
        apagar();
        y += distancia;
        desenhar();
    }

    public abstract void desenhar();

    public void apagar() {
        Canvas canvas = Canvas.getCanvas();
        canvas.erase(this);
    }

}