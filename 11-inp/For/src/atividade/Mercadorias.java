package atividade;

import java.util.Scanner;

public class Mercadorias {

  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    System.out.println("Informe a quantidade de preços que irá informar: ");
    int quantidade = scanner.nextInt();

    if (quantidade >= 1) {
      float somaAcima50 = 0;
      int quantidadeAcima50 = 0;
      int quantidadeAbaixo50 = 0;

      for (int i = 0; i < quantidade; i++) {
        System.out.println("Informe o preço da " + (i + 1) + "° mercadoria: ");
        float preco = scanner.nextFloat();

        if (preco >= 50) {
          somaAcima50 += preco;
          quantidadeAcima50++;
        } else if (preco < 50 && preco > 0) {
          quantidadeAbaixo50++;
        }
      }

      if (somaAcima50 != 0)
        System.out
            .println("A média dos preços dos mercadorias acima de R$ 50,00 é: " + (somaAcima50 / quantidadeAcima50));
      if (quantidadeAbaixo50 != 0)
        System.out.println("A quantidade de mercadorias com valor abaixo de R$ 50,00 é: " + quantidadeAbaixo50);
    } else
      System.out.println("Número informado inválido. Tente novamente");

    scanner.close();

  }

}