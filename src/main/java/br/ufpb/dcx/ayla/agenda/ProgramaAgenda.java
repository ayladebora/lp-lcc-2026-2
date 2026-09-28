package br.ufpb.dcx.ayla.agenda;

import javax.swing.*;

public class ProgramaAgenda {

    public static void main(String [] args){

        boolean continuar = true;
        while(continuar){
            String opcao = JOptionPane.showInputDialog("Digite uma opção:\n1.Cadastrar contato\n2.Listar contatos\n3.Sair");
            switch(opcao){
                case "1":
                    JOptionPane.showMessageDialog(null,"Vou cadastrar");
                    String logradouro = JOptionPane.showInputDialog("Qual o nome da rua/avenida?");
                    String numero = JOptionPane.showInputDialog("Qual o número?");
                    String bairro = JOptionPane.showInputDialog("Qual o bairro?");
                    String cidade = JOptionPane.showInputDialog("Qual a cidade?");
                    String estado = JOptionPane.showInputDialog("Qual o estado?");
                    Endereco endereco = new Endereco(logradouro, numero, bairro, cidade, estado);
                    JOptionPane.showMessageDialog(null, endereco);
                    System.out.println(endereco);


                    break;
                case "2":
                    JOptionPane.showMessageDialog(null,"Listando contatos...");
                    break;
                case "3":
                    continuar = false;
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opção inválida");
            }

        }
        System.out.println("Fim");

    }
}
