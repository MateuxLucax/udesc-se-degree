package br.udesc.prog2.controlador.manterpaciente;

import br.udesc.prog2.dao.PatientDAO;
import br.udesc.prog2.model.Paciente;
import br.udesc.prog2.model.table.PatientTableModel;
import br.udesc.prog2.visao.manterpaciente.TelaManterPaciente;
import br.udesc.prog2.visao.manterpaciente.TelaListarPacientes;

import java.awt.event.ActionListener;

// TODO: adicionar interface para ControladorManterPaciente
public class ControladorManterPaciente {

    private TelaManterPaciente telaManterPaciente;
    private Paciente pacienteModel;

    //Controladores
    private ControladorListarPacientes controladorListarPacientes;
    private SavePatientController controladorCadastrarPaciente;

    private PatientTableModel pacienteTableModel;

    public ControladorManterPaciente(TelaManterPaciente telaManterPaciente) {
        this.telaManterPaciente = telaManterPaciente;
        inicializarTelaListarDados();
        inicializarTelaCadastrarPaciente();
        inicializarAcaoBotoes();
        atualizarListaAoSalvarPaciente();
    }

    public void inicializarAcaoBotoes() {
        telaManterPaciente.adicionarAcaoCadastrarPaciente(e -> controladorCadastrarPaciente.exibir());

        telaManterPaciente.adicionarAcaoListarPacientes(e -> controladorListarPacientes.exibir());
    }

    public void inicializarTelaListarDados() {
        pacienteTableModel = new PatientTableModel(PatientDAO.getTodosPaciente());
        controladorListarPacientes = new ControladorListarPacientes(new TelaListarPacientes(), pacienteTableModel);
    }

    public void inicializarTelaCadastrarPaciente() {
        controladorCadastrarPaciente = new SavePatientController(new Paciente("", ""));
    }

    public void exibirTelaManterPaciente() {
        telaManterPaciente.exibirTela();
    }

    public void exibirTelaListarPacientes() {
        controladorListarPacientes.exibir();
    }

    public void exibirTelaCadastrarPaciente() {
        controladorCadastrarPaciente.exibir();
    }

    public void atualizarListaAoSalvarPaciente() {
        controladorCadastrarPaciente.getTelaCadastrarPaciente().adicionarAcaoBotaoSalvarPaciente((ActionListener) e -> controladorListarPacientes.atualizarDados());
    }

}
