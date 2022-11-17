package br.com.ifood.repositorios;

import br.com.ifood.entidades.Entidade;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public abstract class RepositorioAbstrato<T extends Entidade<K>, K> implements Repositorio<T, K> {

    protected abstract List<T> pegarListaElementos();

    public void inserir(T elemento) {
        pegarListaElementos().add(elemento);
    }

    public T buscarElemento(K identificador) {
        for (T elemento : pegarListaElementos()) {
            if (elemento.getIdentificador().equals(identificador)) {
                return elemento;
            }
        }
        return null;
    }

    public List<T> todosOsElementos() {
        return List.copyOf(pegarListaElementos());
    }

    public void atualizar(K identificador, T elemento) {
        T elementoAntigo = buscarElemento(identificador);
        if (Objects.nonNull(elementoAntigo)) {
            int index = pegarListaElementos().indexOf(elementoAntigo);
            pegarListaElementos().set(index, elemento);
        }
    }

    public void remover(K identificador) {
        T elemento = buscarElemento(identificador);
        if (Objects.nonNull(elemento)) {
            pegarListaElementos().remove(elemento);
        }
    }
}
