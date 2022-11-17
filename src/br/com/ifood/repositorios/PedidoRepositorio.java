package br.com.ifood.repositorios;

import br.com.ifood.entidades.Entregador;
import br.com.ifood.entidades.Pedido;

import java.util.ArrayList;
import java.util.List;

public class PedidoRepositorio extends RepositorioAbstrato<Pedido, Long> {
    private static List<Pedido> pedidos = new ArrayList<>();

    @Override
    protected List<Pedido> pegarListaElementos() {
        return PedidoRepositorio.pedidos;
    }
}
