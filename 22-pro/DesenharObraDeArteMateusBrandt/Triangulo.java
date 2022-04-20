import java.awt.Polygon;

/**
 * Um triângulo que pode ser manipulado e se desenha em uma tela.
 * 
 * Adaptado do exemplo originalmente publicado no livro:
 * "Programação Orientada a Objetos com Java: Uma Introdução Prática Utilizando o Blue J"
 * dos autores Michael Kölling and David J. Barnes.
 */
public class Triangulo {
    String cor; // A cor do triângulo. As cores aceitas são (todas em inglês): "red", "yellow", "blue", "green", "magenta" e "black".
    int altura; // A altura do triângulo
    int base; // A base do triângulo
    int x; // A posição X do triângulo na tela
    int y; // A posição Y do triângulo na tela

    /**
     * Move o triângulo horizontalmente por uma 'distância' em pixels.
     * 
     * @param distancia a quantidade de pixels para mover horizontalmente.
     *              Se for um valor positivo, move para a direita. 
     *              Se for um valor negativo, move para a esquerda.
     */
    public void moverHorizontal(int distancia) {
        apagar();
        x += distancia;
        desenhar();
    }

    /**
     * Move o triângulo verticalmente por uma 'distância' em pixels.
     * 
     * @param distancia a quantidade de pixels para mover verticalmente. 
     *               Se for um valor positivo, move para baixo. 
     *               Se for um valor negativo, move para a cima.
     */
    public void moverVertical(int distancia) {
        apagar();
        y += distancia;
        desenhar();
    }

    /**
     * Desenha o triângulo com as especificações na tela
     */
    public void desenhar() {
        Canvas canvas = Canvas.getCanvas();
        int[] xpoints = { x, x + (base / 2), x - (base / 2) };
        int[] ypoints = { y, y + altura, y + altura };
        canvas.draw(this, cor, new Polygon(xpoints, ypoints, 3));
        canvas.wait(10);
    }

    /**
     * Apaga o triângulo da tela
     */
    public void apagar() {
        Canvas canvas = Canvas.getCanvas();
        canvas.erase(this);
    }
}
