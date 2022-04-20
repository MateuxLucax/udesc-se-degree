package prova1;

import java.util.Scanner;

public class Exercicio5 {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    String continuarPrograma = "Sim";
    int banana, sucoLimao, acucar, manteiga;
    int totalBanana = 0;
    int totalSucoLimao = 0;
    int totalAcucar = 0;
    int totalManteiga = 0;

    System.out.println("Verificador de receita de banana 2000!!!");
    System.out.println("----------------------------------------");

    while (!continuarPrograma.equalsIgnoreCase("nao")) {
      System.out.println("Informe a quantidade de kg de banana branca ou caturra necessários: ");
      banana = scanner.nextInt();
      totalBanana += banana;

      System.out.println("Informe a quantidade de colheres de sopa de suco de limão necessárias: ");
      sucoLimao = scanner.nextInt();
      totalSucoLimao += sucoLimao;

      System.out.println("Informe a quantidade de gramas de açucar cristal necessários: ");
      acucar = scanner.nextInt();
      totalAcucar += acucar;

      System.out.println("Informe a quantidade de gramas de manteiga necessários: ");
      manteiga = scanner.nextInt();
      totalManteiga += manteiga;

      if (banana == 1 && (sucoLimao >= 2 && sucoLimao <= 4) && (acucar >= 800 && acucar <= 900)
          && (manteiga >= 100 && manteiga <= 120))
        System.out.println("RECEITA CORRETA");
      else
        System.out.println("RECEITA INCORRETA");

      System.out.println("Deseja continuar o programa? Para finalizar o programa, informe nao");
      continuarPrograma = scanner.next();
      System.out.println("----------------------------------------");
    }

    System.out.println("Total de ingredientes necessários para as receitas: ");
    System.out.println("----------------------------------------");
    System.out.println(totalBanana + "Kg de banana branca ou caturra.");
    System.out.println(totalSucoLimao + " colheres de sopa de de suco de limão.");
    System.out.println(totalAcucar + "g de açucar cristal.");
    System.out.println(totalManteiga + "g de manteiga.");

    scanner.close();
  }

}
