package lista1;

import java.util.Scanner;

public class Exercicio7 {

  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    int positivos = 0;
    int negativos = 0;

    for (int i = 0; i < 20; i++) {
      System.out.println("Digite um número inteiro:");
      int numero = scanner.nextInt();

      if (numero > 0)
        positivos++;

      if (numero < 0)
        negativos++;
    }

    System.out.println("O percentual de números positivos inseridos foi: " + calculaPercentual(positivos, 20)
        + "%. E o percentual de números negativos inseridos foi: " + calculaPercentual(negativos, 20) + "%");

    scanner.close();

  }

  private static float calculaPercentual(int parcial, int total) {
    float percentual = (parcial * 100) / total;

    return percentual;
  }

}