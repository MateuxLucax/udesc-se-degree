package prova3;

public class Exercicio3 {

  public static void main(String[] args) {
    System.out.println("so = " + sequenciaOscilante(15));
    System.out.println("so = " + sequenciaOscilante(10));
  }

  private static String sequenciaOscilante(int n) {
    String seq = "";
    boolean neg = true;
    for (int i = 1; i <= n; i++) {
      if (!neg)
        seq += i + ",";
      else
        seq += i * (-1) + ",";
      neg = (neg) ? false : true;
    }
    return seq;
  }

}