package lista1;

import java.util.Scanner;

public class Exercicio1 {

  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    System.out.println("Informe a tabuada que deseja calcular");
    int base = scanner.nextInt();

    for (int i = 1; i <= 10; i++) {
      System.out.println(i + " x " + base + " = " + (i * base));
    }

    scanner.close();

  }

}