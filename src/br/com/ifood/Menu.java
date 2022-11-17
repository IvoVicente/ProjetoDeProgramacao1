package br.com.ifood;

import br.com.ifood.entidades.Usuario;
import br.com.ifood.servicos.EntregadorServico;
import br.com.ifood.servicos.EstabelecimentoServico;
import br.com.ifood.servicos.PedidoServico;
import br.com.ifood.servicos.ProdutoServico;
import br.com.ifood.servicos.UsuarioServico;

import java.util.Scanner;

public class Menu {

    private Scanner entrada = new Scanner(System.in);

    private EntregadorServico entregadorServico;
    private EstabelecimentoServico estabelecimentoServico;
    private PedidoServico pedidoServico;
    private ProdutoServico produtoServico;
    private UsuarioServico usuarioServico;

    public void inicializar() {
        menuEntrada();
    }

    private void menuEntrada() {
        System.out.println("---------------------------------------------------");
        System.out.println("Bem vindo ao sistema do IFood! qual opção você deseja?");
        System.out.println("'1'- login");
        System.out.println("'2'- cadastro");
        System.out.println("'0'- sair");

        int opcao = entrada.nextInt();

        switch (opcao) {
            case 1:
                menuLogin();
                break;

            case 2:
                menuQuerIrPraCadastro();
                break;

            case 0:
                System.out.println("Obrigado, volte sempre!");
                break;

            default:
        }

    }

    private void menuLogin() {
        System.out.println("---------------------------------------------------");
        System.out.println("Digite '1'- para colocar a usa conta ");
        System.out.println("'0'- voltar");
        System.out.println("'-1'- sair");

        int opcao = entrada.nextInt();
        switch (opcao) {
            case 1:
                menuConta();
                break;

            case 0:
                menuEntrada();
                break;

            case -1:
                System.out.println("Obrigado, volte sempre!");
                break;

            default:
        }
    }

    private void menuConta() {
        System.out.println("---------------------------------------------------");
        System.out.println("Usuario: ");
        String o = entrada.next();
        System.out.println("Senha: ");
        String o1 = entrada.next();
        System.out.println("Logado com sucesso");
        menuPrincipal();

    }
    //private void menuCadastro() {
    // System.out.println("---------------------------------------------------");
    // System.out.println("Menu de cadastro! qual opção de cadastro você deseja efetuar?");
    //  System.out.println("1 - Cliente");
    //  System.out.println("2 - Loja");
    //  System.out.println("0 - voltar");

    // int opcao = entrada.nextInt();

    //  switch (opcao){
    //    case 1:
    //         menuCadastroUsuario();
    //        break;

    //   case 2:
    //      menuCadastroLojas();
    //      break;

    //  case 0:
    //      menuPrincipal();
    //     break;
    // default:

    //}
    // }


    //private void menuCadastroLojas() {


    //}

    private void menuLojas() {
        System.out.println("------------------------------------------------");
        System.out.println("Você está no menu loja! qual loja vai querer?");
        System.out.println("1- Mc donalds");
        System.out.println("2- Bobs ");
        System.out.println("3- Burguer king");
        System.out.println("4- Habib´s");
        System.out.println("0- voltar ");
        System.out.println("-1- sair ");

        int opcao = entrada.nextInt();
        switch (opcao) {
            case 1:
                menuMcDonalds();
                break;

            case 2:
                menuBobs();
                break;

            case 3:
                menuBurgueKing();
                break;

            case 4:
                menuHabibs();
                break;

            case 0:
                menuPrincipal();
                break;

            case -1:
                System.out.println("Obrigado, volte sempre!");
                break;
            default:

        }

    }

    private void menuMcDonalds() {
        System.out.println("------------------------------------------------");
        System.out.println("Você está no Mc Donalds! qual seu pedido?");
        System.out.println("1- Bic Mac (R$15)");
        System.out.println("2- MacFritas (R$5) ");
        System.out.println("3- Chicken McNuggets (R$8)");
        System.out.println("0- voltar ");
        System.out.println("-1- sair");


        int opcao = entrada.nextInt();
        switch (opcao) {
            case 1:
                menuQuerMais();
                break;
            case 2:
                menuQuerMais();
                break;
            case 3:
                menuQuerMais();
                break;
            case 0:
                menuLojas();
                break;
            case -1:
                System.out.println("Obrigado, volte sempre!");
                break;
            default:
        }

    }

    private void menuBobs() {
        System.out.println("------------------------------------------------");
        System.out.println("Você está no Bob´s! qual seu pedido?");
        System.out.println("1- Cheddar Australiano (R$18)");
        System.out.println("2- Milk Shake Morango (R$12)");
        System.out.println("3- Franlitos (R$7)");
        System.out.println("0- voltar");
        System.out.println("-1- sair");


        int opcao = entrada.nextInt();

        switch (opcao) {
            case 1:
                menuQuerMais();
                break;
            case 2:
                menuQuerMais();
                break;
            case 3:
                menuQuerMais();
                break;
            case 0:
                menuLojas();
                break;
            case -1:
                System.out.println("Obrigado, volte sempre!");
                break;
            default:
        }
    }

    private void menuBurgueKing() {
        System.out.println("------------------------------------------------");
        System.out.println("Você está no Burgue King! qual seu pedido?");
        System.out.println("1- WHOPPER (R$14)");
        System.out.println("2- Shake Oreo (R$10)");
        System.out.println("3- Batata Furiosa (R$8)");
        System.out.println("0- voltar");
        System.out.println("-1- sair");


        int opcao = entrada.nextInt();

        switch (opcao) {
            case 1:
                menuQuerMais();
                break;
            case 2:
                menuQuerMais();
                break;
            case 3:
                menuQuerMais();
                break;
            case 0:
                menuLojas();
                break;
            case -1:
                System.out.println("Obrigado, volte sempre!");
                break;
            default:
        }
    }

    private void menuHabibs() {
        System.out.println("------------------------------------------------");
        System.out.println("Você está no Habib´s! qual seu pedido?");
        System.out.println("1- ESFIHA (R$1)");
        System.out.println("2- Pizza (R$23)");
        System.out.println("3- HABIBÃO (R$14)");
        System.out.println("0- voltar");
        System.out.println("-1- sair");


        int opcao = entrada.nextInt();

        switch (opcao) {
            case 1:
                menuQuerMais();
                break;
            case 2:
                menuQuerMais();
                break;
            case 3:
                menuQuerMais();
                break;
            case 0:
                menuLojas();
                break;
            case -1:
                System.out.println("Obrigado, volte sempre!");
                break;
            default:
        }
    }

    private void menuQuerMais() {
        System.out.println("------------------------------------------------");
        System.out.println("Vai querer mais alguma coisa ?");
        System.out.println("1- Sim ");
        System.out.println("2- Não");
        System.out.println("0- voltar");
        System.out.println("-1- sair ");

        int opcao = entrada.nextInt();
        switch (opcao) {
            case 1:
                menuLojas();
                break;
            case 2:
                menuFormaDePagamento();
                break;
            case 0:
                menuLojas();
                break;
            case -1:
                System.out.println("Obrigado, volte sempre!");
                break;
            default:

        }
    }


    // private void menuCadastroUsuario() {
    //   System.out.println("------------------------------------------------");
    //   System.out.println("Menu de cadastro de usuario! qual opção você deseja efetuar?");
    //  System.out.println("1 - Novo Cadastro");
    //  System.out.println("2 - Atualizar Cadastro");
    //  System.out.println("0- voltar");


    // int opcao = entrada.nextInt();
    // switch (opcao){
    //    case 1:
    //      menuCadastroNovoUsuario();
    //     break;
    //  case 2:
    //   menuCadastroAtualizarUsuario();
    //   break;
    // case 0:
    //    menuPrincipal();
    //   break;
    // default:
    // }


    // }


    private void menuQuerIrPraCadastro() {
        System.out.println("---------------------------------------------------");
        System.out.println("Digite '1'- para fazer Cadrastro ");
        System.out.println("'0'- voltar");
        System.out.println("'-1'- sair");

        int opcao = entrada.nextInt();
        switch (opcao) {
            case 1:
                menuCadastroNovoUsuario();
                break;

            case 0:
                menuEntrada();
                break;

            case -1:
                System.out.println("Obrigado, volte sempre!");
                break;

            default:
        }


    }

    private void menuCadastroNovoUsuario() {

        System.out.println("Qual o seu nome?");
        String nome = entrada.next();
        System.out.println("Seu CPF?");
        String cpf = entrada.next();
        System.out.println("Seu telefone?");
        int telefone = entrada.nextInt();
        System.out.println("Seu endereço?");
        String endereco = entrada.next();
        System.out.println("Cadastro feito com susseço");
        menuPrincipal();

    }

    private void menuPrincipal(){
        System.out.println("---------------------------------------------------");
        System.out.println("Digite '1'- para Lojas ");
        System.out.println("'0'- voltar");
        System.out.println("'-1'- sair");

        int opcao = entrada.nextInt();
        switch (opcao) {
            case 1:
                menuLojas();
                break;

            case 0:
                menuEntrada();
                break;

            case -1:
                System.out.println("Obrigado, volte sempre!");
                break;

            default:
        }
    }


    private void menuFormaDePagamento(){
        System.out.println("Qual é a forma de pagamento ?");
        System.out.println("1. Dinheiro");
        System.out.println("2.Cartão");
        System.out.println("3. PIX");
        System.out.println("'0'- voltar");
        System.out.println("'-1'- sair");
        int opcao = entrada.nextInt();
        switch (opcao) {
            case 1:
                menuTroco();
                break;

            case 2:
                menuCartao();
                break;

            case 3:
                System.out.println("Pago com sucesso!, esperando o produto chegar! OBG POR USAR O NOSSO APP");
                break;

            case 0:
                menuQuerMais();
                break;

            case -1:
                System.out.println("Obrigado, volte sempre!");
                break;

            default:
        }
    }

    private void menuCartao(){
        System.out.println("Qual tipo do Cartão ?");
        System.out.println("1. Debito");
        System.out.println("2. Credito");
        System.out.println("'0'- voltar");
        System.out.println("'-1'- sair");

        int opcao = entrada.nextInt();
        switch (opcao) {
            case 1:
                System.out.println("O pagamento por debito foi feito com sucesso." +
                        " Esperando o produto chegar! OBG POR USAR O NOSSO APP ");
                break;

            case 2:
                System.out.println("O pagamento por credito foi feito com sucesso." +
                        " Esperando o produto chegar! OBG POR USAR O NOSSO APP");
                break;

            case 0:
                menuFormaDePagamento();
                break;

            case -1:
                System.out.println("Obrigado, volte sempre!");
                break;

            default:
        }
    }

    private void menuTroco(){
        System.out.println("Vai querer troco ?");
        System.out.println("1. sim");
        System.out.println("2. não");
        System.out.println("'0'- voltar");
        System.out.println("'-1'- sair");

        int opcao = entrada.nextInt();
        switch (opcao) {
            case 1:
                System.out.println("Certo!, a compra foi feito com sucesso." +
                        " Esperando o produto chegar! OBG POR USAR O NOSSO APP ");
                break;

            case 2:
                System.out.println("Ok!, a compra  foi feito com sucesso." +
                        " Esperando o produto chegar! OBG POR USAR O NOSSO APP");
                break;

            case 0:
                menuFormaDePagamento();
                break;

            case -1:
                System.out.println("Obrigado, volte sempre!");
                break;

            default:
        }

    }

}



    //private Usuario pegarDadosUsuario() {
     //   Usuario usuario = new Usuario();

     //   usuario.setNome(pegarDadosUsuario().getNome());


     //   return usuario;
   // }

//}




