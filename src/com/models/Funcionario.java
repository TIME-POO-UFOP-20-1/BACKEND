package com.models;

public class Funcionario extends Pessoa{
    //Define atributos da classe
    private char tipo;
    private Pessoa pessoa;

    //Contrutores
    public Funcionario(){};
    public Funcionario(String nome, String cpf, char tipo){
        this.pessoa.setNome(nome);
        this.pessoa.setCPF(cpf);
        this.tipo = tipo;
    }

    //Setters
    public void setNome(String nome){
        this.pessoa.setNome(nome);
    }

    public void setCPF(String cpf){
        this.pessoa.setCPF(cpf);
    }

    public void setTipo(char tipo){
        this.tipo = tipo;
    }

    //Getters
    public String getNome(){
        return this.pessoa.getNome();
    }

    public String getCPF(){
        return this.pessoa.getCPF();
    }

    public char getTipo(){
        return this.tipo;
    }

    //Settergs e Getters da chave da classe Chave
    public void setChave(String chave){
        this.pessoa.setChave(chave);
    }

    public String getChave(){
        return pessoa.getChave();
    }
}
