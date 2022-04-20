package br.udesc.prog2.controlador;

import br.udesc.prog2.dao.ConsultaDAO;
import br.udesc.prog2.dao.PatientDAO;
import br.udesc.prog2.excecoes.ConsultaException;
import br.udesc.prog2.model.Appointment;
import br.udesc.prog2.model.Employee;
import br.udesc.prog2.model.Doctor;
import br.udesc.prog2.model.Paciente;
import br.udesc.prog2.visao.TelaMarcarConsulta;

public class ControladorMarcarConsulta {

    private Appointment modelConsulta;
    private TelaMarcarConsulta telaMarcarConsulta;

    public ControladorMarcarConsulta() {
        modelConsulta = new Appointment();
        telaMarcarConsulta = new TelaMarcarConsulta();
        popularDadosTela();
        adicionarAcaoBotoes();
    }

    public void popularDadosTela(){
        Doctor.carregarDadosIniciais();
        telaMarcarConsulta.popularPacientes(PatientDAO.getTodosPaciente());
        telaMarcarConsulta.popularMedicos(Doctor.medicos);
    }

    public void exibir(){
        telaMarcarConsulta.exibirTela();
    }
    
    public void adicionarAcaoBotoes(){
        telaMarcarConsulta.adicionarAcaoBtnMarcarConsulta(e -> marcarConsulta());
    }
    
    public void marcarConsulta() {
        Doctor medico = telaMarcarConsulta.getMedico();
        Paciente paciente = telaMarcarConsulta.getPaciente();
        String data = telaMarcarConsulta.getData();
        String hora = telaMarcarConsulta.getHora();
        try {
            Appointment consulta = Employee.marcarConsulta(paciente, medico, data, hora);
            ConsultaDAO.salvarConsulta(consulta);
            telaMarcarConsulta.exibirMensagem("Consulta Marcada com sucesso");
            telaMarcarConsulta.limparTela();
            System.out.println(ConsultaDAO.getTodasConsultas());
        } catch (ConsultaException ex) {
            telaMarcarConsulta.exibirMensagem("Erro: Você está tentando agendar uma consulta para o sábado");
        }
    }
    
    
    
}
