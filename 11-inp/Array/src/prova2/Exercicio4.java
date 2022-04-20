package prova2;

import java.util.Scanner;

public class Exercicio4 {

  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    int[] values = new int[10];
    boolean isSequentialOrder = false;

    System.out.println("Input integers numbers in sequencial order:");

    for (int i = 0; i < 10; i++)
      values[i] = scanner.nextInt();

    int previousValue = values[0];

    for (int i = 1; i < values.length; i++) {
      if (previousValue != values[i] - 1) {
        isSequentialOrder = true;
        break;
      }
    }
      
    System.out.println(isSequentialOrder ? "Valid" : "Invalid");

    scanner.close();

  }

}
