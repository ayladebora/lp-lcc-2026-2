package br.ufpb.dcx.ayla.jogos;

import java.util.Scanner;

public class ProgramaCampeonatoDeFutebol {
    public static void main(String [] args){
        Scanner leitor = new Scanner(System.in);
        System.out.println("Quantos jogos aconteceram no campeonato?");
        int quantJogos = Integer.parseInt(leitor.nextLine());
        Jogo [] jogos = new Jogo[quantJogos];
        int k=0;
        while(k<quantJogos){
            System.out.println("Qual o primeiro time?");
            String nomeTime1= leitor.nextLine();
            System.out.println("Qual o segundo time?");
            String nomeTime2= leitor.nextLine();
            System.out.println("Quantos gols fez "+ nomeTime1+ "?");
            int numGolsTime1= Integer.parseInt(leitor.nextLine());
            System.out.println("Quantos gols fez "+ nomeTime2+ "?");
            int numGolsTime2= Integer.parseInt(leitor.nextLine());
            jogos[k] = new Jogo(nomeTime1, nomeTime2, numGolsTime1, numGolsTime2);
            k++;
        }
        imprimirJogos(jogos);
        int numJogosSemGols = contaTotalDeJogosSemGols(jogos);
        System.out.println("Jogos sem gols:"+ numJogosSemGols);
        imprimirJogosComTime("Palmeiras", jogos);
        leitor.close();
    }

    public static void imprimirJogos(Jogo [] jogosAImprimir){
        for (int k=0; k< jogosAImprimir.length; k++){
            System.out.println(jogosAImprimir[k].toString());
        }
    }

    public static int contaTotalDeJogosSemGols(Jogo [] jogosAContar){
        int contador = 0;
        for (int k=0; k< jogosAContar.length; k++){
            Jogo jogo = jogosAContar[k];
            if (jogo.getNumGolsTime1()==0 && jogo.getNumGolsTime2()==0){
                contador+=1;
            }
        }
        return contador;
    }

    public static void imprimirJogosComTime(String timePesquisado,
                                            Jogo [] jogos){
        for (int k=0; k< jogos.length; k++){
            if (jogos[k].getNomeTime1().equalsIgnoreCase(timePesquisado)
            || jogos[k].getNomeTime2().equalsIgnoreCase(timePesquisado)){
                System.out.println("Jogo:"+jogos[k].getNomeTime1()
                        +"x"+jogos[k].getNomeTime2()
                        +", Placar:"+ jogos[k].getNumGolsTime1()
                        +"x"+jogos[k].getNumGolsTime2());
            }

        }
    }


}
