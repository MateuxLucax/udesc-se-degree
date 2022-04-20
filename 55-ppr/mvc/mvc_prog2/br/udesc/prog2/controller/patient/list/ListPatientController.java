package br.udesc.prog2.controller.patient.list;

import br.udesc.prog2.dao.PatientDAO;
import br.udesc.prog2.model.table.PatientTableModel;

public class ListPatientController implements IListPatientController {

    private final PatientTableModel patientTableModel;

    public ListPatientController(PatientTableModel patientTableModel) {
        this.patientTableModel = patientTableModel;
    }

    public void show(){
        telaListarPacientes.exibirTela();
    }

    public void update(){
        pacienteTableModel.fireTableDataChanged();
    }

    public void removePatientByCPF(String cpf){
        if(PatientDAO.removeByCPF(cpf)){
            telaListarPacientes.exibirMensagem("Paciente excluido com sucesso");
            atualizarDados();
        }
        else {
            telaListarPacientes.exibirMensagem("Não foi possível excluir o paciente");
        }
    }
}