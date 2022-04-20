package lista1;

import java.util.Scanner;

public class Questao7 {

	public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        
        int valor;
        String mensagem;

        mensagem = "";
        
        System.out.println("Digite um valor inteiro:");
        valor = scan.nextInt();

        if (valor % 2 == 0) {
            mensagem = "Par";
        } else {
            mensagem = "Ímpar";
        }

        System.out.println("O valor informado é: " + mensagem);

        scan.close();
        
	}
	
}