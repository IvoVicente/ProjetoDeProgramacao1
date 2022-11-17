package br.com.ifood.entidades;

import br.com.ifood.models.Endereco;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Estabelecimento implements Entidade<String> {

    private String cnpj;
    private String nomeSocial;
    private String nomeFantasia;
    private Endereco endereco;
    private List<Produto> produtos;

    public Estabelecimento() {
        this.produtos = new ArrayList<>();
    }

    public Estabelecimento(String cnpj, String nomeSocial, String nomeFantasia, Endereco endereco) {
        this();
        this.cnpj = cnpj;
        this.nomeSocial = nomeSocial;
        this.nomeFantasia = nomeFantasia;
        this.produtos = produtos;
        this.endereco = endereco;
    }

    public Estabelecimento(String cnpj, String nomeSocial, String nomeFantasia, Endereco endereco, List<Produto> produtos) {
        this(cnpj, nomeSocial, nomeFantasia, endereco);
        if (Objects.nonNull(produtos)) {
            this.produtos = produtos;
        }
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getNomeSocial() {
        return nomeSocial;
    }

    public void setNomeSocial(String nomeSocial) {
        this.nomeSocial = nomeSocial;
    }

    public String getNomeFantasia() {
        return nomeFantasia;
    }

    public void setNomeFantasia(String nomeFantasia) {
        this.nomeFantasia = nomeFantasia;
    }


    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public List<Produto> getProdutos() {
        return produtos;
    }

    public void setProdutos(List<Produto> produtos) {
        this.produtos = produtos;
    }

    @Override
    public String getIdentificador() {
        return getCnpj();
    }

    @Override
    public void setIdentificador(String identificador) {
        setCnpj(identificador);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Estabelecimento that = (Estabelecimento) o;
        return Objects.equals(cnpj, that.cnpj);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cnpj);
    }

    @Override
    public String toString() {
        return "Estabelecimento{" +
                "cnpj='" + cnpj + '\'' +
                ", nomeSocial='" + nomeSocial + '\'' +
                ", nomeFantasia='" + nomeFantasia + '\'' +
                ", endereco=" + endereco +
                ", produtos=" + produtos +
                '}';
    }
}
