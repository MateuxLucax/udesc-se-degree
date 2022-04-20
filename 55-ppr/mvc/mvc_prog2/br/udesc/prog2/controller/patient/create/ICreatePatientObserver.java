package br.udesc.prog2.controller.patient.create;

public interface ICreatePatientObserver {

    void showScreen();

    void showMessage(String message);

    void clearScreen();

}
