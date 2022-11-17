package br.com.ifood.servicos;

import br.com.ifood.entidades.Entregador;
import br.com.ifood.repositorios.EntregadorRepositorio;
import br.com.ifood.repositorios.RepositorioAbstrato;
import br.com.ifood.utilitarios.ValidacoesUtilitario;

public class EntregadorServico extends ServicoAbstrato<Entregador, String> {
    private EntregadorRepositorio repositorio = new EntregadorRepositorio();

    @Override
    protected RepositorioAbstrato<Entregador, String> pegarRepositorio() {
        return repositorio;
    }

    @Override
    public void inserir(Entregador elemento) {
        if (ValidacoesUtilitario.validarCPF(elemento.getCpf())) {
            super.inserir(elemento);
        } else {
            System.out.println("CPF Inválido (" + elemento.getCpf() + ")");
        }
    }
}
