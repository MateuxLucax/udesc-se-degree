 

public class Application {

    public static void main(String[] args) {
        Participante participante1 = new Participante("Carlos", "91234467");
        Participante participante2 = new Participante("Lucas", "67232901");
        Participante participante3 = new Participante("Gumercindo", "78549292");
        Participante participante4 = new Participante("Jorge", "90785634");
        Participante participante5 = new Participante("Pedro", "8475723");

        Grupo grupo1 = new Grupo("Ethereum");
        grupo1.adicionarParticipantes(participante1);
        grupo1.adicionarParticipantes(participante2);
        grupo1.adicionarParticipantes(participante4);

        Grupo grupo2 = new Grupo("Ethereum");
        grupo2.adicionarParticipantes(participante3);
        grupo2.adicionarParticipantes(participante4);
        grupo2.adicionarParticipantes(participante5);

        System.out.println(grupo1);
        System.out.println(grupo2);
    }
}
