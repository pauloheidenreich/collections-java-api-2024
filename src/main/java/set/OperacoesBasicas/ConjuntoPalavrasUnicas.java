package main.java.set.OperacoesBasicas;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoPalavrasUnicas {

    private Set<String> setDePalavras;

    public ConjuntoPalavrasUnicas() {
        this.setDePalavras = new HashSet<>();
    }

    public void adicionaPalavra(String palavra) {
        setDePalavras.add(palavra);
    }

    public void removerPalavra(String palavra) {
        if (!setDePalavras.isEmpty()){
            if (setDePalavras.contains(palavra)) {
                setDePalavras.remove(palavra);
            } else {
                System.out.println("A palavra não foi encontrada no conjunto!");
            }
        } else {
            System.out.println("O set de palavras está vazio!");
        }
    }

    public boolean verificaPalavras(String palavra) {
        return setDePalavras.contains(palavra);
    }

    public void exibePalavras() {
        if (!setDePalavras.isEmpty()) {
            System.out.println(setDePalavras);
        } else {
            System.out.println("O set de palavras está vazio!");
        }
    }

    public static void main(String[] args) {
        ConjuntoPalavrasUnicas conjunto = new ConjuntoPalavrasUnicas();

        //Adicionando Palavras
        conjunto.adicionaPalavra("Paulo");
        conjunto.adicionaPalavra("Junior");
        conjunto.adicionaPalavra("Junior");
        conjunto.adicionaPalavra("Manuela");
        conjunto.adicionaPalavra("Soraya");

        //Exibindo Palavras
        conjunto.exibePalavras();

        //Removendo palavra
        conjunto.removerPalavra("Junior");
        conjunto.exibePalavras();

        //Removendo palavra inexistente
        conjunto.removerPalavra("Edson");

        //Verificando palavra no set
        System.out.println("A palavra está presente no set?  " + conjunto.verificaPalavras("Soraya"));
        System.out.println("A palavra está presente no set?  " + conjunto.verificaPalavras("Manuela"));

        conjunto.exibePalavras();
    }
}
