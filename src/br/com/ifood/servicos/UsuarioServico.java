package br.com.ifood.servicos;

import br.com.ifood.entidades.Usuario;
import br.com.ifood.repositorios.RepositorioAbstrato;
import br.com.ifood.repositorios.UsuarioRepositorio;
import br.com.ifood.utilitarios.ValidacoesUtilitario;

public class UsuarioServico extends ServicoAbstrato<Usuario, String> {
    private UsuarioRepositorio repositorio = new UsuarioRepositorio();

    @Override
    protected RepositorioAbstrato<Usuario, String> pegarRepositorio() {
        return repositorio;
    }

    @Override
    public void inserir(Usuario elemento) {
        if (ValidacoesUtilitario.validarCPF(elemento.getCpf())) {
            super.inserir(elemento);
        } else {
            System.out.println("CPF Inválido (" + elemento.getCpf() + ")");
        }
    }
}
