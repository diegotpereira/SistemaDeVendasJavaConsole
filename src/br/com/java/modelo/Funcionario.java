package br.com.java.modelo;

public class Funcionario extends Pessoa {
    
    protected double salario;
    protected String matricula;
    protected double comissao;

    public Funcionario(String nome, String cpf, double salario, String matricula) {
        super(nome, cpf);
        this.salario = salario;
        this.matricula = matricula;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public double getComissao() {
        return comissao;
    }

    public void setComissao(double comissao) {
        this.comissao = comissao;
    }

    @Override
    public String toString() {
        return "Funcionario [comissao=" + comissao + ", nome=" + nome + ", cpf=" + cpf + ", salario=" + salario + "]";
    }
}
