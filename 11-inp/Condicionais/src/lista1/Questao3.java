package lista1;

import java.util.Scanner;

public class Questao3 {

	public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        
        double saldoMedio, credito;

        credito = 0;
        

        System.out.println("Informe seu saldo médio: ");
        saldoMedio = scan.nextFloat();

        if (saldoMedio >= 501 && saldoMedio <= 1000) {
            credito = saldoMedio * 0.3;
        } else if (saldoMedio > 1000 && saldoMedio <= 3000) {
            credito = saldoMedio * 0.4;
        } else if (saldoMedio > 3000) {
            credito = saldoMedio * 0.5;
        }

        System.out.println("Seu crédito é de: " + credito);

        scan.close();
        
	}
	
}