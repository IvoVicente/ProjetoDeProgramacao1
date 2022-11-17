package br.com.ifood.repositorios;

import br.com.ifood.entidades.Produto;
import br.com.ifood.entidades.Usuario;

import java.util.ArrayList;
import java.util.List;

public class UsuarioRepositorio extends RepositorioAbstrato<Usuario, String> {
    private static List<Usuario> usuarios = new ArrayList<>();

    @Override
    protected List<Usuario> pegarListaElementos() {
        return UsuarioRepositorio.usuarios;
    }
}
