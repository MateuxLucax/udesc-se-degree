import java.awt.Polygon;

/**
 * Um triângulo que pode ser manipulado e se desenha em uma tela.
 * 
 * Adaptado do exemplo originalmente publicado no livro: "Programação Orientada
 * a Objetos com Java: Uma Introdução Prática Utilizando o Blue J" dos autores
 * Michael Kölling and David J. Barnes.
 */
public class Triangulo {
  private String cor; // A cor do triângulo. As cores aceitas são (todas em inglês): "red", "yellow",
                      // "blue", "green", "magenta" e "black".
  private int altura; // A altura do triângulo
  private int base; // A base do triângulo
  private int x; // A posição X do triângulo na tela
  private int y; // A posição Y do triângulo na tela

  public Triangulo(String cor, int altura, int base) {
    this.cor = cor;
    this.altura = altura;
    this.base = base;
  }

  public Triangulo(String cor, int altura, int base, int x, int y) {
    this.cor = cor;
    this.altura = altura;
    this.base = base;
    this.x = x;
    this.y = y;
  }

  public void setCor(String cor) {
    this.cor = cor;
  }

  public String getCor() {
    return this.cor;
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

  /**
   * Move o triângulo horizontalmente por uma 'distância' em pixels.
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
   * Move o triângulo verticalmente por uma 'distância' em pixels.
   * 
   * @param distancia a quantidade de pixels para mover verticalmente. Se for um
   *                  valor positivo, move para baixo. Se for um valor negativo,
   *                  move para a cima.
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
