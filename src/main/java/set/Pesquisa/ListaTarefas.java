package main.java.set.Pesquisa;

import java.util.HashSet;
import java.util.Set;

public class ListaTarefas {

    private Set<Tarefa> tarefasList;

    public ListaTarefas() {
        this.tarefasList = new HashSet<Tarefa>();
    }

    public void adicionaTarefa(String descricao) {
        tarefasList.add(new Tarefa(descricao));
    }

    public void removerTarefa(String descricao) {
        tarefasList.remove(descricao);
    }

    public void exibeTarefas() {
        if (!tarefasList.isEmpty()) {
            for (Tarefa tarefa : tarefasList) {
                System.out.println(tarefa);
            }
        } else {
            System.out.println("A lista de tarefas esta vazia!");
        }
    }

    public int quantidadeTarefas() {
        if (tarefasList.isEmpty()) {
            System.out.println("A lista de tarefas esta vazia!");
        }
        return tarefasList.size();
    }

    public Set<Tarefa> obterTarefasConcluidas() {
        Set<Tarefa> tarefasConcluidas  = new HashSet<>();
        for (Tarefa tarefa : tarefasList) {
            if (tarefa.isTarefaFinalizada()) {
                tarefasConcluidas.add(tarefa);
            }
        }
        return tarefasConcluidas;
    }

    public Set<Tarefa> obterTarefasPendentes() {
        Set<Tarefa> tarefasConcluidas  = new HashSet<>();
        for (Tarefa tarefa : tarefasList) {
            if (!tarefa.isTarefaFinalizada()) {
                tarefasConcluidas.add(tarefa);
            }
        }
        return tarefasConcluidas;
    }

    public void marcarTarefaFinalizada(String descricao) {
        for (Tarefa tarefa : tarefasList) {
            if (tarefa.getDescricao().equalsIgnoreCase(descricao)) {
                tarefa.setTarefaFinalizada(true);
            }
        }
    }

    public void marcarTarefaPendente(String descricao) {
        for (Tarefa tarefa : tarefasList) {
            if (tarefa.getDescricao().equalsIgnoreCase(descricao)) {
                tarefa.setTarefaFinalizada(false);
            }
        }
    }

    public void limparListaTarefas() {
        if (!tarefasList.isEmpty()) {
            tarefasList.clear();
        } else {
            System.out.println("A lista de tarefas esta vazia!");
        }
    }

    public static void main(String[] args) {

        //Criação das tarefas
        ListaTarefas tarefa = new ListaTarefas();

        //Exibe lista de tarefas vazia
        tarefa.exibeTarefas();

        System.out.println("-".repeat(50));

        //Adicionando tarefas (ignorando a repetida)
        tarefa.adicionaTarefa("Tarefa 1");
        tarefa.adicionaTarefa("Tarefa 2");
        tarefa.adicionaTarefa("Tarefa 2");
        tarefa.adicionaTarefa("Tarefa 3");
        tarefa.adicionaTarefa("Tarefa 4");

        tarefa.exibeTarefas();
        tarefa.quantidadeTarefas();

        System.out.println("-".repeat(50));

        //Marcação de tarefa FINALIZADA
        tarefa.marcarTarefaFinalizada("Tarefa 2");
        tarefa.marcarTarefaFinalizada("Tarefa 4");

        //Obtendo tarefas concluidas e pendentes
        tarefa.obterTarefasConcluidas();
        tarefa.obterTarefasPendentes();

        tarefa.exibeTarefas();
        tarefa.quantidadeTarefas();

        System.out.println("-".repeat(50));

        //Marcação de tarefa PENDENTE e outras FINALIZADAS
        tarefa.marcarTarefaPendente("Tarefa 2");
        tarefa.marcarTarefaPendente("Tarefa 4");
        tarefa.marcarTarefaFinalizada("Tarefa 3");
        tarefa.marcarTarefaFinalizada("Tarefa 1");

        //Obtendo tarefas concluidas e pendentes
        tarefa.obterTarefasConcluidas();
        tarefa.obterTarefasPendentes();

        tarefa.exibeTarefas();
        tarefa.quantidadeTarefas();

        //Limpando lista
        System.out.println("-".repeat(50));
        System.out.println("Limpando a lista de tarefas!");
        tarefa.limparListaTarefas();
        tarefa.quantidadeTarefas();
    }
}
