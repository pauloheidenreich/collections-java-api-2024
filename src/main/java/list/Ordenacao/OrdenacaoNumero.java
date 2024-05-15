package main.java.list.Ordenacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoNumero {
    private List<Integer> numeroList;

    public OrdenacaoNumero() {
        numeroList = new ArrayList<Integer>();
    }

    public void adicionarNumero(int numero) {
        this.numeroList.add(numero);
    }

    public List<Integer> ordenarAscendente () {
        List<Integer> numerosAscendente = new ArrayList<>(this.numeroList);
        if (!numerosAscendente.isEmpty()) {
            Collections.sort(numerosAscendente);
            return numerosAscendente;
        } else {
            throw new RuntimeException("A Lista está vazia!");
        }
    }

    public List<Integer> ordenarDescendente () {
        List<Integer> numerosDescendente = new ArrayList<>(this.numeroList);
        if (!numerosDescendente.isEmpty()) {
            numerosDescendente.sort(Collections.reverseOrder());
            return numerosDescendente;
        } else {
            throw new RuntimeException("A Lista está vazia!");
        }
    }

    public void exibirNumerosOrdenado () {
        if (!numeroList.isEmpty()) {
            System.out.println("Lista de numeros: " + numeroList);
        } else {
            System.out.println("A Lista está vazia!");
        }
    }

    public static void main(String[] args) {
        OrdenacaoNumero numero = new OrdenacaoNumero();

        numero.adicionarNumero(3);
        numero.adicionarNumero(34);
        numero.adicionarNumero(12);
        numero.adicionarNumero(1);
        numero.adicionarNumero(98);

        numero.exibirNumerosOrdenado();

        System.out.println("Lista de números ascendente: " + numero.ordenarAscendente());
        System.out.println("Lista de números descendente: " + numero.ordenarDescendente());
    }
}
