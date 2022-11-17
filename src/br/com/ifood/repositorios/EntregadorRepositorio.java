package br.com.ifood.repositorios;

import br.com.ifood.entidades.Entregador;
import br.com.ifood.entidades.Estabelecimento;

import java.util.ArrayList;
import java.util.List;

public class EntregadorRepositorio extends RepositorioAbstrato<Entregador, String> {
    private static List<Entregador> entregadores = new ArrayList<>();

    @Override
    protected List<Entregador> pegarListaElementos() {
        return EntregadorRepositorio.entregadores;
    }
}
