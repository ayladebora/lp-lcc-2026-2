package br.ufpb.dcx.ayla.atendimentos;

import java.util.Scanner;

public class ProgramaAtendimentos {

    public static void main(String [] args){
        Scanner leitor = new Scanner(System.in);
        Paciente paciente1 = new Paciente();
        Paciente paciente2 = new Paciente("Ayla",
                "05/10/1980", "123.123.123-12");
        System.out.println(paciente1.getNome());
        System.out.println(paciente2.getNome());
        paciente1.setNome("Rodrigo");

        System.out.println(paciente1.getNome());
        System.out.println("Informações dos pacientes:");
        System.out.println(paciente1.toString());
        System.out.println(paciente2.toString());
        leitor.close();
    }
}
