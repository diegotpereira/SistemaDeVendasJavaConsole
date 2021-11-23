package br.com.java.controller;

import java.util.ArrayList;

import br.com.java.interfaces.IController;
import br.com.java.modelo.Cliente;
import br.com.java.utils.Console;

public class ClienteControle implements IController<Cliente> {

    public static ArrayList<Cliente> clientes = new ArrayList<Cliente>();

    @Override
    public void cadastrar(Cliente cliente) {
        // TODO Auto-generated method stub
        int i = encontrarCpf(cliente);

        if (i == -1) {
            clientes.add(cliente);
            Console.MensagemGenericaSucesso();

        } else {
            Console.MensagemGenericaErro();
        }
    }

    private static int encontrarCpf(Cliente cliente) {
        int i = -1;

        for(Cliente cadastrados : clientes) {
            i++;

            if (cadastrados.getCpf().equalsIgnoreCase(cliente.getCpf())) { 
                
                return i;
            }
        }

        return -1;
    }

    @Override
    public ArrayList<Cliente> listar() {
        // TODO Auto-generated method stub
        return clientes;
    }
    public boolean VerificaIdentidade(String nomeCliente) {
        for(Cliente cliente : clientes) {
            if (nomeCliente.equals(cliente.getNome())) {
                return true;
            }
        }

        return false;
    }
}
