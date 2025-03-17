import AparelhoTelefonico.AparelhoTelefonico;
import NavegadorNaInternet.NavegadorNaInternet;
import ReprodutorMusical.ReprodutorMusical;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MainApp {

    public static void main(String[] args) {
        AparelhoTelefonico aparelhoTelefonico = new AparelhoTelefonico();
        NavegadorNaInternet navegadorNaInternet = new NavegadorNaInternet();
        ReprodutorMusical reprodutorMusical = new ReprodutorMusical();
        Scanner sc = new Scanner(System.in);

        menuIphone();
        while (true) {
            try {
                switch (sc.nextInt()) {
                    case 1 -> aparelhoTelefonico.ligar("(63) 99999-8888");
                    case 2 -> aparelhoTelefonico.atender();
                    case 3 -> aparelhoTelefonico.iniciarCorreioVoz();
                    case 4 -> navegadorNaInternet.exibirPagina("https://www.google.com.br");
                    case 5 -> navegadorNaInternet.adicionarNovaAba();
                    case 6 -> navegadorNaInternet.atualizarPagina();
                    case 7 -> reprodutorMusical.tocar();
                    case 8 -> reprodutorMusical.pausar();
                    case 9 -> reprodutorMusical.selecionarMusica("Sereníssima");
                    case 0 -> sair();
                    default -> System.out.println("Opção inválida! Tente novamente.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Erro: Entrada inválida! Digite um número.");
                sc.nextLine();
            }
            menuIphone();
        }
//        System.out.println("*** Aparelho Telefônico ***");
//        aparelhoTelefonico.ligar("6399999-8888");
//        aparelhoTelefonico.atender();
//        aparelhoTelefonico.iniciarCorreioVoz();
//        System.out.println("-----------------------------------------\n");
//
//        System.out.println("*** Navegador na Internet ***");
//        navegadorNaInternet.exibirPagina("https://www.google.com.br");
//        navegadorNaInternet.adicionarNovaAba();
//        navegadorNaInternet.atualizarPagina();
//        System.out.println("-----------------------------------------\n");
//
//        System.out.println("*** Reprodutor Musical ***");
//        reprodutorMusical.tocar();
//        reprodutorMusical.pausar();
//        reprodutorMusical.selecionarMusica("Sereníssima");
//        System.out.println("-----------------------------------------");
    }

    private static void menuIphone() {
        System.out.println("\n-----------------------------------------------\n" +
                "*** Escolha uma das opções abaixo ***");
        System.out.println("1 - Ligar...");
        System.out.println("2 - Atender...");
        System.out.println("3 - Iniciar Correio de Voz...");
        System.out.println("4 - Exibir Página...");
        System.out.println("5 - Adicionar nova aba...");
        System.out.println("6 - Atualizar página...");
        System.out.println("7 - Tocar...");
        System.out.println("8 - Pausar...");
        System.out.println("9 - Selecionar música...");
        System.out.println("0 - Sair\n");
    }

    private static void sair() {
        System.out.println("Até logo...\nDesligando o aparelho...");
        System.exit(0);
    }
}
