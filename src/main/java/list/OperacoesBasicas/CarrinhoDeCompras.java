package main.java.list.OperacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
    private List<Item> carrinhoDeCompras;

    public CarrinhoDeCompras(){
        this.carrinhoDeCompras = new ArrayList<>();
    }

    public void adicionarItem(String nome, double preco, int quantidade){
        carrinhoDeCompras.add(new Item(nome, preco, quantidade));
    }

    public void removerItem(String nome){
        List<Item> listaParaRemover = new ArrayList<>();
        if (!carrinhoDeCompras.isEmpty()){
            for (Item item : carrinhoDeCompras){
                if (item.getNome().equalsIgnoreCase(nome)){
                    listaParaRemover.add(item);
                }
            }
            carrinhoDeCompras.removeAll(listaParaRemover);
        } else {
            System.out.println("A lista esta vazia!");
        }
//        for(int i = 0; i < carrinhoDeCompras.size(); i++){
//            if(carrinhoDeCompras.get(i).getNome().equalsIgnoreCase(nome)){
//                carrinhoDeCompras.remove(i);
//            }
//        }
    }

    public double calcularValorTotal(){
        double total = 0;
        if (!carrinhoDeCompras.isEmpty()){
            for (Item item : carrinhoDeCompras){
                double valorItem = item.getPreco() * item.getQuantidade();
                total += valorItem;
            }
            return total;
        } else {
            throw new RuntimeException("A lista esta vazia!");
        }
//        for(int i = 0; i < carrinhoDeCompras.size(); i++){
//            total += carrinhoDeCompras.get(i).getPreco();
//        }
//        return total;
    }

    public void exibirItens(){
        if (!carrinhoDeCompras.isEmpty()){
            System.out.println(this.carrinhoDeCompras);
        } else {
            System.out.println("A lista esta vazia!");
        }
//        String itens = "";
//        for(int i = 0; i < carrinhoDeCompras.size(); i++){
//            System.out.println(carrinhoDeCompras.get(i));
//        }
    }

    public static void main(String[] args) {
        CarrinhoDeCompras carrinho = new CarrinhoDeCompras();

        carrinho.adicionarItem("Monitor", 200.00, 1);
        carrinho.adicionarItem("Monitor", 200.00, 1);
        carrinho.adicionarItem("CPU", 500.00, 3);
        carrinho.adicionarItem("Mouse", 50.00, 1);
        carrinho.adicionarItem("Teclado", 80.00, 1);

        carrinho.exibirItens();
        System.out.println("Valor total: " + carrinho.calcularValorTotal());
        carrinho.removerItem("Monitor");

        System.out.println("\nDepois da remoção de item\n");

        carrinho.exibirItens();
        System.out.println("Valor total: " + carrinho.calcularValorTotal());

    }
}
