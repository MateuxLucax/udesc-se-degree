package lista1;

import java.util.Scanner;

public class Questao9 {

	public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int valores[] = { 0, 0, 0, 0};
        int somaDosValoes = 0;
        int contador = 1;

        for (int i = 0; i < 4; i++) {
            System.out.print("Informe o " + contador + "° valor: ");
            valores[i] = scan.nextInt();
            somaDosValoes += valores[i];
            contador++;
        }

        for (int i = 0; i < valores.length; i++) {
            if (valores[i] > (somaDosValoes / valores.length)) {
                System.out.println("O valor " + valores[i] + " é maior que a média dos valores");
            }
        }

        scan.close();

	}

}