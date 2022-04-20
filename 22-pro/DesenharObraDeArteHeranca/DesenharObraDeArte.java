public class DesenharObraDeArte {

    public static void main(String[] args) {
        /*
         * Grama
         */
        Triangulo grama;
        grama = new Triangulo("green", 150, 300, 150, 100);

        grama.desenhar();

        /*
         * Casa
         */
        Quadrado parede;
        parede = new Quadrado("red", 125, 75, 100);

        parede.desenhar();

        Quadrado janela;
        janela = new Quadrado("black", 40, 100, 115);

        janela.desenhar();

        Triangulo telhado;
        telhado = new Triangulo("blue", 50, 175, 140, 50);

        telhado.desenhar();

        /*
         * Sol
         */
        Circulo sol;
        sol = new Circulo("yellow", 40);
        sol.setX(225);
        sol.setY(25);

        sol.desenhar();
    }
}
