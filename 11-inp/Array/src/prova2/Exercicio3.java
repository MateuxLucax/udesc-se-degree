package prova2;

public class Exercicio3 {
  public static void main(String[] args) {

    int[] lista = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

    for (int i = 0; i < lista.length / 2; i++) {
      int aux = lista[(lista.length - 1) - i];
      lista[(lista.length - 1) - i] = lista[i];
      lista[i] = aux;
    }

    for (int i = 0; i < lista.length; i++)
      System.out.println(lista[i]);

  }
}
