package main.java.set.Pesquisa;

import java.util.Objects;

public class Tarefa {

    private String descricao;
    private boolean tarefaFinalizada;

    public Tarefa(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }

    public boolean isTarefaFinalizada() {
        return tarefaFinalizada;
    }

    public void setTarefaFinalizada(boolean tarefaFinalizada) {
        this.tarefaFinalizada = tarefaFinalizada;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Tarefa tarefa = (Tarefa) o;
        return Objects.equals(getDescricao(), tarefa.getDescricao());
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getDescricao());
    }

    @Override
    public String toString() {
        return "Tarefa -> " +
                "descricao: " + descricao + '\'' +
                ", tarefaFinalizada: " + tarefaFinalizada;
    }
}
