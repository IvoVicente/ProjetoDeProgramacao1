package br.com.ifood.models;

import java.util.Objects;

public class Endereco {

    private String cep;
    private String estado;
    private String cidade;
    private String logradouro;
    private String bairro;
    private String numero;
    private String complemento;

    public Endereco(String cep, String estado, String cidade, String logradouro, String bairro, String numero) {
        this.cep = cep;
        this.estado = estado;
        this.cidade = cidade;
        this.logradouro = logradouro;
        this.bairro = bairro;
        this.numero = numero;
    }

    public Endereco(String cep, String estado, String cidade, String logradouro, String bairro, String numero, String complemento) {
        this(cep, estado, cidade, logradouro, bairro, numero);
        this.complemento = complemento;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Endereco endereco = (Endereco) o;
        return Objects.equals(cep, endereco.cep) && Objects.equals(estado, endereco.estado) && Objects.equals(cidade, endereco.cidade) && Objects.equals(logradouro, endereco.logradouro) && Objects.equals(bairro, endereco.bairro) && Objects.equals(numero, endereco.numero) && Objects.equals(complemento, endereco.complemento);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cep, estado, cidade, logradouro, bairro, numero, complemento);
    }

    @Override
    public String toString() {
        return "Endereco{" +
                "cep='" + cep + '\'' +
                ", estado='" + estado + '\'' +
                ", cidade='" + cidade + '\'' +
                ", logradouro='" + logradouro + '\'' +
                ", bairro='" + bairro + '\'' +
                ", numero='" + numero + '\'' +
                ", complemento='" + complemento + '\'' +
                '}';
    }
}
