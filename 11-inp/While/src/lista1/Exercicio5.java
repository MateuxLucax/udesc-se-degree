package lista1;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio5 {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    DecimalFormat df = new DecimalFormat("0.##");

    double maiorConsumo = -1;
    double menorConsumo = 1000000.0;
    double totalResidencial = 0;
    double totalComercial = 0;
    double totalIndustrial = 0;
    int cont = 0;

    System.out.print("Informe o valor do KW/h -> ");
    double valorKWh = scanner.nextDouble();

    while (true) {
      cont++;
      System.out.println("Informe o tipo de consumidor [1] Residencial [2] Comercial [3] Industrial");
      int tipo = scanner.nextInt();
      System.out.print("Informe a quantidade de kW consumida no mes -> ");
      double KwMes = scanner.nextDouble();

      if (KwMes > maiorConsumo)
        maiorConsumo = KwMes;

      if (KwMes < menorConsumo)
        menorConsumo = KwMes;

      switch (tipo) {
        case 1:
          totalResidencial += KwMes;
          break;
        case 2:
          totalComercial += KwMes;
          break;
        case 3:
          totalIndustrial += KwMes;
          break;
        default:
          System.out.println("opção inválida");
          break;
      }

      System.out.println("Total a pagar: " + valorKWh * KwMes);

      System.out.print("Calcular novo consumo? (s/n)");
      String aux = scanner.next();
      if (aux.equalsIgnoreCase("n"))
        break;
      else
        continue;
    }
    System.out.println("");
    System.out.println("");
    System.out.println("####### TOTAIS GERAIS #######");
    System.out.println("Maior consumo: " + maiorConsumo + "Kw");
    System.out.println("Menor consumo: " + menorConsumo + "Kw");
    System.out.println("Total de consumo: ");
    System.out.println("                  Residencial: " + totalResidencial);
    System.out.println("                  Comercial: " + totalComercial);
    System.out.println("                  Industrial: " + totalIndustrial);
    System.out.println(
        "M�dia geral de consumo: " + df.format((totalResidencial + totalComercial + totalIndustrial) / cont) + "Kw");

    scanner.close();
  }

}
