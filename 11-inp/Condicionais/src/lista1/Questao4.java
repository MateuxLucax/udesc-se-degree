package lista1;

import java.util.Scanner;

public class Questao4 {

	public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        
        int idade;
        String situacao;

        situacao = "";

        System.out.println("Informe sua idade: ");
        idade = scan.nextInt();

        if (idade < 16) {
            situacao = "Não eleitor";
        } else if (idade >= 18 && idade <= 65) {
            situacao = "Eleitor obrigatório";
        } else {
            situacao = "Eleitor facultativo";
        }

        System.out.println("A sua sitação é: " + situacao);

        scan.close();
        
	}
	
}