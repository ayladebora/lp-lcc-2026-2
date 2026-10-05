package br.ufpb.dcx.ayla.revisao;

import br.ufpb.dcx.ayla.jogos.Jogo;

import java.util.Scanner;

public class Aleatorio {

    public static void main(String [] args){
        Scanner leitor = new Scanner(System.in);
        System.out.println("Qual o primeiro time?");
        String nomeTime1= leitor.nextLine();
        System.out.println("Qual o segundo time?");
        String nomeTime2= leitor.nextLine();
        System.out.println("Quantos gols fez "+ nomeTime1+ "?");
        int numGolsTime1= Integer.parseInt(leitor.nextLine());
        System.out.println("Quantos gols fez "+ nomeTime2+ "?");
        int numGolsTime2= Integer.parseInt(leitor.nextLine());
        Jogo j = new Jogo(nomeTime1, nomeTime2, numGolsTime1, numGolsTime2);
        if (j.getNumGolsTime1()==j.getNumGolsTime2()){
            System.out.println("Foi empate");
        } else if (j.getNumGolsTime1()> j.getNumGolsTime2()){
            System.out.println(j.getNomeTime1()+" ganhou");
        } else {
            System.out.println(j.getNomeTime2()+ " ganhou");
        }

        leitor.close();
    }
}
