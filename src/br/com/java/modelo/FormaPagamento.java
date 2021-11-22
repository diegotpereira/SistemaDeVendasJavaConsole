package br.com.java.modelo;


public class FormaPagamento {
    
    protected String nomeFP;

    public FormaPagamento(String nome) {
        this.nomeFP = nome;
    }

    public String getNomeFP() {
        return nomeFP;
    }

    public void setNomeFP(String nomeFP) {
        this.nomeFP = nomeFP;
    }
}
