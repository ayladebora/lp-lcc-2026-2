package br.ufpb.dcx.ayla.jogos;

public class Jogo {
    private String nomeTime1;
    private String nomeTime2;
    private int numGolsTime1;
    private int numGolsTime2;

    public Jogo(String nomeTime1, String nomeTime2,
                int numGolsTime1, int numGolsTime2){
        this.nomeTime1 = nomeTime1;
        this.nomeTime2 = nomeTime2;
        this.numGolsTime1 = numGolsTime1;
        this.numGolsTime2 = numGolsTime2;
    }

    public Jogo(){
        this("","",0,0);
    }

    public int getNumGolsTime1(){
        return this.numGolsTime1;
    }

    public int getNumGolsTime2(){
        return this.numGolsTime2;
    }

    public void setNumGolsTime1(int numGolsTime1){
        this.numGolsTime1 = numGolsTime1;
    }

    public void setNumGolsTime2(int numGolsTime2){
        this.numGolsTime2 = numGolsTime2;
    }

    public String getNomeTime1(){
        return this.nomeTime1;
    }

    public String getNomeTime2(){
        return this.nomeTime2;
    }

    public String toString(){
        return "Jogo entre "+ this.nomeTime1+ " e " + this.nomeTime2 +" cujo placar foi "+
            this.numGolsTime1+"x"+this.numGolsTime2;
    }

}
