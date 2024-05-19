package main.java.set.Ordenacao;

import java.util.Comparator;
import java.util.Objects;

public class Produto implements Comparable<Produto> {


    private long codigoDoProduto;
    private String nomeDoProduto;
    private double preco;
    private int quantidade;

    public Produto(long codigoDoProduto, String nomeDoProduto, double preco, int quantidade) {
        this.codigoDoProduto = codigoDoProduto;
        this.nomeDoProduto = nomeDoProduto;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    @Override
    public int compareTo(Produto p) {
        return nomeDoProduto.compareToIgnoreCase(p.getNomeDoProduto());
    }

    public long getCodigoDoProduto() {
        return codigoDoProduto;
    }

    public String getNomeDoProduto() {
        return nomeDoProduto;
    }

    public double getPreco() {
        return preco;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Produto produto = (Produto) o;
        return getCodigoDoProduto() == produto.getCodigoDoProduto();
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getCodigoDoProduto());
    }

    @Override
    public String toString() {
        return "Produto{" +
                "codigoDoProduto=" + codigoDoProduto +
                ", nomeDoProduto='" + nomeDoProduto + '\'' +
                ", preco=" + preco +
                ", quantidade=" + quantidade +
                '}';
    }
}

class ComparatorPorPreco implements Comparator<Produto> {

    @Override
    public int compare(Produto p1, Produto p2) {
        return Double.compare(p1.getPreco(), p2.getPreco());
    }
}
