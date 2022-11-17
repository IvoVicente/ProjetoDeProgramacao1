package br.com.ifood.entidades;

import br.com.ifood.models.Endereco;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Usuario extends Pessoa implements Entidade<String> {

    private List<Pedido> pedidos;

    public Usuario() {
        this.pedidos = new ArrayList<>();
    }

    public Usuario(String cpf, String nome, String telefone, Endereco endereco) {
        super(cpf, nome, telefone, endereco);
        this.pedidos = new ArrayList<>();
    }

    public Usuario(String cpf, String nome, String telefone, Endereco endereco, List<Pedido> pedidos) {
        this(cpf, nome, telefone, endereco);
        if (Objects.nonNull(pedidos)) {
            this.pedidos = pedidos;
        }
    }

    public List<Pedido> getPedidos() {
        return pedidos;
    }

    public void setPedidos(List<Pedido> pedidos) {
        this.pedidos = pedidos;
    }

    @Override
    public String getIdentificador() {
        return getCpf();
    }

    @Override
    public void setIdentificador(String identificador) {
        setCpf(identificador);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Usuario usuario = (Usuario) o;
        return Objects.equals(getCpf(), usuario.getCpf());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getCpf());
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "cpf='" + getCpf() + '\'' +
                ", nome='" + getNome() + '\'' +
                ", telefone='" + getTelefone() + '\'' +
                ", endereco=" + getEndereco() +
                ", pedidos=" + pedidos +
                '}';
    }
}
