package main.java.list.OperacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefas {
    public static void main(String[] args) {
        ListaTarefas listaTarefas = new ListaTarefas();
        System.out.println("O Número total de tarefas na lista é de: " + listaTarefas.obterNumeroTotalTarefas());

        listaTarefas.adicionarTarefas("Tarefa 1");
        listaTarefas.adicionarTarefas("Tarefa 1");
        listaTarefas.adicionarTarefas("Tarefa 2");
        System.out.println("O Número total de tarefas na lista é de: " + listaTarefas.obterNumeroTotalTarefas());

        listaTarefas.removerTarefas("Tarefa 2");
        System.out.println("O Número total de tarefas na lista é de: " + listaTarefas.obterNumeroTotalTarefas());

        listaTarefas.obterDescricaoTarefas();
    }

    private List<Tarefas> tarefasList;

    public ListaTarefas() {
        this.tarefasList = new ArrayList<>();
    }

    public void adicionarTarefas(String descricao) {
        this.tarefasList.add(new Tarefas(descricao));
    }

    public void removerTarefas(String descricao) {
        List<Tarefas> tarefasParaRemover = new ArrayList<>();
        for (Tarefas t : tarefasList) {
            if (t.getDescricao().equalsIgnoreCase(descricao)) {
                tarefasParaRemover.add(t);
            }
        }
        tarefasList.removeAll(tarefasParaRemover);
    }

    public int obterNumeroTotalTarefas() {
        return tarefasList.size();
    }

    public void obterDescricaoTarefas() {
        System.out.println(tarefasList);
    }
}
