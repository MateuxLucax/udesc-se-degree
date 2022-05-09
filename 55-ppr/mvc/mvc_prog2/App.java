import br.udesc.prog2.controlador.manterpaciente.ControladorManterPaciente;
import br.udesc.prog2.visao.manterpaciente.TelaManterPaciente;

public class App {
    public static void main(String[] args){
        ControladorManterPaciente controlador = new ControladorManterPaciente(new TelaManterPaciente());
        controlador.exibirTelaManterPaciente();
    }
}
