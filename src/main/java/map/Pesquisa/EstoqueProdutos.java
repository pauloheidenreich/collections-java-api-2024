package main.java.map.Pesquisa;

import java.util.HashMap;
import java.util.Map;

public class EstoqueProdutos {
    private Map<Long, Produto> estoqueProdutosMap;

    public EstoqueProdutos() {
        this.estoqueProdutosMap = new HashMap<>();
    }

    public void adicionarProduto(Long id, String nome, double preco, int quantidade) {
        estoqueProdutosMap.put(id, new Produto(nome, preco, quantidade));
    }

    public void exibirEstoqueProdutos() {
        System.out.println(estoqueProdutosMap);
    }

    public double calcularValorTotalEstoque() {
        double totalEstoque = 0;
        if (!estoqueProdutosMap.isEmpty()) {
            for (Produto produto : estoqueProdutosMap.values()) {
                totalEstoque += produto.getPreco() * produto.getQuantidade();
            }
        } else {
            System.out.println("O estoque é de: " + totalEstoque + " produtos.");;
        }
        return totalEstoque;
    }

    public Produto buscarProdutoMaisCaro() {
        Produto produtoMaisCaro = null;
        double maiorPreco = Double.MIN_VALUE;
        if (!estoqueProdutosMap.isEmpty()) {
            for (Produto produto : estoqueProdutosMap.values()) {
                if (produto.getPreco() > maiorPreco) {
                    produtoMaisCaro = produto;
                    maiorPreco = produto.getPreco();
                }
            }
        }
        return produtoMaisCaro;
    }

    public static void main(String[] args) {

        EstoqueProdutos estoqueProdutos = new EstoqueProdutos();

        estoqueProdutos.adicionarProduto(2L,"Teclado", 100.00, 5);
        estoqueProdutos.adicionarProduto(1L,"CPU", 1500.00, 5);
        estoqueProdutos.adicionarProduto(3L,"Mouse", 80.00, 5);
        estoqueProdutos.adicionarProduto(4L,"Monitor", 600.00, 5);

        estoqueProdutos.exibirEstoqueProdutos();

        System.out.println("O valor total do estoque é: $" + estoqueProdutos.calcularValorTotalEstoque());
        System.out.println("O produto mais caro do estoque é: " + estoqueProdutos.buscarProdutoMaisCaro());
    }

}
