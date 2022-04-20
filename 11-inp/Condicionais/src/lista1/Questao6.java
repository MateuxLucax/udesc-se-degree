package lista1;

import java.util.Scanner;

public class Questao6 {

	public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        
        int diaDaSemana;
        String diaDaSemanaExtenso;
        diaDaSemanaExtenso = "";

        System.out.println("Informe o dia da semana de hoje");
        diaDaSemana = scan.nextInt();

        switch (diaDaSemana) {
            case 1:
                diaDaSemanaExtenso = "Domingo";
                break;
            
            case 2:
                diaDaSemanaExtenso = "Segunda";
                break;
            
            case 3:
                diaDaSemanaExtenso = "Terça";
                break;

            case 4:
                diaDaSemanaExtenso = "Quarta";
                break;
            
            case 5: 
                diaDaSemanaExtenso = "Quinta";
                break;
        
            case 6: 
                diaDaSemanaExtenso = "Sexta";
                break;

            case 7: 
                diaDaSemanaExtenso = "Sábado";
                break;

            default:
                diaDaSemanaExtenso = "Este dia não existe";
                break;
        }

        System.out.println("O dia da semana informado é: " + diaDaSemanaExtenso);

        scan.close();
        
	}
	
}