package lista2;

import java.util.*;

public class Questao6 {

  /*
   * Escreva o programa Triangulo. Este programa, com base nas medidas lidas,
   * deverá indicar se o triângulo informado é um triângulo retângulo. Caso as
   * medidas informadas não formem um triângulo o programa deverá emitir uma
   * mensagem específica informado a não validade das medidas
   */

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    System.out.println("Informe a medida do cateto oposto: ");
    double cOposto = scan.nextInt();

    System.out.println("Informe a medida do cateto adjacente: ");
    double cAdjacente = scan.nextInt();

    System.out.println("Informe a medida da hipotenusa: ");
    double hipotenusa = scan.nextInt();

    if (Math.pow(hipotenusa, 2) == (Math.pow(cOposto, 2) + Math.pow(cAdjacente, 2)))
      System.out.println("Triangulo retângulo!");
    else
      System.out.println("Não é triangulo retângulo!");

    scan.close();
  }
}