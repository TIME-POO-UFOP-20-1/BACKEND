package com.models;

public class chave {
    //Define os atributos
    private String chave;

    //Construtor sem parâmetros
    public chave(){}

    //Construtor com parâmetros
    public chave(String chave){
        this.chave = chave;
    }

    //Setter de chave
    public void setChave(String chave){
        this.chave = chave;
    }

    //Getter de chave
    public String getChave(){
        return chave;
    }
}
