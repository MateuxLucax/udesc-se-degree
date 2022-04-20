package lista2;

import java.util.Scanner;

public class Questao4 {

  /*
   * Elabore o programa Converte2. Este programa deverá ler a idade de uma pessoa
   * expressa em dias e mostre-a expressa em anos, meses e dias.
   */

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    System.out.println("Informe quantos dias de vida você possui: ");
    int dias = scan.nextInt();

    int anos = 0;
    int meses = 0;

    if (dias >= 365) {
      anos = dias / 365;
      dias = dias % 365;
    }

    if (dias >= 30) {
      meses = dias / 30;
      dias = dias % 30;
    }

    if ((anos > 0) & (meses > 0) & (dias > 0))
      System.out.println("Você tem " + anos + " anos, " + meses + " meses e" + dias + " dias.");
    else if ((anos > 0) & (meses == 0) & (dias == 0))
      System.out.println("Você tem " + anos + " anos.");
    else if ((anos > 0) & (meses > 0) & (dias == 0))
      System.out.println("Você tem " + anos + " anos, " + meses + " meses.");
    else if ((anos > 0) & (meses == 0) & (dias > 0))
      System.out.println("Você tem " + anos + " anos e " + dias + " dias. ");
    else if ((anos == 0) & (meses > 0) & (dias == 0))
      System.out.println("Você tem " + meses + " meses.");
    else if ((anos == 0) & (meses > 0) & (dias > 0))
      System.out.println("Você tem " + meses + " meses e " + dias + " dias.");
    else if ((anos == 0) & (meses == 0) & (dias > 0))
      System.out.println("Você tem " + dias + " dias.");
    else
      System.out.println("Nenhum calculo foi realizado.");

    scan.close();
  }
}