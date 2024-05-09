package OperacoesBasicas;

public class Tarefas {
    private String descricao;

    public Tarefas(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }

    @Override
    public String toString() {
        return "Tarefas: " + descricao + '\'';
    }
}
