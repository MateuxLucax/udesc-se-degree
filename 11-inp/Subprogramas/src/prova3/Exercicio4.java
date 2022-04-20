package prova3;

public class Exercicio4 {

  private static double calcula(String[] array1, String[] array2) {
    double cont = 0;
    for (int i = 0; i < array1.length; i++) {
      for (int x = 0; x < array2.length; x++) {
        if (array1[i].equalsIgnoreCase(array2[x]))
          cont++;
      }
    }

    return (cont / array1.length) * 100;
  }

  public static void main(String[] args) {
    String[] array1 = { "A", "C", "D", "F", "H", "L", "M", "R", "T", "V" };
    String[] array2 = { "A", "C", "W", "F", "H", "Y", "M", "K", "T", "Q" };

    System.out.println("Resultado:" + calcula(array1, array2));
  }

}