package visitor4.visitor.cura;

import visitor4.personagens.Arqueiro;
import visitor4.personagens.Catapulta;
import visitor4.personagens.Lanceiro;
import visitor4.visitor.RTSVisitor;

public class CuraXamaVisitor implements RTSVisitor {

    private final int forcaCura = 2;

    @Override
    public void visitLanceiro(Lanceiro lanceiro) {
        lanceiro.setPontoVida(lanceiro.getPontoVida() + forcaCura);
    }

    @Override
    public void visitCatapulta(Catapulta catapulta) {
        catapulta.setPontoVida(catapulta.getPontoVida() + forcaCura);
    }

    @Override
    public void visitArqueiro(Arqueiro arqueiro) {
        arqueiro.setPontoVida(arqueiro.getPontoVida() + forcaCura);
    }

}
