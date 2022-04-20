package lista2;

import java.util.*;

public class Questao7 {

  /*
   * Escreva o programa Triangulo. Este programa, com base nas medidas lidas,
   * deverá indicar se o triângulo informado é um triângulo retângulo. Caso as
   * medidas informadas não formem um triângulo o programa deverá emitir uma
   * mensagem específica informado a não validade das medidas
   */

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    System.out.println("Informe os valores referentes ao ponto 1:");
    System.out.print("Informe x1:");
    double dx1 = scan.nextDouble();
    System.out.print("Informe y1:");
    double dy1 = scan.nextDouble();
    System.out.println("Agora Informe os valores referentes ao ponto 2:");
    System.out.print("Informe x2:");
    double dx2 = scan.nextDouble();
    System.out.print("Informe y2:");
    double dy2 = scan.nextDouble();

    if (dx1 < dx2) {
      double distancia = Math.sqrt(Math.pow((dx2 - dx1), 2) + Math.pow((dy2 - dy1), 2));
      System.out.println("A distancia entre os dois pontos é: " + distancia);
    } else
      System.out.println("Não possivel calcular pois P1 > P2!");

    scan.close();
  }
}