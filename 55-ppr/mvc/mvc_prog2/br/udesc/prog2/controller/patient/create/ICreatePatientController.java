package br.udesc.prog2.controller.patient.create;

import br.udesc.prog2.controlador.manterpaciente.ISavePatientObserver;

public interface ICreatePatientController {

    void showScreen();

    void createNewPatient(String name, String cpf);

    boolean validate();

    void addObserver(ISavePatientObserver observer);

}
