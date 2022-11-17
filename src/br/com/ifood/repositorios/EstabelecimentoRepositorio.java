package br.com.ifood.repositorios;

import br.com.ifood.entidades.Estabelecimento;

import java.util.ArrayList;
import java.util.List;

public class EstabelecimentoRepositorio extends RepositorioAbstrato<Estabelecimento, String> {
    private static List<Estabelecimento> estabelecimentos = new ArrayList<>();

    @Override
    protected List<Estabelecimento> pegarListaElementos() {
        return EstabelecimentoRepositorio.estabelecimentos;
    }
}
