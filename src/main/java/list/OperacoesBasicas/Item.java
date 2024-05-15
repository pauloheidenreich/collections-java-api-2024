package main.java.list.OperacoesBasicas;

public class Item {
    private String nome;
    private double preco;
    public int quantidade;

    public Item(String nome, double preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    @Override
    public String toString() {
        return  "Nome = " + nome +
                ", Preço = " + preco +
                ", Quantidade = " + quantidade;
    }
}
