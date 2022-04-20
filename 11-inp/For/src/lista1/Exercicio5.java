package lista1;

import java.util.Scanner;

public class Exercicio5 {

  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    int quantidadePrimos = 0;

    for (int i = 0; i < 5; i++) {
      System.out.println("Digite um número inteiro:");
      int numero = scanner.nextInt();

      if (verificaPrimo(numero))
        quantidadePrimos++;
    }

    if (quantidadePrimos != 0)
      System.out.println("A quantidade de números primos informados foi: " + quantidadePrimos);

    scanner.close();

  }

  private static boolean verificaPrimo(int numero) {
    for (int j = 2; j < (numero / 2) + 1; j++) {
      if (numero % j == 0)
        return false;
    }
    return true;
  }

}