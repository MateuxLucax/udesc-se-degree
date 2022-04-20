/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.udesc.prog2.model;

import br.udesc.prog2.excecoes.ConsultaException;

/**
 *
 * @author matth
 */
public class Employee extends Person {
    
    public Employee(String nome, String CPF) {
        super(nome, CPF);
    }
    
    public static Appointment marcarConsulta(Paciente paciente, Doctor medico, String data, String hora) throws ConsultaException{
        Appointment consulta = new Appointment(paciente, medico, data, hora);
        return consulta;
    }
    
}
