package lista1;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio4 {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    DecimalFormat df = new DecimalFormat("0.##");

    int codigoMaior = -1;
    double maiorIndice = -1;

    System.out.println("Informe o nome do curso ('x' para terminar) ");
    String curso = scanner.nextLine();
    while (!curso.equalsIgnoreCase("x")) {
      System.out.print("Informe o codigo do curso -> ");
      int codigo = Integer.parseInt(scanner.nextLine());
      System.out.print("Informe o numero de vagas -> ");
      int vagas = Integer.parseInt(scanner.nextLine());
      System.out.print("Informe o numero de candidatos do sexo feminino -> ");
      int candFem = Integer.parseInt(scanner.nextLine());
      System.out.print("Informe o numero de candidatos do sexo masculino -> ");
      int candMas = Integer.parseInt(scanner.nextLine());

      double percFem = ((double) (candFem) / (double) (candFem + candMas)) * 100;
      double indiceGeral = (double) (candFem + candMas) / (double) vagas;
      if (indiceGeral > maiorIndice) {
        maiorIndice = indiceGeral;
        codigoMaior = codigo;
      }

      System.out.println("Candidatos por vaga == " + df.format(indiceGeral) + "\nCurso: " + codigo
          + ". Porcentagem do sexo feminino == " + df.format(percFem) + "%");
      System.out.println("Informe o nome do curso ('x' para terminar) ");
      curso = scanner.nextLine();
    }
    System.out.println("Curso com maior numero de candidatos por vaga: " + codigoMaior + " Indice: " + maiorIndice);

    scanner.close();
  }

}
