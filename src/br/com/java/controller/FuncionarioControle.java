package br.com.java.controller;

import java.util.ArrayList;

import br.com.java.interfaces.IController;
import br.com.java.modelo.Funcionario;
import br.com.java.utils.Console;

public class FuncionarioControle implements IController<Funcionario> {

    public static ArrayList<Funcionario> funcionarios = new ArrayList<Funcionario>();

    @Override
    public void cadastrar(Funcionario funcionario) {
        // TODO Auto-generated method stub
        int i = encontrarCpf(funcionario);

        if (i == -1) {
            funcionarios.add(funcionario);
            Console.MensagemGenericaSucesso();
        } else {
            Console.MensagemGenericaErro();
        }
    }

    private static int encontrarCpf(Funcionario funcionario) {
        int i = -1;
        i++;
        
        for(Funcionario cadastrados : funcionarios) {
            i++;

            if (cadastrados.getCpf().equalsIgnoreCase(funcionario.getCpf())) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public ArrayList<Funcionario> listar() {
        // TODO Auto-generated method stub
        return funcionarios;
    }
    
    public boolean VerificaFuncionario(String matricula) {
        for(Funcionario funcionario : funcionarios) {
            if (matricula.equals(funcionario.getMatricula())) {
                return true;
            }
        }
        return false;
    }
}
