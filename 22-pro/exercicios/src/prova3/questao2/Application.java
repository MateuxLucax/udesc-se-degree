package prova3.questao2;

public class Application {

    public static void main(String[] args) {
        Periferico p1 = new Impressora();

        Periferico p2 = new Impressora3D();

//        Scanner s1 = new Periferico();

        Impressora i1 = new Impressora3D();

        Object o1 = new Scanner();

//        i1 = p1;

//        i1 = p2;

        p1 = i1;

        o1 = p1;

//        s1 = o1;
    }

}
