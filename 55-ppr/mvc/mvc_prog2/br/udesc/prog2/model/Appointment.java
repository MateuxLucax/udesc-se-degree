package br.udesc.prog2.model;

import br.udesc.prog2.excecoes.ConsultaException;

public class Appointment {

    private Paciente paciente;
    private Doctor medico;
    private String data;
    private String hora;

    public Appointment() {
    }
    
    public Appointment(Paciente paciente, Doctor medico, String data, String hora)
            throws ConsultaException{
        this.paciente = paciente;
        this.medico = medico;
        this.data = data;
        this.hora = hora;
        
        boolean validacao = validarConsulta(data);
        if(!validacao){
            throw new ConsultaException("Tentativa de marcar no sábado");
        }
        
    }

    private boolean validarConsulta(String data){
        return !data.equals("24/07/2021") && !data.equals("25/07/2021");
    }
    
    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public Doctor getMedico() {
        return medico;
    }

    public void setMedico(Doctor medico) {
        this.medico = medico;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    @Override
    public String toString() {
        return "Consulta{" + "paciente=" + paciente + ", medico=" + medico + ", data=" + data + ", hora=" + hora + '}';
    }
    
    
    
}
