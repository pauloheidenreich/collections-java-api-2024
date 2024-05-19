package main.java.set.Ordenacao;

import java.util.*;

public class GerenciadorAlunos {

    private Set<Aluno> alunosSet;

    public GerenciadorAlunos() {
        this.alunosSet = new HashSet<>();
    }

    public void adicionarAluno(String nomeDoAluno, long matricula, double nota) {
        alunosSet.add(new Aluno(nomeDoAluno, matricula, nota));
    }

    public void removerAluno(long matricula) {
        if (!alunosSet.isEmpty()) {
            for (Aluno aluno : alunosSet) {
                if (aluno.getMatricula() == matricula) {
                    alunosSet.remove(aluno);
                    break;
                }
            }
        } else {
            System.out.println("A lista está vazia!");
        }
    }

    public Set<Aluno> exibirAlunosPorNome() {
        if (!alunosSet.isEmpty()) {
            Set<Aluno> alunos = new TreeSet<>(alunosSet);
            return alunos;
        } else {
            throw new RuntimeException("A lista esta vazia!");
        }
    }

    public Set<Aluno> exibirAlunosPorNota() {
        if (!alunosSet.isEmpty()) {
            Set<Aluno> alunosPorNota = new TreeSet<>(new ComparatorPorNota());
            alunosPorNota.addAll(alunosSet);
            return alunosPorNota;
        } else {
            throw new RuntimeException("A lista esta vazia!");
        }
    }

    public static void main(String[] args) {

        GerenciadorAlunos listaAlunos = new GerenciadorAlunos();

        listaAlunos.adicionarAluno("Soraya", 8L, 9.00);
        listaAlunos.adicionarAluno("Paulo Jr", 2L, 8.50);
        listaAlunos.adicionarAluno("Manuela", 3L, 10.00);
        listaAlunos.adicionarAluno("Junior", 2L, 8.30);
        listaAlunos.adicionarAluno("Théo", 10L, 8.40);

        System.out.println("-".repeat(50));
        //Exibindo Alunos
        System.out.println(listaAlunos.alunosSet);
        System.out.println("-".repeat(50));
        //Removendo Aluno
        listaAlunos.removerAluno(10L);
        System.out.println(listaAlunos.alunosSet);
        System.out.println("-".repeat(50));
        //Exibindo por Nome
        System.out.println(listaAlunos.exibirAlunosPorNome());
        System.out.println("-".repeat(50));
        //Exibindo por Nota
        System.out.println(listaAlunos.exibirAlunosPorNota());
    }
}
