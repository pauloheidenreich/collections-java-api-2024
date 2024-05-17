package main.java.set.OperacoesBasicas;

import java.util.Objects;

public class Convidado {
    private String nomeConvidado;
    private int codigoConvite;

    public Convidado(String nomeConvidado, int codigoConvite) {
        this.nomeConvidado = nomeConvidado;
        this.codigoConvite = codigoConvite;
    }

    public String getNomeConvidado() {
        return nomeConvidado;
    }

    public int getCodigoConvite() {
        return codigoConvite;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Convidado convidado = (Convidado) o;
        return getCodigoConvite() == convidado.getCodigoConvite();
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getCodigoConvite());
    }

    @Override
    public String toString() {
        return "Nome: " + nomeConvidado + '\'' +
                ", codigoConvite: " + codigoConvite;
    }
}
