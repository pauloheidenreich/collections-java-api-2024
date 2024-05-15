package main.java.list.Pesquisa;

import java.util.ArrayList;
import java.util.List;

public class SomaNumeros {

    private List<Integer> listaDeNumeros;

    public SomaNumeros() {
        listaDeNumeros = new ArrayList<>();
    }

    private void adicionarNumero(int numero) {
        listaDeNumeros.add(numero);
    }

    private int calcularSoma() {
        int soma = 0;
        for (Integer numero : listaDeNumeros) {
            soma += numero;
        }
        return soma;
    }

    public int encontrarMaiorNumero() {
        if (!listaDeNumeros.isEmpty()) {
            int numero = listaDeNumeros.get(0);
            for (int i = 1; i < listaDeNumeros.size(); i++) {
                if (numero < listaDeNumeros.get(i)) {
                    numero = listaDeNumeros.get(i);
                }
            }
            return numero;
        } else {
            throw new RuntimeException("A Lista esta vazia!");
        }
    }

    public int encontrarMenorNumero() {
        if (!listaDeNumeros.isEmpty()) {
            int numero = listaDeNumeros.get(0);
            for (int i = 1; i < listaDeNumeros.size(); i++) {
                if (numero > listaDeNumeros.get(i)) {
                    numero = listaDeNumeros.get(i);
                }
            }
            return numero;
        } else {
            throw new RuntimeException("A Lista esta vazia!");
        }
    }

    public void exibirNumeros() {
        if (!listaDeNumeros.isEmpty()) {
            System.out.println(this.listaDeNumeros);
        } else {
            System.out.println("A Lista está vazia!");
        }
    }

    public static void main(String[] args) {
        SomaNumeros somaNumeros = new SomaNumeros();
        somaNumeros.adicionarNumero(5);
        somaNumeros.adicionarNumero(0);
        somaNumeros.adicionarNumero(0);
        somaNumeros.adicionarNumero(-2);
        somaNumeros.adicionarNumero(10);

        System.out.println("Os números adicionados foram:");
        somaNumeros.exibirNumeros();

        System.out.println("Calculando a soma dos números: " + somaNumeros.calcularSoma());
        System.out.println("Calculando o maior número: " + somaNumeros.encontrarMaiorNumero());
        System.out.println("Calculando o menor número: " + somaNumeros.encontrarMenorNumero());
    }
}
