package lista1;

import java.util.Scanner;

public class Exercicio4 {

  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    int maior = 0;
    int menor = 0;
    int somaNumeros = 0;

    for (int i = 0; i < 500; i++) {
      System.out.println("Digite um número inteiro:");
      int numero = scanner.nextInt();

      if (i == 0) {
        maior = numero;
        menor = numero;
      }

      if (numero > maior)
        maior = numero;

      if (numero < menor)
        menor = numero;

      somaNumeros += numero;
    }

    System.out.println("Maior número: " + maior);
    System.out.println("Menor número: " + menor);
    System.out.println("Média dos números inseridos: " + (somaNumeros / 500));

    scanner.close();

  }

}