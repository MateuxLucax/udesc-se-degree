package lista2;

import java.util.Scanner;

public class Questao5 {

  /*
   * Elabore o programa Ordena. Este programa deverá ler três valores inteiros de
   * forma aleatória. Em seguida este programa deverá dar a opção de impressão dos
   * números lidos em ordem crescente ou decrescente à escolha do usuário.
   */

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    System.out.println("Informe o valor 1");
    int v1 = scan.nextInt();

    System.out.println("Informe o valor 2");
    int v2 = scan.nextInt();

    System.out.println("Informe o valor 3");
    int v3 = scan.nextInt();

    /////////////////////////////////////////

    System.out.println("Qual a forma de ordenação? CRESCENTE DECRESCENTE");
    String opcao = scan.next();

    if (opcao.equalsIgnoreCase("Crescente")) {
      if (v1 <= v2 && v2 <= v3)
        System.out.println(v1 + ", " + v2 + ", " + v3);
      else if (v1 <= v3 && v3 <= v2)
        System.out.println(v1 + ", " + v3 + ", " + v2);
      else if (v2 <= v3 && v3 <= v1)
        System.out.println(v2 + ", " + v3 + ", " + v1);
      else if (v2 <= v1 && v1 <= v3)
        System.out.println(v2 + ", " + v1 + ", " + v3);
      else if (v3 <= v1 && v1 <= v2)
        System.out.println(v3 + ", " + v1 + ", " + v2);
      else if (v3 <= v2 && v2 <= v1)
        System.out.println(v3 + ", " + v2 + ", " + v1);

    } else if (opcao.equalsIgnoreCase("Decrescente")) {
      if (v1 >= v2 && v2 >= v3)
        System.out.println(v1 + ", " + v2 + ", " + v3);
      else if (v1 >= v3 && v3 >= v2)
        System.out.println(v1 + ", " + v3 + ", " + v2);
      else if (v2 >= v3 && v3 >= v1)
        System.out.println(v2 + ", " + v3 + ", " + v1);
      else if (v2 >= v1 && v1 >= v3)
        System.out.println(v2 + ", " + v1 + ", " + v3);
      else if (v3 >= v1 && v1 >= v2)
        System.out.println(v3 + ", " + v1 + ", " + v2);
      else if (v3 >= v2 && v2 >= v1)
        System.out.println(v3 + ", " + v2 + ", " + v1);
    } else
      System.out.println("Opção inválida!");

    scan.close();
  }
}