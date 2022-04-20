/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.udesc.prog2.model;


import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author matth
 */
public class Doctor extends Person {
    
    public static List<Doctor> medicos = new ArrayList<>();
    
    public Doctor(String nome, String CPF) {
        super(nome, CPF);
    }
    
    public static void carregarDadosIniciais(){
        Doctor m1 = new Doctor("Ana", "1123");
        Doctor m2 = new Doctor("Matheus", "1456");
        Doctor m3 = new Doctor("Gabriel", "1789");
        medicos.add(m1);
        medicos.add(m2);
        medicos.add(m3);
    }
    
    
    
}
