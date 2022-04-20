package atividade;

import java.util.Scanner;

public class FatorialImpar {

  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    System.out.println("Digite um número inteiro positivo:");
    int numero = scanner.nextInt();

    scanner.close();

    if (numero >= 1) {
      int resultado = fatorial(numero);
      if (resultado % 2 != 0)
        System.out.println("O fatorial de " + numero + "! é impar, e seu resultado é: " + resultado);
    } else
      System.out.println("O número informado não é positivo. Por favor, tente novamente e insira um número positivo.");

  }

  private static int fatorial(int numero) {
    int fatorial = 1;

    for (int i = 1; i <= numero; i++) {
      fatorial *= i;
    }

    return fatorial;
  }

}