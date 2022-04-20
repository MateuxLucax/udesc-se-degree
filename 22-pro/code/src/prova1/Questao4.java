package prova1;

import java.util.Scanner;
import java.lang.Math;
import java.text.DecimalFormat;

public class Questao4 {
  public static void main(String[] args) throws Exception {
    Scanner scanner = new Scanner(System.in);
    scanner.useDelimiter(";");
    DecimalFormat decimalFormat = new DecimalFormat("0.00");

    String method = scanner.next();

    switch (method) {
      case "piramide":
        double length = scanner.nextDouble();
        double width = scanner.nextDouble();
        double height = scanner.nextDouble();
        double result = volumePiramide(length, width, height);
        System.out.println(decimalFormat.format(result));
        break;
      case "esfera":
        double radius = scanner.nextDouble();
        result = volumeEsfera(radius);
        System.out.println(decimalFormat.format(result));
        break;
    }

    scanner.close();
  }

  private static double volumePiramide(double length, double width, double height) {
    double result = (length * width * height) / 3;
    return result;
  }

  private static double volumeEsfera(double radius) {
    double result = (4 * Math.PI * Math.pow(radius, 3)) / 3;
    return result;
  }
}
