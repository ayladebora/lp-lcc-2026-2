package br.ufpb.dcx.ayla.funcionarios;

import java.util.ArrayList;
import java.util.Scanner;

public class TesteFuncionario {

    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        ArrayList<Funcionario> funcionarios = new ArrayList<>();
        boolean continuar = true;
        while(continuar) {
            System.out.println("Digite o nome do funcionário:");
            String nome = input.nextLine();
            System.out.println("Digite o CPF do funcionário:");
            String cpf = input.nextLine();
            System.out.println("Digite a carga horária semanal do funcionário em horas:");
            int cargaHorariaSemanal = Integer.parseInt(input.nextLine());
            System.out.println("Digite a função do funcionário:");
            String funcao = input.nextLine();
            Funcionario funcionario = new Funcionario(cpf, nome, cargaHorariaSemanal, funcao);
            System.out.println(funcionario.toString());
            funcionarios.add(funcionario);
            System.out.println("Deseja cadastrar outro(a) funcionário(a)?S(Sim)/N(Não)");
            String desejaContinuar = input.nextLine();
            if (desejaContinuar.equalsIgnoreCase("N")){
                continuar = false;
            }
        }

        System.out.println("Funcionários cadastrados:");
        for (Funcionario f: funcionarios){
            System.out.println(f.toString());
        }


        input.close();
    }
}
