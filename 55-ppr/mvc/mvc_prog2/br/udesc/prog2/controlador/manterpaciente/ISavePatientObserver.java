package br.udesc.prog2.controlador.manterpaciente;

public interface ISavePatientObserver {

    void showScreen();

    void showMessage(String message);

    void clearScreen();

}
