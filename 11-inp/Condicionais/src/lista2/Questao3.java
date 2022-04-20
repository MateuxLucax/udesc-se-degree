package lista2;

import java.util.Scanner;

public class Questao3 {

  /*
   * Elabore o programa Converte1. Este programa deverá ler a idade de uma pessoa
   * expressa em anos, meses e dias e mostre-a expressa apenas em dias.
   */

  public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);

    int anos, meses, dias, total;

    System.out.println("Informe quantos anos de vida você tem:");
    anos = scan.nextInt();

    System.out.println("Informe os meses:");
    meses = scan.nextInt();

    System.out.println("Informe os dias:");
    dias = scan.nextInt();

    total = (anos * 365) + (meses * 30) + dias;

    System.out.println("Você possui " + total + " dias de vida!");

    scan.close();
  }
}