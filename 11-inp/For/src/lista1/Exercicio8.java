package lista1;

import java.util.Scanner;

public class Exercicio8 {

  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    int bom = 0;
    int exemplar = 0;

    for (int i = 0; i < 20; i++) {
      System.out.println("Digite um número inteiro:");
      int nota = scanner.nextInt();

      if (nota >= 7 && nota <= 7.9)
        bom++;

      if (nota >= 9 && nota <= 10)
        exemplar++;
    }

    System.out.println("Quantidade de alunos com bom desempenho: " + bom
        + "%. E o percentual de alunos com desempenho exemplar foi: " + calculaPercentual(exemplar, 50) + "%");

    scanner.close();

  }

  private static float calculaPercentual(int parcial, int total) {
    float percentual = (parcial * 100) / total;

    return percentual;
  }

}