package com.models;

public class Data {
    // Define os atributos
    private int dia, mes, ano;

    // Construtor sem parâmetros
    public Data() {
    }

    // Construtor com parâmetros
    public Data(int dia, int mes, int ano) {
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }

    // Setters
    public void setDia(int dia) {
        this.dia = dia;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    // Getters
    public int getDia() {
        return dia;
    }

    public int getMes() {
        return mes;
    }

    public int getAno() {
        return ano;
    }

    // Função que formata a data
    public String printData() {
        String dataFormatada = String.valueOf(dia) + "/" + String.valueOf(mes) + "/" + String.valueOf(ano);
        return dataFormatada;
    }
}
