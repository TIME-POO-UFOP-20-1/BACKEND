package com.models;

public class Especialista extends Funcionario{
    //Define atributos da classe
    private Funcionario funcionario;

    //Contrutores
    public Especialista(){}
    public Especialista(String nome, String cpf, char tipo){
        this.funcionario.setNome(nome);
        this.funcionario.setCPF(cpf);
        this.funcionario.setTipo(tipo);
    }

    //Criação dos setters
    public void setNome(String nome){
        this.funcionario.setNome(nome);
    }

    public void setCPF(String cpf){
        this.funcionario.setCPF(cpf);
    }

    public void setTipo(char tipo){
        this.funcionario.setTipo(tipo);
    }

    public void setChave(String chave){
        this.funcionario.setChave(chave);
    }

    //Criação dos getters
    public String getNome(){
        return this.funcionario.getNome();
    }

    public String getCPF(){
        return this.funcionario.getCPF();
    }

    public char getTipo(){
        return this.funcionario.getTipo();
    }

    public String getChave(){
        return this.funcionario.getChave();
    }
}
