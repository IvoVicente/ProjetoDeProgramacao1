package br.com.ifood.servicos;

import br.com.ifood.entidades.Estabelecimento;
import br.com.ifood.repositorios.EstabelecimentoRepositorio;
import br.com.ifood.repositorios.RepositorioAbstrato;
import br.com.ifood.utilitarios.ValidacoesUtilitario;

public class EstabelecimentoServico extends ServicoAbstrato<Estabelecimento, String> {
    private EstabelecimentoRepositorio repositorio = new EstabelecimentoRepositorio();

    @Override
    protected RepositorioAbstrato<Estabelecimento, String> pegarRepositorio() {
        return repositorio;
    }

    @Override
    public void inserir(Estabelecimento elemento) {
        if (ValidacoesUtilitario.validarCPF(elemento.getCnpj())) {
            super.inserir(elemento);
        } else {
            System.out.println("CNPJ Inválido (" + elemento.getCnpj() + ")");
        }
    }
}
