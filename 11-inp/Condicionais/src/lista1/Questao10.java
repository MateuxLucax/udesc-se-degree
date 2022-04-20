package lista1;

import java.util.Scanner;

public class Questao10 {

	public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        
        int pesoPescado;
        
        System.out.println("Informe a quantidade de peixe pescado: ");
        pesoPescado = scan.nextInt();

        if (pesoPescado > 500) {
            System.out.println("Você excedeu a quantidade limite de pesca. Sua multa é de RS" + ((pesoPescado - 500) * 4) + ",00");
        } else {
            System.out.println("Vocẽ não possui multa por excesso de pesca");
        }

        scan.close();
        
	}
	
}