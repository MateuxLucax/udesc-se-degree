package lista1;

public class Exercicio2 {

  public static void main(String[] args) {

    float farenheit = 1;
    float celsius = 0;

    while (farenheit <= 150) {

      celsius = (farenheit - 32) * 5 / 9;

      System.out.println("Temperatura em Farenheit: " + farenheit + "°F | Temperatura em Celsius: " + celsius + "°C");
      farenheit++;
    }

  }

}