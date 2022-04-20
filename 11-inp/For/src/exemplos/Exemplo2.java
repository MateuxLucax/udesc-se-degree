package exemplos;

import java.util.Scanner;

public class Exemplo2 {

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    double soma = 0;

    System.out.println("Informe a quantidade de notas do aluno: ");
    int quant = scan.nextInt();

    if (quant >= 1) {
      for (int i = 1; i <= quant; i++) {
        System.out.println("Informe a nota " + 1);
        double nota = scan.nextDouble();
        soma += nota;
      }

      System.out.println("A média é: " + soma / quant);
    } else
      System.out.println("É necessário informar notas!");

    scan.close();
  }

}