package br.com.ifood.servicos;

import br.com.ifood.entidades.Entidade;
import br.com.ifood.repositorios.Repositorio;

import java.util.List;
import java.util.Objects;

public abstract class ServicoAbstrato<T extends Entidade<K>, K> implements Servico<T, K> {

    protected abstract Repositorio<T, K> pegarRepositorio();

    public void inserir(T elemento) {
        if (Objects.isNull(elemento.getIdentificador())) {
            gerarIdentificador(elemento);
            pegarRepositorio().inserir(elemento);
        } else {
            if (existeElemento(elemento.getIdentificador())) {
                System.out.println("Identificador já existe na lista");
            } else {
                pegarRepositorio().inserir(elemento);
            }
        }
    }

    private void gerarIdentificador(T elemento) {
        K identificadorMaximo = null;
        for (T elementoLista : todosOsElementos()) {
            if (elementoLista.getIdentificador() instanceof Number) {
                if (Objects.isNull(identificadorMaximo)) {
                    identificadorMaximo = elementoLista.getIdentificador();
                } else {
                    Number idOld = (Number) elementoLista.getIdentificador();
                    Number idMax = (Number) identificadorMaximo;
                    if (idOld.doubleValue() > idMax.doubleValue()) {
                        identificadorMaximo = elementoLista.getIdentificador();
                    }
                }
            }
        }

        if (identificadorMaximo == null) {
            identificadorMaximo = (K) ((Number) 1);
        } else {
            double novoIdentificador = ((Number) identificadorMaximo).doubleValue() + ((Number) 1).doubleValue();
            identificadorMaximo = (K) ((Number) novoIdentificador);
        }
        elemento.setIdentificador(identificadorMaximo);
    }

    public T buscarElemento(K identificador) {
        if (validarIndentificador(identificador)) {
            return pegarRepositorio().buscarElemento(identificador);
        }
        return null;
    }

    public boolean existeElemento(K identificador) {
        return pegarRepositorio().existeElemento(identificador);
    }

    public List<T> todosOsElementos() {
        return pegarRepositorio().todosOsElementos();
    }

    public void atualizar(K identificador, T elemento) {
        if (validaAtualizar(identificador, elemento)) {
            if (Objects.isNull(elemento.getIdentificador())
                    || (identificador instanceof String &&
                    elemento.getIdentificador().toString().isBlank())) {
                elemento.setIdentificador(identificador);
            }
            pegarRepositorio().atualizar(identificador, elemento);
        }
    }

    public void remover(K identificador) {
        if (validaRemover(identificador)) {
            pegarRepositorio().remover(identificador);
        }
    }

    public void save(T elemento) {
        if (Objects.isNull(elemento.getIdentificador())) {
            inserir(elemento);
        } else {
            save(elemento.getIdentificador(), elemento);
        }
    }

    public void save(K identificador, T elemento) {
        if (validarIndentificador(identificador)) {
            if (existeElemento(identificador)) {
                atualizar(identificador, elemento);
            } else {
                elemento.setIdentificador(identificador);
                inserir(elemento);
            }
        }
    }

    protected boolean validaAtualizar(K identificador, T elemento) {
        return validarIndentificador(identificador);
    }

    protected boolean validaRemover(K identificador) {
        return validarIndentificador(identificador);
    }

    private boolean validarIndentificador(K identificador) {
        if (Objects.isNull(identificador) ||
                (identificador instanceof String && identificador.toString().isBlank())) {
            System.out.println("Identificador Inválido");
            return false;
        }
        return true;
    }

}
