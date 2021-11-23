package br.com.java.controller;

import java.util.ArrayList;

import br.com.java.interfaces.IController;
import br.com.java.modelo.Venda;

public class VendaControle implements IController<Venda> {

    static ArrayList<Venda> vendas = new ArrayList<Venda>();

    @Override
    public void cadastrar(Venda venda) {
        // TODO Auto-generated method stub
        vendas.add(venda);
        
    }

    @Override
    public ArrayList<Venda> listar() {
        // TODO Auto-generated method stub
        return vendas;
    }
    
}
