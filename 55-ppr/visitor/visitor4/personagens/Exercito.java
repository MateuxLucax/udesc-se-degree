package visitor4.personagens;

import visitor4.visitor.RTSVisitor;

import java.util.ArrayList;
import java.util.List;

public class Exercito {

    private final List<Personagem> personagens = new ArrayList<>();
    private final List<Personagem> mortos = new ArrayList<>();

    public void adicionaPersonagem(Personagem personagem) {
        personagens.add(personagem);
    }

    public void accept(RTSVisitor visitor) {
        for (Personagem personagem : personagens) {
            personagem.accept(visitor);
            if (personagem.getPontoVida() <= 0) {
                mortos.add(personagem);
            }
        }

        personagens.removeAll(mortos);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Personagem personagem : personagens) {
            sb.append(personagem.toString());
        }
        return sb.toString();
    }

}
