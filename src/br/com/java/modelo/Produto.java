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

    public String getNomeProduto() {
        return nomeProduto;
    }



    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }



    public int getQuantidade() {
        return quantidade;
    }



    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }



    public double getPreco() {
        return preco;
    }



    public void setPreco(double preco) {
        this.preco = preco;
    }



    @Override
    public String toString() {
        return "Produto [nomeProduto=" + nomeProduto + ", preco=" + preco + ", quantidade=" + quantidade + "]";
    }
}
