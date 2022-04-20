package exercicio_2_2;

import java.util.ArrayList;

public class Grupo {

    private String nome;

    private ArrayList<Participante> participantes;

    public Grupo(String nome) {
        this.nome = nome;
        this.participantes = new ArrayList<>();
    }

    public boolean adicionarParticipantes(Participante participante) {
        if (this.participantes.contains(participante)) {
            return false;
        }
        this.participantes.add(participante);
        return true;
    }

    @Override
    public String toString() {
        return "Grupo{" +
                "nome='" + nome + '\'' +
                ", participantes=" + participantes +
                '}';
    }
}
