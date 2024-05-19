package main.java.set.Ordenacao;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class CadastroProdutos {

    private Set<Produto> produtoSet;

    public CadastroProdutos() {
        this.produtoSet = new HashSet<>();
    }

    public void adicionarProduto(long codigoDoProduto, String nomeDoProduto, double preco, int quantidade) {
       produtoSet.add(new Produto(codigoDoProduto, nomeDoProduto, preco, quantidade));
    }

    public Set<Produto> exibirProdutosPorNome() {
        Set<Produto> produtoPorNome = new TreeSet<>(produtoSet);
        return produtoPorNome;
    }

    public Set<Produto> exibirProdutosPorPreco() {
        Set<Produto> produtoPorPreco = new TreeSet<>(new ComparatorPorPreco());
        produtoPorPreco.addAll(produtoSet);
        return produtoPorPreco;
    }

    public static void main(String[] args) {

        CadastroProdutos cadastroProdutos = new CadastroProdutos();

        cadastroProdutos.adicionarProduto(1L, "Produto B", 15d, 5);
        cadastroProdutos.adicionarProduto(2L, "Produto Y", 20d, 10);
        cadastroProdutos.adicionarProduto(1L, "Produto A", 10d, 2);
        cadastroProdutos.adicionarProduto(9L, "Produto Z", 2d, 2);

        //Listando produtos
        System.out.println(cadastroProdutos.produtoSet);
        System.out.println("-".repeat(50));
        //Exibindo por Nome
        System.out.println(cadastroProdutos.exibirProdutosPorNome());
        System.out.println("-".repeat(50));
        //Exibindo por preço
        System.out.println(cadastroProdutos.exibirProdutosPorPreco());
    }
}

