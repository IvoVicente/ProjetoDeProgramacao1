package br.com.ifood.repositorios;

import br.com.ifood.entidades.Entidade;

import java.util.List;
import java.util.Objects;

public interface Repositorio<T extends Entidade<K>, K> {

    void inserir(T elemento);

    T buscarElemento(K identificador);

    default boolean existeElemento(K identificador) {
        return Objects.nonNull(buscarElemento(identificador));
    }

    List<T> todosOsElementos();

    void atualizar(K identificador, T elemento);

    void remover(K identificador);

}
