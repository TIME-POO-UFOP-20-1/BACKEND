package com.models;

public class Pessoa extends Chave{
    //Define atributos da classe
    private String nome;
    private String cpf;
    private Chave chave;

    //Contrutores
    public Pessoa(){};
    public Pessoa(String nome, String cpf){
        this.nome = nome;
        this.cpf = cpf;
    }

    //Setters
    public void setNome(String nome){
        this.nome = nome;
    }

    public void setCPF(String cpf){
        this.cpf = cpf;
    }

    //Getters
    public String getNome(){
        return this.nome;
    }

    public String getCPF(){
        return this.cpf;
    }

    //Setters e Getters da chave da classe Chave
    public void setChave(String chave){
        this.chave.setChave(chave);
    }

    public String getChave(){
        return chave.getChave();
    }
}
