package br.com.java.modelo;

import java.util.ArrayList;

public class Venda {
    
    Cliente cliente;
    Funcionario funcionario;
    FormaPagamento formaPagamento;
    protected double valorTotal;

    ArrayList<ItemVenda> itens = new ArrayList<>();

    public Venda() {

    }

    public Venda(Cliente cliente, Funcionario funcionario, FormaPagamento formaPagamento, ArrayList<ItemVenda> itens, double valorTotal) {
        this.cliente = cliente;
        this.funcionario = funcionario;
        this.formaPagamento = formaPagamento;
        this.itens = itens;
        this.valorTotal = valorTotal;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Funcionario getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }

    public FormaPagamento getFormaPagamento() {
        return formaPagamento;
    }

    public void setFormaPagamento(FormaPagamento formaPagamento) {
        this.formaPagamento = formaPagamento;
    }

    public ArrayList<ItemVenda> getItens() {
        return itens;
    }

    public void setItens(ArrayList<ItemVenda> itens) {
        this.itens = itens;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }
}
