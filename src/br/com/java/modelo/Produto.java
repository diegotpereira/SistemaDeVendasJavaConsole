package br.com.java.modelo;

public class Produto {
    
    protected String nomeProduto;
    protected int quantidade;
    protected double preco;
    
    public Produto(String nomeProduto, int quantidade, double preco) {
        this.nomeProduto = nomeProduto;
        this.quantidade = quantidade;
        this.preco = preco;
    }

    @Override
    public String toString() {
        return "Produto [nomeProduto=" + nomeProduto + ", preco=" + preco + ", quantidade=" + quantidade + "]";
    }
}
