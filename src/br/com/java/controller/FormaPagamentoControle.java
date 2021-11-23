package br.com.java.controller;

import java.util.ArrayList;

import br.com.java.interfaces.IController;
import br.com.java.modelo.FormaPagamento;
import br.com.java.utils.Console;

public class FormaPagamentoControle implements IController<FormaPagamento>{

    static ArrayList<FormaPagamento> formas = new ArrayList<FormaPagamento>();

    @Override
    public void cadastrar(FormaPagamento formaPagamento) {
        // TODO Auto-generated method stub
        int i = encontrarForma(formaPagamento);

        if (i == -1) {
            formas.add(formaPagamento);
            Console.MensagemGenericaSucesso();

        } else {
            Console.MensagemGenericaErro();
        }
    }

    private static int encontrarForma(FormaPagamento formaPagamento) {
        int i = -1;

        for(FormaPagamento formasCadastradas : formas) {
            i++;

            if (formasCadastradas.getNomeFP().equalsIgnoreCase(formaPagamento.getNomeFP())) {
                return 1;
            }
        }
        return -1;
    }

    @Override
    public ArrayList<FormaPagamento> listar() {
        // TODO Auto-generated method stub
        return formas;
    }
    
    public boolean validaPagamento(String pagamento) {
        for(FormaPagamento formaPagamento : formas) {
            if (pagamento.equalsIgnoreCase(formaPagamento.getNomeFP())) {
                return true;
            }
        }

        return false;
    }
}
