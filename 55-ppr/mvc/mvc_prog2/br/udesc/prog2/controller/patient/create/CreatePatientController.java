package br.udesc.prog2.controller.patient.create;

import br.udesc.prog2.controlador.manterpaciente.ISavePatientObserver;
import br.udesc.prog2.dao.PatientDAO;
import br.udesc.prog2.model.Patient;

import java.util.ArrayList;
import java.util.List;

public class CreatePatientController implements ICreatePatientController {

    private Patient patientModel;
    private final List<ISavePatientObserver> observers = new ArrayList<>();

    @Override
    public void showScreen() {
        for (var observer: observers) observer.showScreen();
    }

    @Override
    public void createNewPatient(String nome, String cpf) {
        patientModel = new Patient(nome, cpf);

        if (validate()) {
            if (PatientDAO.save(patientModel)) {
                for (var observer: observers) {
                    observer.showMessage("Paciente salvo com sucesso. " + patientModel);
                    observer.clearScreen();
                }
            }
            else {
                for (var observer: observers) observer.showMessage("Já existe paciente com esse CPF.");
            }
        }
        else {
            for (var observer: observers) observer.showMessage("Nome/CPF vazio");
        }
    }

    @Override
    public boolean validate() {
        return !this.patientModel.getCPF().isEmpty() && !this.patientModel.getName().isEmpty();
    }

    @Override
    public void addObserver(ISavePatientObserver observer) {
        observers.add(observer);
    }
}
