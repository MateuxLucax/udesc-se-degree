package lista1;

import java.util.Scanner;

public class Questao5 {

	public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        
        int totalCaloriasIngeridas, pratoPrincipal, sobremesa, bebida;
        totalCaloriasIngeridas = 0;

        System.out.println("Informe a sua opção de prato principal ([1] Vegetariano, [2] Peixe, [3] Frango, [4] Carne): ");
        pratoPrincipal = scan.nextInt();
        
        System.out.println("Informe a sua opção de sobremesa ([1] Abacaxi, [2] Sorvete diet, [3] Mouse diet, [4] Mouse de chocolate): ");
        sobremesa = scan.nextInt();

        System.out.println("Informe a sua opção de prato principal ([1] Chá, [2] Suco de laranja, [3] Suco de melão, [4] Refrigerante diet): ");
        bebida = scan.nextInt();

        if (pratoPrincipal == 1) {
            totalCaloriasIngeridas += 180;
        } else if (pratoPrincipal == 2) {
            totalCaloriasIngeridas += 230;
        } else if (pratoPrincipal == 3) {
            totalCaloriasIngeridas += 250;
        } else if (pratoPrincipal == 4) {
            totalCaloriasIngeridas += 350;
        }

        if (sobremesa == 1) {
            totalCaloriasIngeridas += 75;
        } else if (sobremesa == 2) {
            totalCaloriasIngeridas += 110;
        } else if (sobremesa == 3) {
            totalCaloriasIngeridas += 170;
        } else if (sobremesa == 4) {
            totalCaloriasIngeridas += 200;
        }

        if (bebida == 1) {
            totalCaloriasIngeridas += 20;
        } else if (bebida == 2) {
            totalCaloriasIngeridas += 70;
        } else if (bebida == 3) {
            totalCaloriasIngeridas += 100;
        } else if (bebida == 4) {
            totalCaloriasIngeridas += 65;
        }

        System.out.println("O sua ingestão total de calorias será de: " + totalCaloriasIngeridas + "kcal");

        scan.close();
        
	}
	
}