package main.java.set.Ordenacao;

import java.util.Comparator;
import java.util.Objects;

public class Aluno implements Comparable<Aluno> {

    private String nomeDoAluno;
    private long matricula;
    private double nota;

    public Aluno(String nomeDoAluno, long matricula, double nota) {
        this.nomeDoAluno = nomeDoAluno;
        this.matricula = matricula;
        this.nota = nota;
    }

    public String getNomeDoAluno() {
        return nomeDoAluno;
    }

    public long getMatricula() {
        return matricula;
    }

    public double getNota() {
        return nota;
    }

    @Override
    public int compareTo(Aluno a) {
        return nomeDoAluno.compareTo(a.getNomeDoAluno());
    }

    @Override
    public String toString() {
        return "\nAluno -> " +
                "Nome: " + nomeDoAluno +
                " - Matricula: " + matricula +
                " - Nota: " + nota;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Aluno aluno = (Aluno) o;
        return getMatricula() == aluno.getMatricula();
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getMatricula());
    }
}

class ComparatorPorNota implements Comparator<Aluno> {

    @Override
    public int compare(Aluno a1, Aluno a2) {
        return Double.compare(a1.getNota(), a2.getNota());
    }
}