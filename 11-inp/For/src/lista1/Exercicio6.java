package lista1;

import java.util.Scanner;

public class Exercicio6 {

  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    System.out.println("Digite um número inteiro:");
    int numero = scanner.nextInt();

    System.out.println("O fatorial de " + numero + "! é: " + fatorial(numero));

    scanner.close();

  }

  private static int fatorial(int numero) {
    int fact = 1;

    for (int i = 1; i <= numero; i++) {
      fact *= i;
    }

    return fact;
  }

}