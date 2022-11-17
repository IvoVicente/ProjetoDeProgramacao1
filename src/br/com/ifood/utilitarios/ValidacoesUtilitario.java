package br.com.ifood.utilitarios;

public final class ValidacoesUtilitario {

    public static boolean validarCPF(String cpf) {
        return cpf.length() == 11 && ehApenasNumeros(cpf);
    }

    public static boolean validarCNPJ(String cnpj) {
        return cnpj.length() == 14 && ehApenasNumeros(cnpj);
    }

    public static boolean ehApenasNumeros(String texto) {
        for (Character c : texto.toCharArray()) {
            if (!Character.isDigit(c)) {
                return false;
            }
        }
        return true;
    }
}
