/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.udesc.prog2.dao;

import br.udesc.prog2.model.Appointment;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author matth
 */
public class ConsultaDAO {
    
    private static List<Appointment> consultas = new ArrayList<>();
    
    public static void salvarConsulta(Appointment consulta){
        consultas.add(consulta);
    }
    
    public static List<Appointment> getTodasConsultas(){
        return consultas;
    }
}
