package br.com.ifood.entidades;

import br.com.ifood.models.Endereco;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Entregador extends Pessoa implements Entidade<String> {

    private Boolean disponivel;
    private List<Integer> avaliacoes;

    public Entregador() {
        this.avaliacoes = new ArrayList<>();
        this.disponivel = false;
    }

    public Entregador(String cpf, String nome, String telefone, Endereco endereco) {
        super(cpf, nome, telefone, endereco);
        this.avaliacoes = new ArrayList<>();
        this.disponivel = false;
    }

    public Entregador(String cpf, String nome, String telefone, Endereco endereco, Boolean disponivel) {
        this(cpf, nome, telefone, endereco);
        this.disponivel = disponivel;
    }

    public Entregador(String cpf, String nome, String telefone, Endereco endereco, Boolean disponivel, List<Integer> avaliacoes) {
        this(cpf, nome, telefone, endereco, disponivel);
        if (Objects.nonNull(avaliacoes)) {
            this.avaliacoes = avaliacoes;
        }
    }

    public Boolean getDisponivel() {
        return disponivel;
    }

    public void setDisponivel(Boolean disponivel) {
        this.disponivel = disponivel;
    }

    public List<Integer> getAvaliacoes() {
        return avaliacoes;
    }

    public void setAvaliacoes(List<Integer> avaliacoes) {
        this.avaliacoes = avaliacoes;
    }

    @Override
    public String getIdentificador() {
        return getCpf();
    }

    @Override
    public void setIdentificador(String identificador) {
        setCpf(identificador);
    }

    public float getMediaAvaliacao() {
        if (avaliacoes.isEmpty()) {
            return 0f;
        }
        float media = 0f;
        for (Integer avaliacao : avaliacoes) {
            media += avaliacao;
        }
        return media / avaliacoes.size();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Entregador that = (Entregador) o;
        return Objects.equals(getCpf(), that.getCpf());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getCpf());
    }

    @Override
    public String toString() {
        return "Entregador{" +
                "cpf='" + getCpf() + '\'' +
                ", nome='" + getNome() + '\'' +
                ", telefone='" + getTelefone() + '\'' +
                ", endereco=" + getEndereco() +
                ", disponivel=" + disponivel +
                ", avaliacoes=" + avaliacoes +
                '}';
    }
}
