package lista1;

import java.util.Scanner;

public class Exercicio3 {

  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    int somaInteiros = 0;
    int quantidadeInteiros = 0;
    int numerosNegativos = 0;
    int entreCincoCinquenta = 0;

    for (int i = 0; i < 10; i++) {
      System.out.println("Digite um número inteiro: ");
      int numero = scanner.nextInt();

      if (numero > 0) {
        somaInteiros += numero;
        quantidadeInteiros++;
        if (numero >= 5 && numero <= 50)
          entreCincoCinquenta++;
      }

      else if (numero < 0)
        numerosNegativos++;
    }

    if (somaInteiros != 0)
      System.out.println("Média dos valores positivos: " + (somaInteiros / quantidadeInteiros));

    if (entreCincoCinquenta != 0)
      System.out.println("Quantidade de números entre 5 e 50: " + entreCincoCinquenta);

    if (numerosNegativos != 0)
      System.out.println("Média dos valores positivos: " + numerosNegativos);

    scanner.close();

  }

}