package com.models;

import java.io.Serializable;

public class usuario extends chave implements Serializable {
    //Define atributos da classe
    private String usuario;
    private String senha;
    private char tipo;
    private chave chave;

    //Contrutores
    public usuario(){}

    public usuario(String usuario, String senha){
        this.usuario = usuario;
        this.senha = senha;
    }

    public usuario(String usuario, String senha, char tipo){
        this.usuario = usuario;
        this.senha = senha;
        this.tipo = tipo;
    }

    //Criação dos setters
    public void setUsuario(String usuario){
        this.usuario = usuario;
    }

    public void setSenha(String senha){
        this.senha = senha;
    }

    public void setTipo(char tipo){
        this.tipo = tipo;
    }

    public void setChave(String chave){
        this.chave.setChave(chave);
    }

    public void setChave(){
        this.chave.setChave(usuario);
    }

    //Criação dos getters
    public String getUsuario(){
        return this.usuario;
    }

    public String getSenha(){
        return this.senha;
    }

    public char getTipo(){
        return this.tipo;
    }

    public String getChave(){
        return this.chave.getChave();
    }
}
