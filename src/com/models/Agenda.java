package com.models;

public class Agenda extends Chave{
    // Definição dos atributos
    private Data data;
    private String[] horario = new String[5];
    private int[] codigo = new int[5];
    private boolean[] disponibilidade = new boolean[5];
    private String[] paciente = new String[5];
    private String[] usuario = new String[5];
    private String funcionario;
    private Chave chave;

    // Construtor
    public Agenda() {
        for (int i = 0; i < 5; i++) {
            disponibilidade[i] = true;
            codigo[i] = i;
        }
    }

    // Setters
    public void setData(Data data) {
        this.data = data;
    }

    public void setDisponibilidade(boolean disponibilidade, int codigo) {
        this.disponibilidade[codigo] = disponibilidade;
    }

    public void setPaciente(String paciente, int codigo) {
        this.paciente[codigo] = paciente;
    }

    public void setFuncionario(String funcionario) {
        this.funcionario = funcionario;
    }

    public void setChave() {
        String chave = funcionario + ":" + data.printData();
        this.chave.setChave(chave);
    }

    public void setUsuario(String usuario, int codigo) {
        this.usuario[codigo] = usuario;
    }

    // Getters
    public Data getData() {
        return this.data;
    }

    public String getFuncionario() {
        return this.funcionario;
    }

    public String getPaciente(int codigo) {
        return this.paciente[codigo];
    }

    public boolean getDisponibilidade(int codigo) {
        return this.disponibilidade[codigo];
    }

    public String getHorario(int codigo) {
        return this.horario[codigo];
    }

    public String getChave() {
        return this.chave.getChave();
    }

    public String getUsuario(int codigo) {
        return this.usuario[codigo];
    }

    // Definição do método printData
    public String printData() {
        return data.printData();
    }
}
