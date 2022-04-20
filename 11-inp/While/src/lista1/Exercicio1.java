package lista1;

import java.util.Scanner;

public class Exercicio1 {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    String binario = "";

    System.out.println("Converter numero?");
    String opcao = scanner.next();

    while (opcao.equalsIgnoreCase("S")) {
      System.out.println("Informe uma valor inteiro positivo");
      int num = scanner.nextInt();

      binario = "";

      while (num >= 2) {
        int resto = num % 2;
        binario = resto + binario;
        num = num / 2;
      }

      binario = num + binario;
      System.out.println(binario);
      System.out.println("Converter numero?");
      opcao = scanner.next();
    }

    scanner.close();
  }

}
