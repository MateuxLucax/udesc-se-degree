package lista1;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exemplo {

  public static void main(String[] args) {
    DecimalFormat d = new DecimalFormat("R$ #0.00");
    Scanner scanner = new Scanner(System.in);

    double maiorValor = -1;
    double menorValor = 9999999;
    double totalIndustrial = 0;
    double totalComercial = 0;
    double totalResidencial = 0;
    double consumoGeral = 0;
    int cont = 0;

    System.out.println("Informe o pre�o do Kw/h");
    double preco = scanner.nextDouble();

    System.out.println("Deseja calcular consumo? S/N");
    String continua = scanner.next();

    while (continua.equalsIgnoreCase("S")) {
      /////////////////////////////////////////////////
      System.out.println("Informe o c�digo de consumidor");
      String cod = scanner.next();

      System.out.println("Informe o tipo de consumidor [1-Industrial 2-Comercial 3-Residencial]");
      int tipo = scanner.nextInt();

      System.out.println("Informe o consumo em Kw");
      double consumo = scanner.nextInt();

      // a
      double valorPagar = preco * consumo;
      System.out.println("O valor a pagar é : " + d.format(valorPagar));

      // b
      if (valorPagar > maiorValor)
        maiorValor = valorPagar;

      // c
      if (valorPagar < menorValor)
        menorValor = valorPagar;

      // d
      if (tipo == 1)
        totalIndustrial += valorPagar;
      else if (tipo == 2)
        totalComercial += valorPagar;
      else
        totalResidencial += valorPagar;

      // e
      // consumoGeral += valorPagar;
      consumoGeral = consumoGeral + valorPagar;
      // cont++;
      // cont = cont +1;
      cont += 1;

      /////////////////////////////////////////////////

      System.out.println("Deseja calcular novo consumo? S/N");
      continua = scanner.next();
    }
    System.out.println("Maior valor a pagar (maior consumo): " + d.format(maiorValor));
    System.out.println("Menor valor a pagar (menor consumo): " + d.format(menorValor));

    System.out.println("Total consumo industrial: " + d.format(totalIndustrial));
    System.out.println("Total consumo comercial: " + d.format(totalComercial));
    System.out.println("Total consumo residencia: " + d.format(totalResidencial));

    System.out.println("A media geral de consumo �: " + d.format(consumoGeral / cont));

    System.out.println("FIM");

    scanner.close();
  }

}
