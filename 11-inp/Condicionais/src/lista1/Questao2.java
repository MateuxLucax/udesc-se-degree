package lista1;

import java.util.Scanner;

public class Questao2 {

	public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        float peso, altura, imc;
        String mensagem;
        
        mensagem = "";

        System.out.println("Informe seu peso em Kg: ");
        peso = scan.nextFloat();

        System.out.println("Informe seu peso em metro: ");
        altura = scan.nextFloat();

        imc = peso / (altura * altura);

        if (imc < 20) {
            mensagem = "abaixo do peso";
        } else if (imc < 25) {
            mensagem = "peso normal";
        } else if (imc < 30) {
            mensagem = "sobrepeso";
        } else if (imc < 40) {
            mensagem = "obeso";
        } else {
            mensagem = "obeso mórbido";
        }

        System.out.println("Conforme o cálculo do IMC, você está na situação de: " + mensagem);

        scan.close();
        
	}
	
}