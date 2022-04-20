package prova1;

public class Exercicio4 {

  public static void main(String[] args) {

    int valor1 = 23;
    int valor2 = 2;
    int valor3 = 44;
    int intermediario = 0;

    // Verifica se o primeiro valor é maior que o segundo valor, porém menor que o
    // terceiro valor, ou se o primeiro valor é maior que o terceiro valor, porém
    // menor que o segundo valor
    if ((valor1 >= valor2 && valor1 <= valor3) || (valor1 >= valor3 && valor1 <= valor2))
      intermediario = valor1;

    // Verifica se o segundo valor é maior que o terceiro valor, porém menor que o
    // primeiro valor, ou se o segundo valor é maior que o primeiro valor, porém
    // menor que o terceiro valor
    else if ((valor2 >= valor3 && valor2 <= valor1) || (valor2 >= valor1 && valor2 <= valor3))
      intermediario = valor2;

    // Verifica se o terceiro valor é maior que o primeiro valor, porém menor que o
    // segundo valor, ou se o terceiro valor é maior que o segundo valor, porém
    // menor que o primeiro valor
    else if ((valor3 >= valor1 && valor3 <= valor2) || (valor3 >= valor2 && valor3 <= valor1))
      intermediario = valor3;

    // Verifica se o resto da divisão por 2 do valor intermediário é igual a 0
    if (intermediario % 2 == 0)
      System.out.println("Par");
    else
      System.out.println("Ímpar");

  }
}