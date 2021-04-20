package com.models;

public class Pagamento extends Chave{
    // Define os atributos
    private Data vencimento, pagamento;
    private String descricao, tipo, usuario;
    private Chave chave;

    // Construtor
    public Pagamento() {
    }

    // Setters
    public void setVencimento(Data vencimento) {
        this.vencimento = vencimento;
    }

    public void setPagamento(Data pagamento) {
        this.pagamento = pagamento;
    }

    public void setChave() {
        String chave = tipo + vencimento.printData() + pagamento.printData();
        this.chave.setChave(chave);
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setTipo(int tipo) {
        switch (tipo) {
            case 1:
                this.tipo = "Agua";
                break;

            case 2:
                this.tipo = "Luz";
                break;

            case 3:
                this.tipo = "Aluguel";
                break;

            case 4:
                this.tipo = "Telefone";
                break;

            case 5:
                this.tipo = "Produtos de limpeza";
                break;

            case 6:
                this.tipo = "Manutenção de Equipamentos";
                break;

            case 7:
                this.tipo = "Material de Escritorio";
                break;

            case 8:
                this.tipo = "Material de Atendimento";
                break;
        }
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    // Getters
    public Data getVencimento() {
        return this.vencimento;
    }

    public Data getPagamento() {
        return this.pagamento;
    }

    public String getChave() {
        return this.chave.getChave();
    }

    public String getDescricao() {
        return this.descricao;
    }

    public String getTipo() {
        return this.tipo;
    }

    public String getUsuario() {
        return this.usuario;
    }
}
