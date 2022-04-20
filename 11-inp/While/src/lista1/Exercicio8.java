package lista1;

import java.util.Scanner;

public class Exercicio8 {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Informe o valor m�ximo da s�rie fibonacci");
    int valorMaximo = scanner.nextInt();

    System.out.print("1 ");
    int termoAntAnt = 0;
    int termoAnt = 1;
    int termoCorr = 0;
    while (termoCorr < valorMaximo) {
      termoCorr = termoAnt + termoAntAnt;
      System.out.print(termoCorr + " ");

      termoAntAnt = termoAnt;
      termoAnt = termoCorr;
    }

    scanner.close();
  }
}
