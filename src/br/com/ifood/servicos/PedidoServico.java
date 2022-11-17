package br.com.ifood.servicos;

import br.com.ifood.entidades.Pedido;
import br.com.ifood.repositorios.PedidoRepositorio;
import br.com.ifood.repositorios.RepositorioAbstrato;

public class PedidoServico extends ServicoAbstrato<Pedido, Long> {
    private PedidoRepositorio repositorio = new PedidoRepositorio();

    @Override
    protected RepositorioAbstrato<Pedido, Long> pegarRepositorio() {
        return repositorio;
    }
}
