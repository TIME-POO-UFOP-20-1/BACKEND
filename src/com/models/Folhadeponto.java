package com.models;

import java.util.ArrayList;

public class Folhadeponto {
    // Definindo os atributos
    private Chave chave;
    private ArrayList<String> observacao;
    private ArrayList<Data> data;
    private int tamanho;

    // Construtor
    public Folhadeponto() {
        this.tamanho = 0;
    }

    // Setters
    public void setTamanho() {
        this.tamanho++;
    }

    public void setChave(String funcionario) {
        this.chave.setChave(funcionario);
    }

    public void setObservacao(String obs) {
        this.observacao.add(obs);
    }

    public void setData(Data data) {
        this.data.add(data);
    }

    // Getters
    public int getTamanho() {
        return this.tamanho;
    }

    public String getChave() {
        return this.chave.getChave();
    }

    public String getObservacao(int codigo) {
        return this.observacao.get(codigo);
    }

    public Data getData(int codigo) {
        return this.data.get(codigo);
    }

    // Definição dos métodos
    public boolean checkData(Data data) {
        for (Data dma : this.data) {
            if (dma.printData() == data.printData()) {
                return false;
            }
        }
        return true;
    }
}
