package main.java.map.OperacoesBasicas;

import java.util.HashMap;
import java.util.Map;

public class AgendaContatos {

    private Map<String, Integer> agendaContatosMap;

    public AgendaContatos() {
        this.agendaContatosMap = new HashMap();
    }

    public void adicionaContato(String nome, Integer telefone) {
        this.agendaContatosMap.put(nome, telefone);
    }

    public void removerContato(String nome) {
        if (!agendaContatosMap.isEmpty()) {
            agendaContatosMap.remove(nome);
        } else {
            System.out.println("A agenda está vazia !");
        }
    }

    public void imprimeContatos() {
        System.out.println(agendaContatosMap);
    }

    public Integer pesquisaContato(String nome) {
        if (!agendaContatosMap.isEmpty()) {
            return agendaContatosMap.get(nome);
        } else {
            throw new RuntimeException("A agenda está vazia!");
        }
    }

    public static void main(String[] args) {

        AgendaContatos agendaContatos = new AgendaContatos();
        agendaContatos.adicionaContato("Paulo", 99887766);
        agendaContatos.adicionaContato("Paulo", 99887766);
        agendaContatos.adicionaContato("Paulo", 99886677);
        agendaContatos.adicionaContato("Soraya", 1122334455);
        agendaContatos.adicionaContato("Casa", 1234567890);

        agendaContatos.imprimeContatos();

        agendaContatos.removerContato("Casa");

        agendaContatos.imprimeContatos();

        System.out.println(agendaContatos.pesquisaContato("Paulo"));
    }
}
