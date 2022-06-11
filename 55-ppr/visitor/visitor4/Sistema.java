package visitor4;

import visitor4.personagens.*;
import visitor4.visitor.ataque.AtaqueLanceiroVisitor;
import visitor4.visitor.cura.CuraXamaVisitor;

public class Sistema {

        public static void main(String[] args) {
            Exercito exercito = new Exercito();
            exercito.adicionaPersonagem(new Lanceiro());
            exercito.adicionaPersonagem(new Arqueiro());
            exercito.adicionaPersonagem(new Catapulta());

            exercito.accept(new AtaqueLanceiroVisitor(1));
            System.out.println(exercito);

            exercito.accept(new CuraXamaVisitor());
            System.out.println(exercito);
        }

}
