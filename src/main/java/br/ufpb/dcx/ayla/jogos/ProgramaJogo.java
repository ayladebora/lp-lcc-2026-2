package br.ufpb.dcx.ayla.jogos;

public class ProgramaJogo {
    public static void main(String [] args){
        Jogo jogo1 = new Jogo("Botafogo","Fluminense",1,1);
        System.out.println(jogo1.toString());
        jogo1.setNumGolsTime1(2);
        jogo1.setNumGolsTime2(2);
        System.out.println("Jogo modificado:"+ jogo1.toString());
    }
}
