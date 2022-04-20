package prova1;

import java.util.Scanner;

public class Questao5 {
  public static void main(String[] args) throws Exception {
    Scanner scanner = new Scanner(System.in);
    scanner.useDelimiter("\n");

    int n = scanner.nextInt();

    int[] sequence = new int[n];

    for (int i = 0; i < sequence.length && i < 3; i++) {
      sequence[i] = i;
    }
    if (n > 3) {
      for (int i = 3; i < sequence.length; i++) {
        sequence[i] = sequence[i - 1] + sequence[i - 3];
      }
    }

    System.out.println(sequence[sequence.length - 1]);

    scanner.close();
  }
}
