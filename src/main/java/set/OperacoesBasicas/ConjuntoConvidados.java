package main.java.set.OperacoesBasicas;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoConvidados {

    private Set<Convidado> convidadosSet;

    public ConjuntoConvidados() {
        this.convidadosSet = new HashSet<>();
    }

    public void adicionarConvidado(String nome, int codigoConvite) {
        convidadosSet.add(new Convidado(nome, codigoConvite));
    }

    public void removerConvidado(int codigoConvite) {
        Convidado convidadoParaRemover = null;
        for (Convidado c : convidadosSet) {
            if (c.getCodigoConvite() == codigoConvite) {
                convidadoParaRemover = c;
                break;
            }
        }
        convidadosSet.remove(convidadoParaRemover);
    }

    public int quantidadeConvidados() {
        return convidadosSet.size();
    }

    public void imprimirConvidados() {
        System.out.println(convidadosSet);
    }

    public static void main(String[] args) {
        ConjuntoConvidados conjuntoConvidados = new ConjuntoConvidados();

        System.out.println("Existem " + conjuntoConvidados.quantidadeConvidados() + " convidado(s) no Set de Convidados!");

        conjuntoConvidados.adicionarConvidado("Convidado 01", 1233);
        conjuntoConvidados.adicionarConvidado("Convidado 02", 1234);
        conjuntoConvidados.adicionarConvidado("Convidado 03", 1234);
        conjuntoConvidados.adicionarConvidado("Convidado 04", 1235);
        conjuntoConvidados.adicionarConvidado("Convidado 05", 1236);

        conjuntoConvidados.imprimirConvidados();

        System.out.println("Existem " + conjuntoConvidados.quantidadeConvidados() + " convidado(s) no Set de Convidados!");

//        Removendo Convidado

        conjuntoConvidados.removerConvidado(1234);

        System.out.println("Existem " + conjuntoConvidados.quantidadeConvidados() + " convidado(s) no Set de Convidados!");

        conjuntoConvidados.imprimirConvidados();
    }
}
