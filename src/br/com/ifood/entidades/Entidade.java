package br.com.ifood.entidades;

public interface Entidade<K> {

    K getIdentificador();

    void setIdentificador(K identificador);

}
