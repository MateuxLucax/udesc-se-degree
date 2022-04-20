package atividade;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Consumo {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    DecimalFormat df = new DecimalFormat("0.##");

    double maiorConsumo = 0;
    double menorConsumo = 0;
    double totalResidencial = 0;
    double totalComercial = 0;
    double totalIndustrial = 0;
    int qtdMaior500 = 0;
    int contador = 0;

    System.out.print("Informe o valor do Kw/h: ");
    double valorKwh = scanner.nextDouble();

    System.out.println("\n================================\n");

    while (true) {

      System.out.println("Informe o tipo de consumidor: [1] Residencial [2] Comercial [3] Industrial: ");
      int tipoCosumo = scanner.nextInt();

      if (tipoCosumo != 1 && tipoCosumo != 2 && tipoCosumo != 3)
        System.out.println("Opção inválida!");

      else {
        System.out.print("Informe a quantidade de kW consumida durante o mês: ");
        double consumoMes = scanner.nextDouble();

        if (contador == 1) {
          menorConsumo = consumoMes;
          maiorConsumo = consumoMes;
        }

        if (consumoMes > maiorConsumo)
          maiorConsumo = consumoMes;

        if (consumoMes < menorConsumo)
          menorConsumo = consumoMes;

        switch (tipoCosumo) {
          case 1:
            totalResidencial += consumoMes;
            if ((consumoMes * valorKwh) > 500)
              qtdMaior500++;
            break;
          case 2:
            totalComercial += consumoMes;
            break;
          case 3:
            totalIndustrial += consumoMes;
            break;
        }

        System.out.println("Total à pagar: " + (consumoMes * valorKwh));
      }

      System.out.print("Calcular novo consumo? (sim/nao): ");
      String continuar = scanner.next();

      System.out.println("\n================================\n");

      if (continuar.equalsIgnoreCase("nao"))
        break;
      else {
        contador++;
        continue;
      }
    }

    System.out.println("Dados gerais:");
    System.out.println("Maior consumo: " + maiorConsumo + "Kw/h");
    System.out.println("Menor consumo: " + menorConsumo + "Kw/h");
    System.out.println("Total de consumo: ");
    System.out.println("[1]Residencial: " + df.format(totalResidencial) + "Kw/h");
    System.out.println("[2]Comercial: " + df.format(totalComercial) + "Kw/h");
    System.out.println("[3]Industrial: " + df.format(totalIndustrial) + "Kw/h");
    System.out.println("Média geral de consumo: "
        + df.format((totalResidencial + totalComercial + totalIndustrial) / contador) + "Kw/h");
    if (qtdMaior500 > 0)
      System.out
          .println("Quantidade de clientes do tipo [1]Residencial que consumiram mais de R$ 500,00: " + qtdMaior500);

    scanner.close();
  }

}
