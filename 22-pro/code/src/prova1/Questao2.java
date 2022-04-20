package prova1;

import java.util.Scanner;
import java.lang.Math;
import java.text.DecimalFormat;

public class Questao2 {
  public static void main(String[] args) throws Exception {
    Scanner scanner = new Scanner(System.in);
    scanner.useDelimiter("\n");
    DecimalFormat decimalFormat = new DecimalFormat("0.00");

    int i = scanner.nextInt();
    double x = scanner.nextDouble();
    double y = scanner.nextDouble();

    double result = 0;

    switch (i) {
      case 1:
        result = (3 * Math.pow(x, 2)) + (5 * y) - 7;
        break;

      case 2:
        double largest = Double.MIN_VALUE;
        double smallest = Double.MAX_VALUE;

        if (y > largest)
          largest = y;
        if (x > largest)
          largest = x;

        if (y < smallest)
          smallest = y;
        if (x < smallest)
          smallest = x;

        result = largest - smallest;
        break;

      case 3:
        result = Math.sqrt((Math.pow(x, 2) + Math.pow(y, 2)));
        break;

      default:
        System.out.println("Tente novamente");
        break;
    }

    if (result != 0)
      System.out.println(decimalFormat.format(result));

    scanner.close();
  }
}
