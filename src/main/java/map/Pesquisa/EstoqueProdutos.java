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

    public static void main(String[] args) {

        EstoqueProdutos estoqueProdutos = new EstoqueProdutos();

        estoqueProdutos.adicionarProduto(1L,"CPU", 1500.00, 5);
        estoqueProdutos.adicionarProduto(2L,"Teclado", 100.00, 5);
        estoqueProdutos.adicionarProduto(3L,"Mouse", 80.00, 5);
        estoqueProdutos.adicionarProduto(4L,"Monitor", 80.00, 5);

        estoqueProdutos.exibirEstoqueProdutos();
    }
}
