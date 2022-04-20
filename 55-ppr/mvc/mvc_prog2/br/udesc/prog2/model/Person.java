package br.udesc.prog2.model;

public abstract class Person {
    
    private String name;
    private String CPF;

    public Person(String nome, String CPF) {
        this.name = nome;
        this.CPF = CPF;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    @Override
    public String toString() {
        return "Person{" + "name=" + name + ", CPF=" + CPF + '}';
    }

}
