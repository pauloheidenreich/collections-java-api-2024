package main.java.set.Pesquisa;

import java.util.HashSet;
import java.util.Set;

public class AgendaContatos {

    private Set<Contato> contatosSet;

    public AgendaContatos() {
        this.contatosSet = new HashSet<>();
    }

    public void adicionarContato(String nome, int numero) {
        contatosSet.add(new Contato(nome, numero));
    }

    public void exibirContatos() {
        System.out.println(contatosSet);
    }

    public Set<Contato> pesquisarContato(String nome) {
        Set<Contato> contatosPorNome = new HashSet<>();
        for (Contato c : contatosSet) {
            if (c.getNome().startsWith(nome)) {
                contatosPorNome.add(c);
            }
        }
        return contatosPorNome;
    }

    public Contato atualizarContato(String nome, int numero) {
        Contato contatoAtualizado = null;
        for (Contato c : contatosSet) {
            if (c.getNome().equalsIgnoreCase(nome)) {
                c.setNumero(numero);
                contatoAtualizado = c;
                break;
            }
        }
        return contatoAtualizado;
    }

    public static void main(String[] args) {

        AgendaContatos agenda = new AgendaContatos();

        agenda.exibirContatos();

        agenda.adicionarContato("Paulo Junior", 123456789);
        agenda.adicionarContato("Paulo", 987654321);
        agenda.adicionarContato("Paulo Edson", 1111111111);
        agenda.adicionarContato("Paulo Jr", 222222222);
        agenda.adicionarContato("Manuela Heidenreich", 1212121212);
        agenda.adicionarContato("Soraya Siqueira", 987651234);

        agenda.exibirContatos();

        System.out.println("Pesquisa por nome: " + agenda.pesquisarContato("Paulo"));

        agenda.atualizarContato("Paulo Junior", 66666666);

        agenda.exibirContatos();
    }
}
