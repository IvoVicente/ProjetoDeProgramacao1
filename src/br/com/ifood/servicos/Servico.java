package br.com.ifood.servicos;

import br.com.ifood.entidades.Entidade;

import java.util.List;

public interface Servico<T extends Entidade<K>, K> {

    T buscarElemento(K identificador);

    List<T> todosOsElementos();

    void atualizar(K identificador, T elemento);

    void remover(K identificador);

}
