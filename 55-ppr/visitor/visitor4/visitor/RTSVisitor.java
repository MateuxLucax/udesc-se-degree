package visitor4.visitor;

import visitor4.personagens.Arqueiro;
import visitor4.personagens.Catapulta;
import visitor4.personagens.Lanceiro;

public interface RTSVisitor {

    void visitLanceiro(Lanceiro lanceiro);
    void visitCatapulta(Catapulta catapulta);
    void visitArqueiro(Arqueiro arqueiro);

}
