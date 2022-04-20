package lista2;

import java.util.Scanner;

/* Elabore o programa Extenso. Este programa deve ler a idade de uma pessoa e escrever sua idade por extenso.*/

public class Questao2 {

  public static void main(String[] args) {

    String[] unidade = { "zero", "um", "dois", "tres", "quatro", "cinco", "seis", "sete", "oito", "nove" };
    String[] casaDez = { "dez", "onze", "doze", "treze", "quatorze", "quinze", "dezesseis", "dezessete", "dezoito",
        "dezenove" };
    String[] dezenas = { "vinte", "trinta", "quarenta", "cinquenta", "sessenta", "setenta", "oitenta", "noventa" };

    Scanner scan = new Scanner(System.in);
    System.out.println("Informe a idade da pessoa: ");
    int idade = scan.nextInt();
    String idadeExtenso = "";

    if (idade >= 0 && idade <= 9)
      idadeExtenso = unidade[idade];
    else if (idade >= 10 && idade <= 19)
      idadeExtenso = casaDez[idade - 10];
    else if (idade >= 20 && idade <= 99) {
      int tempId = idade / 10;
      int tempUn = idade - (tempId * 10);

      if (idade % 10 == 0)
        idadeExtenso = dezenas[tempId - 2];
      else
        idadeExtenso = dezenas[tempId - 2] + " e " + unidade[tempUn];
    }

    System.out.println("Idade: " + idade + " ( " + idadeExtenso + " " + ((idade == 1) ? "ano" : "anos") + " )");

    scan.close();
  }
}