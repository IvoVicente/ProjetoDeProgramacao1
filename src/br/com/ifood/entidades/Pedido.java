package br.com.ifood.entidades;

import br.com.ifood.enums.StatusPedidoEnum;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Objects;

public class Pedido implements Entidade<Long> {

    private Long codigoDeBarra;
    private Estabelecimento estabelecimento;
    private Entregador entregador;
    private Usuario usuario;
    private Float valor;
    private LocalDateTime horaPedido;
    private StatusPedidoEnum status;
    private List<Produto> produtos;

    public Pedido(Long codigoDeBarra, Estabelecimento estabelecimento, Entregador entregador, Usuario usuario,
                  Float valor, LocalDateTime horaPedido, StatusPedidoEnum status) {
        this.codigoDeBarra = codigoDeBarra;
        this.estabelecimento = estabelecimento;
        this.entregador = entregador;
        this.usuario = usuario;
        this.valor = valor;
        this.horaPedido = horaPedido;
        this.status = status;
        this.produtos = produtos;
    }

    public Pedido(Long codigoDeBarra, Estabelecimento estabelecimento, Entregador entregador, Usuario usuario,
                  Float valor, LocalDateTime horaPedido, StatusPedidoEnum status, List<Produto> produtos) {
        this(codigoDeBarra, estabelecimento, entregador, usuario, valor, horaPedido, status);
        if (Objects.nonNull(produtos)) {
            this.produtos = produtos;
        }
    }

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

    public Entregador getEntregador() {
        return entregador;
    }

    public void setEntregador(Entregador entregador) {
        this.entregador = entregador;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Float getValor() {
        return valor;
    }

    public void setValor(Float valor) {
        this.valor = valor;
    }

    public LocalDateTime getHoraPedido() {
        return horaPedido;
    }

    public void setHoraPedido(LocalDateTime horaPedido) {
        this.horaPedido = horaPedido;
    }

    public StatusPedidoEnum getStatus() {
        return status;
    }

    public void setStatus(StatusPedidoEnum status) {
        this.status = status;
    }

    public List<Produto> getProdutos() {
        return produtos;
    }

    public void setProdutos(List<Produto> produtos) {
        this.produtos = produtos;
    }

    @Override
    public Long getIdentificador() {
        return getCodigoDeBarra();
    }

    @Override
    public void setIdentificador(Long identificador) {
        setCodigoDeBarra(identificador);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pedido pedido = (Pedido) o;
        return Objects.equals(codigoDeBarra, pedido.codigoDeBarra);
    }

    @Override
    public int hashCode() {
        return Objects.hash(codigoDeBarra);
    }

    @Override
    public String toString() {
        return "Pedido{" +
                "codigoDeBarra=" + codigoDeBarra +
                ", estabelecimento=" + estabelecimento +
                ", entregador=" + entregador +
                ", usuario=" + usuario +
                ", valor=" + valor +
                ", horaPedido=" + horaPedido +
                ", status=" + status +
                ", produtos=" + produtos +
                '}';
    }
}
