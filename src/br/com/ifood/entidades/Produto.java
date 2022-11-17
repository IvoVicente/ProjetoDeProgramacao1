package br.com.ifood.entidades;

import java.util.Objects;

public class Produto implements Entidade<ProdutoChave> {

    private ProdutoChave id;
    private String nome;
    private Float valor;

    public Produto() {}

    public Produto(ProdutoChave id, String nome, Float valor) {
        this.nome = nome;
        this.valor = valor;
    }

    public ProdutoChave getId() {
        return id;
    }

    public void setId(ProdutoChave id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Float getValor() {
        return valor;
    }

    public void setValor(Float valor) {
        this.valor = valor;
    }

    @Override
    public ProdutoChave getIdentificador() {
        return getId();
    }

    @Override
    public void setIdentificador(ProdutoChave identificador) {
        setId(identificador);
    }

    public float valorComDesconto(float percentual) {
        if (Objects.isNull(this.valor)) {
            return 0f;
        }
        return this.valor - (this.valor * percentual);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Produto produto = (Produto) o;
        return Objects.equals(id, produto.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "Produto{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", valor=" + valor +
                '}';
    }
}
