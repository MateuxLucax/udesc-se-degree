import java.util.Scanner;

public class Exemplo1 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int[] listaNumeros = new int[5];

    int maiorValor = 0;
    int menorValor = 0;
    int qtdImpares = 0;

    for (int i = 0; i < listaNumeros.length; i++) {
      System.out.println("Informe um valor inteiro para a posição de indíce: " + i);
      listaNumeros[i] = scanner.nextInt();

      if (listaNumeros[i] % 2 != 0)
        qtdImpares++;

      if (i == 0) {
        maiorValor = listaNumeros[i];
        menorValor = listaNumeros[i];
      } else {
        if (listaNumeros[i] > maiorValor)
          maiorValor = listaNumeros[i];

        else if (listaNumeros[i] < menorValor)
          menorValor = listaNumeros[i];
      }

    }

    System.out.println("O maior valor é: " + maiorValor);
    System.out.println("O menor valor é: " + menorValor);
    System.out.println("A quantidade de ímpares é: " + qtdImpares);

    scanner.close();
  }
}
