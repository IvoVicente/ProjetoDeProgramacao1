package br.com.ifood.servicos;

import br.com.ifood.entidades.Produto;
import br.com.ifood.entidades.ProdutoChave;
import br.com.ifood.repositorios.ProdutoRepositorio;
import br.com.ifood.repositorios.RepositorioAbstrato;

public class ProdutoServico extends ServicoAbstrato<Produto, ProdutoChave> {
    private ProdutoRepositorio repositorio = new ProdutoRepositorio();

    @Override
    protected RepositorioAbstrato<Produto, ProdutoChave> pegarRepositorio() {
        return repositorio;
    }
}
