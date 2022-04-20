package br.udesc.prog2.dao;

import br.udesc.prog2.model.Patient;

import java.util.ArrayList;
import java.util.List;

public class PatientDAO {

    private static final List<Patient> patients = new ArrayList<>();

    public static boolean save(Patient patient) {
        for (var p : patients) {
            if (p.getCPF().equals(patient.getCPF())) return false;
        }
        patients.add(patient);
        return true;
    }

    public static List<Patient> all() {
        return patients;
    }

    public static boolean removeByCPF(String cpf){
        for (var p : patients) {
            if (p.getCPF().equals(cpf)) {
                patients.remove(p);
                return true;
            }
        }

        return false;
    }
}
