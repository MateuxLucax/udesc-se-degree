package prova2;

public class Exercicio5 {

  public static void main(String[] args) {
    int[][] matriz = new int[6][6];
    int soma = 0;

    for (int lin = 0; lin < matriz.length; lin++) {
      for (int col = 0; col < matriz[0].length; col++) {
        matriz[lin][col] = 1;
      }
    }

    for (int lin = 0; lin < matriz[0].length / 2; lin++) {
      for (int col = matriz[0].length / 2; col < matriz[0].length; col++) {
        soma += matriz[lin][col];
      }
    }

    for (int lin = matriz[0].length / 2; lin < matriz[0].length; lin++) {
      for (int col = matriz[0].length / 2; col < matriz[0].length; col++) {
        soma += matriz[lin][col];
      }
    }

    System.out.println("Sum: " + soma);

    for (int lin = 0; lin < matriz.length; lin++) {
      for (int col = 0; col < matriz[lin].length; col++) {
        System.out.print(matriz[lin][col] + " ");
      }
      System.out.println();
    }

  }

}
