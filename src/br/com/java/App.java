package br.com.java;

import java.util.ArrayList;

import br.com.java.controller.ClienteControle;
import br.com.java.controller.FormaPagamentoControle;
import br.com.java.controller.FuncionarioControle;
import br.com.java.controller.ProdutoControle;
import br.com.java.controller.VendaControle;
import br.com.java.modelo.Cliente;
import br.com.java.modelo.FormaPagamento;
import br.com.java.modelo.Funcionario;
import br.com.java.modelo.ItemVenda;
import br.com.java.modelo.Produto;
import br.com.java.modelo.Venda;
import br.com.java.utils.Console;

public class App {

    static ClienteControle cl = new ClienteControle();
    static FuncionarioControle fc = new FuncionarioControle();
    static ProdutoControle pd = new ProdutoControle();
    static FormaPagamentoControle fp = new FormaPagamentoControle();
    static VendaControle vd = new VendaControle();

    public static void main(String[] args) throws Exception {

        System.out.println("-- Bem Vindo ao Sistema --\n");

        String [] Menu = 
                        {
                            "Cadastrar Cliente",
                            "Listar Clientes",
                            "Cadastrar Funcionário",
                            "Listar Funcionários",
                            "Cadastrar Produtos",
                            "Cadastrar Formas de Pagamento",
                            "Cadastrar Venda",
                            "Listar Vendas"
                        };
        boolean con = true;

        do {
            int opcao = Console.mostrarMenu(Menu, "", "voltar");

            switch (opcao) {
                case 1:
                    String nome = Console.recuperaTexto("Informe o nome do cliente: ");
                    String email =Console.recuperaTexto("Informe o email do cliente: ");
                    String cpf =  Console.recuperaTexto("Informe o CPF do cliente: ");
                    Cliente cliente = new Cliente(nome, cpf, email);
                    cl.cadastrar(cliente);
                    break;

                 case 2:
                    System.out.println("-- Listando Clientes --");
                    System.out.println(cl.listar());
                    break;

                case 3:
                    nome = Console.recuperaTexto("Informe o nome do funcionário: ");
                    cpf = Console.recuperaTexto("Informe o CPF do funcionário: ");
                    String matricula = Console.recuperaTexto("Informe o número de matrícula: ");
                    double salario = Console.recuperaDecimal("Informe o valor do salário do funcionário R$: ");
                    Funcionario funcionario = new Funcionario(nome, cpf, salario, matricula);
                    fc.cadastrar(funcionario);
                    break;

                case 4:
                    System.out.println(fc.listar());
                    break;

                case 5:
                    nome = Console.recuperaTexto("Informe o nome do produto: ");
                    int qtd = Console.recuperaInteiro("Informe a quantidade desse produto: ");
                    double preco = Console.recuperaDecimal("Informe o preço unitário desse produto: ");
                    Produto produto = new Produto(nome, qtd, preco);

                    pd.cadastrar(produto);

                    System.out.println(pd.listar());
                    break;

                case 6:
                    String texto = Console.recuperaTexto("Informe a forma de pagamento");
                    FormaPagamento formaPagamento = new FormaPagamento(texto);

                    fp.cadastrar(formaPagamento);
                    break;

                case 7: 
                    Venda venda = new Venda();
                    
                    ArrayList<ItemVenda> itens = new ArrayList<ItemVenda>();

                    String funcionarioVenda = Console.recuperaTexto("Identifique o funcionário: ");

                    if (fc.VerificaFuncionario(funcionarioVenda) == true) {
                        String clienteVenda = Console.recuperaTexto("Identifique o cliente: ");

                        if (cl.VerificaIdentidade(clienteVenda) == true) {
                            
                            String produtoVenda = Console.recuperaTexto("Informe o produto: ");
                            int quantidadeProduto = Console.recuperaInteiroPositivo("Informe a quantidade: ");

                            if (pd.validaProduto(produtoVenda, quantidadeProduto) == true) {
                                String pagamentoVenda = Console.recuperaTexto("Informe o método de pagamento");

                                venda.setItens(itens);

                                if (fp.validaPagamento(pagamentoVenda) == false) {
                                    System.out.println("Forma de pagamento não encontrada! ");
                                }

                            } else {
                                System.out.println("Produto não encontrado ou estoque inferior a quantidade comprada");
                            }

                        } else {
                            System.out.println("Cliente não encontrado");
                        }

                    } else {
                        System.out.println("Funcionário não encontrado!");
                    }
                    vd.cadastrar(venda);
                    break;

                case 8:
                System.out.println(vd.listar());
                break;

                case -1:
                System.out.println("Saindo do Sistema");
                con = false;
                break;
            }
        } while (con);
    }
}
