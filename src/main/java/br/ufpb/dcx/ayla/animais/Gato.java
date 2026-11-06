package br.ufpb.dcx.ayla.animais;

public class Gato extends Animal{

    private boolean ehPeludo;

    public Gato(String nome, int idade, boolean ehPeludo){
        super(nome, idade);
        this.ehPeludo = ehPeludo;
    }

    public boolean ehPeludo(){
        return this.ehPeludo;
    }

    public void setEhPeludo(boolean ehPeludo){
        this.ehPeludo = ehPeludo;
    }
}
