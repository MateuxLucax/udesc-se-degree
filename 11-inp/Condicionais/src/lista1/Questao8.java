package lista1;

import java.util.Scanner;

public class Questao8 {

	public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        
        float nota1, nota2, nota3, nota4, exame, media;

        exame = 0;

        System.out.println("Informe a primeira nota:");
        nota1 = scan.nextFloat();
        
        System.out.println("Informe a segunda nota:");
        nota2 = scan.nextFloat();

        System.out.println("Informe a terceira nota:");
        nota3 = scan.nextFloat();

        System.out.println("Informe a quarta nota:");
        nota4 = scan.nextFloat();

        media = (nota1 + nota2 + nota3 + nota4) / 4;
        
        if (media < 7) {
            System.out.println("Informe a nota do exame");
            exame = scan.nextFloat();

            media += exame;

            if (media < 5) {
                System.out.println("Você reprovou. Sua média foi de: " + media); 
            } else {
                System.out.println("Você foi aprovado. Sua média foi de: " + media); 
            }
        } else {
            System.out.println("Você foi aprovado. Sua média foi de: " + media); 
        }

        scan.close();
        
	}
	
}