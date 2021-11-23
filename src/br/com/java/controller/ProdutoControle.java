package br.com.java.controller;

import java.util.ArrayList;

import br.com.java.interfaces.IController;
import br.com.java.modelo.Produto;
import br.com.java.utils.Console;

public class ProdutoControle implements IController<Produto> {

    static ArrayList<Produto> produtos = new ArrayList<Produto>();

    @Override
    public void cadastrar(Produto produto) {
        // TODO Auto-generated method stub
        int i = encontrarProduto(produto);

        if (i == -1) {
            produtos.add(produto);
            Console.MensagemGenericaSucesso();
        } else {
            Console.MensagemGenericaErro();
        }
    }

    private static int encontrarProduto(Produto produto) {
        int i = -1;

        for(Produto cadastrado : produtos) {
            i++;

            if (cadastrado.getNomeProduto().equalsIgnoreCase(produto.getNomeProduto())) {
                return i;
            }
        }

        return -1;
    }

    @Override
    public ArrayList<Produto> listar() {
        // TODO Auto-generated method stub
        return produtos;
    }
    
}
