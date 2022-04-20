package prova3.questao3;

public class Application {

    public static void main(String[] args) {
        Companhia oi = new Companhia("Oi");

        LinhaComercial numeroOi1 = new LinhaComercial("3357-8484", "Udesc", 2007, 30);
        LinhaResidencial numeroOi2 = new LinhaResidencial("3357-1234", "João", 1995, 150);
        LinhaResidencial numeroOi3 = new LinhaResidencial("3357-8484", "Maria", 2017, 200);

        oi.addLinhaTelefonica(numeroOi1);
        oi.addLinhaTelefonica(numeroOi2);
        oi.addLinhaTelefonica(numeroOi3);

        System.out.println(oi.toString());
        System.out.println(oi.getArrecadacao());

        numeroOi2.setProprietario("Ana");
        numeroOi2.setAnoAquisicao(2021);
        numeroOi2.setMinutosFranquia(300);

        System.out.println(oi.toString());
        System.out.println(oi.getArrecadacao());

        Companhia vivo = new Companhia("Vivo");

        LinhaResidencial numeroVivo1 = new LinhaResidencial("3333-4444", "José", 1999, 80);
        LinhaComercial numeroVivo2 = new LinhaComercial("3357-8899", "João", 2016, 10);

        vivo.addLinhaTelefonica(numeroVivo1);
        vivo.addLinhaTelefonica(numeroVivo2);

        System.out.println(vivo.toString());
        System.out.println(vivo.getArrecadacao());

        numeroVivo2.setProprietario("Dell");
        numeroVivo2.setAnoAquisicao(2021);
        numeroVivo2.setQuantidadeRamais(25);

        System.out.println(vivo.toString());
        System.out.println(vivo.getArrecadacao());
    }
}
