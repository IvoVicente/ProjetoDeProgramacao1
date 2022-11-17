package br.com.ifood.entidades;

import java.util.Objects;

public class ProdutoChave {
    private Long codigoDeBarra;
    private Estabelecimento estabelecimento;

    public Long getCodigoDeBarra() {
        return codigoDeBarra;
    }

    public void setCodigoDeBarra(Long codigoDeBarra) {
        this.codigoDeBarra = codigoDeBarra;
    }

    public Estabelecimento getEstabelecimento() {
        return estabelecimento;
    }

    public void setEstabelecimento(Estabelecimento estabelecimento) {
        this.estabelecimento = estabelecimento;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ProdutoChave that = (ProdutoChave) o;
        return Objects.equals(codigoDeBarra, that.codigoDeBarra) && Objects.equals(estabelecimento, that.estabelecimento);
    }

    @Override
    public int hashCode() {
        return Objects.hash(codigoDeBarra, estabelecimento);
    }

    @Override
    public String toString() {
        return "ProdutoChave{" +
                "codigoDeBarra=" + codigoDeBarra +
                ", estabelecimento=" + estabelecimento +
                '}';
    }
}
