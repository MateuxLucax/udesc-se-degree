package visitor4.visitor.ataque;

import visitor4.personagens.Arqueiro;
import visitor4.personagens.Catapulta;
import visitor4.personagens.Lanceiro;
import visitor4.visitor.RTSVisitor;

public class AtaqueCatapultaVisitor implements RTSVisitor {

    private final int forcaAtaque;

    public AtaqueCatapultaVisitor(int forcaAtaque) {
        this.forcaAtaque = forcaAtaque;
    }

    @Override
    public void visitLanceiro(Lanceiro lanceiro) {
        lanceiro.setPontoVida(lanceiro.getPontoVida() - (forcaAtaque + 1));
    }

    @Override
    public void visitCatapulta(Catapulta catapulta) {
        catapulta.setPontoVida(catapulta.getPontoVida() - forcaAtaque);
    }

    @Override
    public void visitArqueiro(Arqueiro arqueiro) {
        arqueiro.setPontoVida(arqueiro.getPontoVida() - (forcaAtaque + 2));
    }

}
