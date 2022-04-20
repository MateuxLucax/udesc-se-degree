package lista2;

import java.util.Scanner;

public class Questao1 {

  /*
   * Escreva um programa que leia as três notas de um aluno, calcule e escreva a
   * sua média. Este programa deverá permitir escolher o tipo de média a ser
   * aplicada que será média aritmética simples ou média ponderada. Se a escolha
   * for média ponderada o programa deverá requisitar os pesos respectivos de cada
   * nota.
   */

  public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);

    float nota1, nota2, nota3, media;

    media = 0;

    System.out.println("Informe a primeira nota:");
    nota1 = scan.nextFloat();

    System.out.println("Informe a segunda nota:");
    nota2 = scan.nextFloat();

    System.out.println("Informe a terceira nota:");
    nota3 = scan.nextFloat();

    scan.nextLine();
    System.out.println("Informe o tipo da média (Aritimetica ou Ponderada): ");
    String tipoMedia = scan.nextLine();

    if (tipoMedia.equals("Aritimetica"))
      media = (nota1 + nota2 + nota3) / 3;

    if (tipoMedia.equals("Ponderada")) {
      System.out.println("Informe o peso da primeira nota (" + nota1 + "): ");
      float peso1 = scan.nextInt();

      System.out.println("Informe o peso da primeira nota (" + nota2 + "): ");
      float peso2 = scan.nextInt();

      System.out.println("Informe o peso da primeira nota (" + nota3 + "): ");
      float peso3 = scan.nextInt();

      media = ((nota1 * peso1) + (nota2 * peso2) + (nota3 + peso3)) / 3;
    }

    System.out.println("Sua média é: " + media);

    scan.close();
  }
}