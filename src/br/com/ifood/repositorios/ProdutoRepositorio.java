package br.com.ifood.repositorios;

import br.com.ifood.entidades.Pedido;
import br.com.ifood.entidades.Produto;
import br.com.ifood.entidades.ProdutoChave;

import java.util.ArrayList;
import java.util.List;

public class ProdutoRepositorio extends RepositorioAbstrato<Produto, ProdutoChave> {
    private static List<Produto> produtos = new ArrayList<>();

    @Override
    protected List<Produto> pegarListaElementos() {
        return ProdutoRepositorio.produtos;
    }
}
