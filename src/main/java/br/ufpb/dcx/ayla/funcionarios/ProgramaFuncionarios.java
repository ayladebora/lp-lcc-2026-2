package br.ufpb.dcx.ayla.funcionarios;

import javax.swing.*;

public class ProgramaFuncionarios {
    public static void main(String [] args){
        SistemaFuncionariosList sistema = new SistemaFuncionariosList();

        boolean sair = false;
        while(!sair){
            String opcao = JOptionPane.showInputDialog("Digite uma opção:\n1.Cadastrar funcionário\n2.Pesquisar pelo CPF\n3.Sair");
            if (opcao.equals("1")){
                String nome = JOptionPane.showInputDialog("Digite o nome");
                String cpf = JOptionPane.showInputDialog("Digite o CPF");
                int cargaHoraria = Integer.parseInt(JOptionPane.showInputDialog("Digite a carga horária semanal"));
                String funcao = JOptionPane.showInputDialog("Digite a função");
                sistema.cadastrarFuncionario(cpf, nome, cargaHoraria, funcao);
                JOptionPane.showMessageDialog(null, "Funcionário cadastrado com sucesso");
            } else if (opcao.equals("2")){
                String cpfAPesquisar = JOptionPane.showInputDialog("Qual o CPF a pesquisar?");
                Funcionario funcionarioEncontrado = sistema.pesquisarFuncionarioPorCpf(cpfAPesquisar);
                if (funcionarioEncontrado == null){
                    JOptionPane.showMessageDialog(null, "Funcionário não encontrado");
                } else {
                    JOptionPane.showMessageDialog(null, funcionarioEncontrado.toString());
                }
            } else if (opcao.equals("3")){
                sair = true;
            } else {
                JOptionPane.showMessageDialog(null, "Opção inválida. Tente novamente...");
            }
        }
    }
}
