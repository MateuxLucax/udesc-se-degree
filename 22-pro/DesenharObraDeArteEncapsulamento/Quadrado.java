import java.awt.Rectangle;

/**
 * Um quadrado que pode ser manipulado e se desenha em uma tela.
 * 
 * Adaptado do exemplo originalmente publicado no livro: "Programação Orientada
 * a Objetos com Java: Uma Introdução Prática Utilizando o Blue J" dos autores
 * Michael Kölling and David J. Barnes.
 */
public class Quadrado {
  private String cor; // A cor do quadrado. As cores aceitas são (todas em inglês): "red", "yellow",
  // "blue", "green", "magenta" e "black".
  private int lado; // A medida do lado do quadrado
  private int x; // A posição X do quadrado na tela
  private int y; // A posição Y do quadrado na tela

  public Quadrado(String cor, int lado) {
    this.cor = cor;
    this.lado = lado;
  }

  public Quadrado(String cor, int lado, int x, int y) {
    this.cor = cor;
    this.lado = lado;
    this.x = x;
    this.y = y;
  }

  public void setCor(String cor) {
    this.cor = cor;
  }

  public String getCor() {
    return this.cor;
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

  public int getX() {
    return this.x;
  }

  public int getY() {
    return this.y;
  }

  /**
   * Move o quadrado horizontalmente por uma 'distância' em pixels.
   * 
   * @param distancia a quantidade de pixels para mover horizontalmente. Se for um
   *                  valor positivo, move para a direita. Se for um valor
   *                  negativo, move para a esquerda.
   */
  public void moverHorizontal(int distancia) {
    apagar();
    x += distancia;
    desenhar();
  }

  /**
   * Move o quadrado verticalmente por uma 'distância' em pixels.
   * 
   * @param distancia a quantidade de pixels para mover verticalmente. Se for um
   *                  valor positivo, move para baixo. Se for um valor negativo,
   *                  move para cima.
   */
  public void moverVertical(int distancia) {
    apagar();
    y += distancia;
    desenhar();
  }

  /**
   * Desenha o quadrado com as especificações na tela
   */
  public void desenhar() {
    Canvas canvas = Canvas.getCanvas();
    canvas.draw(this, cor, new Rectangle(x, y, lado, lado));
    canvas.wait(10);
  }

  /**
   * Apaga o quadrado da tela
   */
  public void apagar() {
    Canvas canvas = Canvas.getCanvas();
    canvas.erase(this);
  }
}
