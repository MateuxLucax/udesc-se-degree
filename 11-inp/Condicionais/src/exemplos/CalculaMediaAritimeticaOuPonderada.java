package exemplos;

import java.util.Scanner;

public class CalculaMediaAritimeticaOuPonderada {

	public static void main(String[] args) {

		float nota1, peso1, nota2, peso2, nota3, peso3, media;
		int opcao, opcaoPonderada, opcaoAritimetica;
		String situacao;
		peso1 = 0;
		peso2 = 0;
		peso3 = 0;
		opcaoPonderada = 2;
		opcaoAritimetica = 1;
		media = 0;
		
		// Leitura da opção
		System.out.println("Digite [1] para calcular média aritimética, digite [2] para calcular média ponderada: ");
		Scanner scan = new Scanner(System.in);
		opcao = scan.nextInt();

		// Primeira nota
		System.out.println("Informe a primeira nota: ");
		nota1 = scan.nextFloat();
		if (opcao == opcaoPonderada) {
			System.out.println("Informe o peso da primeira nota em (%): ");
			peso1 = scan.nextFloat();
		}

		// Segunda nota
		System.out.println("Informe a segunda nota: ");
		nota2 = scan.nextFloat();
		if (opcao == opcaoPonderada) {
			System.out.println("Informe o peso da segunda nota em (%): ");
			peso2 = scan.nextFloat();
		}

		// Terceira nota
		System.out.println("Informe a terceira nota: ");
		nota3 = scan.nextFloat();
		if (opcao == opcaoPonderada) {
			System.out.println("Informe o peso da terceira nota em (%): ");
			peso3 = scan.nextFloat();
		}

		// Calculo da média
		if (opcao == opcaoAritimetica) {
			media = (nota1 + nota2 + nota3) / 3;
		} else if (opcao == opcaoPonderada) {
			media = ((nota1 * (peso1 / 100)) + (nota2 * (peso2 / 100)) + (nota3 * (peso3 / 100)) / 3);
		}

		System.out.println("Sua média é: " + media);
		
		// Definição da situação
		if (media >= 7) {
			situacao = "Aprovado";
		} else if (media > 1.8) {
			situacao = "Em exame";
		} else {
			situacao = "Reprovado";
		}

		System.out.print("A sua situação é: " + situacao);

		scan.close();

	}
	
}
