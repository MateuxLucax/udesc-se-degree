package prova1;

import java.util.Scanner;

public class Questao3 {
  public static void main(String[] args) throws Exception {
    Scanner scanner = new Scanner(System.in);
    scanner.useDelimiter(";");

    long[][] matrix = new long[4][3];
    long thirdColumnNumbersSum = 0;
    long EvenRowsNumbersSum = 0;
    long OddNumberSum = 0;
    long EvenNumbersQuantity = 0;

    for (int i = 0; i < matrix.length; i++) {
      for (int j = 0; j < matrix[0].length; j++) {
        matrix[i][j] = scanner.nextInt();
      }
      scanner.nextLine();
    }

    for (int i = 0; i < matrix.length; i++) {
      thirdColumnNumbersSum += matrix[i][2];
    }

    for (int i = 1; i < matrix.length; i += 2) {
      for (int j = 0; j < matrix[0].length; j++) {
        EvenRowsNumbersSum += matrix[i][j];
      }
    }

    for (int i = 0; i < matrix.length; i++) {
      for (int j = 0; j < matrix[0].length; j++) {
        if (matrix[i][j] % 2 != 0)
          OddNumberSum += matrix[i][j];

        if (matrix[i][j] % 2 == 0)
          EvenNumbersQuantity++;
      }
    }

    System.out.println(thirdColumnNumbersSum);
    System.out.println(EvenRowsNumbersSum);
    System.out.println(OddNumberSum);
    System.out.println(EvenNumbersQuantity);

    scanner.close();
  }
}