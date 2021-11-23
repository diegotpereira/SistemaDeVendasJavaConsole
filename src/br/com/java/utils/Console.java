package br.com.java.utils;

import java.util.Scanner;

// criação do arquivo classe de controle de entrada e saida de dados do console.

public class Console {
    
    private static Scanner teclado = new Scanner(System.in);

    // Metodo para mostrar menu de seleções de opções
    public static int mostrarMenu(String[] opcoes, String titulo, String descricao) {
        int opcaoEscolhida = 0;

        if (titulo == null) {
            System.out.println("Por Favor Selecione uma Opção: ");

        } else {
            System.out.println(titulo);
        }

        for(int i = 0; i < opcoes.length; i++) {
            System.out.println(i + 1 + ") " + opcoes[i]);
        }

        if (descricao == null) {
            System.out.println(opcoes.length + 1 + ") Para sair.");
        } else {
            System.out.println(opcoes.length + 1 + ")" + descricao + ".");
        }

        try {
            opcaoEscolhida = recuperaInteiroPositivo(descricao);

            if (opcaoEscolhida == opcoes.length +1) {
                
                return -1;
            }
        } catch (Exception e) {
            //TODO: handle exception
            opcaoEscolhida = mostrarMenu(opcoes, "Você selecionou uma opção inválida", descricao);
        }
        return opcaoEscolhida;
    }

    // Método para realizar a captura de dados decimais no console
    public static Double recuperaDecimal(String descricao) {
        Double valor;

        try {
            valor = Double.parseDouble(recuperaTexto(descricao));
        } catch (Exception e) {
            //TODO: handle exception
            valor = recuperaDecimal(descricao);
        }

        return valor;
    }

    // Método para realizar captura de dados inteiros no console
    public static Integer recuperaInteiro(String descricao) {
        Integer valor;

        try {
            valor = Integer.parseInt(recuperaTexto(descricao));
        } catch (Exception e) {
            //TODO: handle exception
            valor = recuperaInteiro(descricao);
        }
        return valor;
    }
    // Métod para realizar a captura de dados inteiros positivos no console
    public static Integer recuperaInteiroPositivo(String descricao) {
        Integer valor = null;

        do {
            valor = recuperaInteiro(descricao);
            if (valor < 0) {
                System.out.println("Digite um valor positivo.");
            }
        } while (valor < 0);

        return valor;
    }

    // Método para realizar a captura de dados de texto no console
    public static String recuperaTexto(String descricao) {
        String valor;

        if (descricao == null) {
            System.out.println("Entre com um valor");
        } else {
            System.out.println(descricao);
        }

        try {
            valor = teclado.nextLine();
        } catch (Exception e) {
            //TODO: handle exception
            valor = recuperaTexto(descricao);
        }
        return valor;
    }

    // Método de mensagem generica de erro
    public static void MensagemGenericaErro() {
        System.out.println("Valor duplicado, não foi possível cadastrar");
    }

    // Método de mensagem generica de sucesso
    public static void MensagemGenericaSucesso() {
        System.out.println("Cadastro realizado com sucesso!");
    }
}
