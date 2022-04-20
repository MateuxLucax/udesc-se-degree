package lista1;

import java.util.Scanner;

public class Exercicio2 {

  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    int quantidadeNegativos = 0;

    for (int i = 0; i < 5; i++) {
      System.out.println("Informe um número inteiro: ");
      int numero = scanner.nextInt();
      if (numero < 0)
        quantidadeNegativos++;
    }

    if (quantidadeNegativos != 0)
      System.out.println("Você digitou " + quantidadeNegativos + " números negativos.");

    scanner.close();

  }

}