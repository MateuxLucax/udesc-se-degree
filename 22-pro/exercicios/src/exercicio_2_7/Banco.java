package exercicio_2_7;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class Banco {

    private int codigo;

    private String nome;

    private ArrayList<Agencia> agencias;

    public Banco(int codigo, String nome) {
        this.codigo = codigo;
        this.nome = nome;
        this.agencias = new ArrayList<>();
    }

    public boolean addAgencia(Agencia agencia) {
        if(this.agencias.contains(agencia)) {
            return false;
        }
        this.agencias.add(agencia);
        return true;
    }

    public void imprimirAgencias() {
        System.out.println("--- Relação de Agências ---");
        System.out.println(this.agencias.toString());
    }

    public void imprimirAgencias(String cidade) {
        ArrayList<Agencia> agenciasDaCidade = (ArrayList<Agencia>) this.agencias
                .stream()
                .filter(agencia -> agencia.getCidade().equalsIgnoreCase(cidade))
                .collect(Collectors.toList());

        System.out.println("--- Agências de " + cidade + " ---");
        System.out.println(agenciasDaCidade.toString());
    }

    public void imprimirAgencias(int ano) {
        ArrayList<Agencia> agenciasDoAno = (ArrayList<Agencia>) this.agencias
                .stream()
                .filter(agencia -> agencia.getAnoDeAbertura() == ano)
                .collect(Collectors.toList());

        System.out.println("--- Agências abertas em " + ano + " ---");
        System.out.println(agenciasDoAno.toString());
    }

    public Agencia getAgencia(int numero) {
        System.out.println("--- Agência " + numero + " ---");
        return this.agencias
                .stream()
                .filter(agencia -> agencia.getNumero() == numero)
                .findFirst()
                .orElse(null);
    }
}
