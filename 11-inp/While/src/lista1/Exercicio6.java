package lista1;

import java.util.Scanner;

public class Exercicio6 {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("PROGRAMA DE CALCULO DE RAIZ QUADRADA");
    System.out.println("INFORME UM N�MERO");
    int num = scanner.nextInt();
    int base = num;

    int impar = 1;
    int cont = 0;
    while (num > 0) {
      num = num - impar;
      impar += 2;
      cont++;
    }
    System.out.println("A RAIZ QUADRADA DE " + base + "=" + cont);

    scanner.close();
  }

}
