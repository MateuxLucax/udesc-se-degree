// Elabore um programa que leia um valor inteiro e informe se ele é divisível por 10, 5, 2 ou nenhum deles

package exemplos;

import java.util.Scanner;

public class VerificaDivisao {

	public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Informe um valor inteiro e verifique se é divisível por 10, 5 ou nenhum deles: ");
        int valor = scan.nextInt();

        if (valor % 10 == 0) {
            System.out.println("O número é divisível por 10");
        }
        if (valor % 5 == 0) {
            System.out.println("O número é divisível por 5");
        } 
        if (valor % 2 == 0) {
            System.out.println("O número é divisível por 2");
        } 
        if (valor % 10 != 0 | valor % 5 != 0 | valor % 2 != 0) {
            System.out.println("O número não é divisível por 10, 5 ou 2");
        }

        scan.close();
        
	}
	
}
