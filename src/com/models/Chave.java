package com.models;

public class Chave {
    //Define os atributos
    private String chave;

    //Construtor sem parâmetros
    public Chave(){}

    //Construtor com parâmetros
    public Chave(String chave){
        this.chave = chave;
    }

    //Setter de chave
    public void setChave(String chave){
        this.chave = chave;
    }

    //Getter de chave
    public String getChave(){
        return this.chave;
    }
}
