package br.ufpb.dcx.ayla.animais;

public class Cachorro extends Animal{

    private String raca;
    private String latido;

    public Cachorro(String nome, int idade, String raca, String latido){
        super(nome, idade);
        this.raca = raca;
        this.latido = latido;
    }

    public String getRaca(){
        return this.raca;
    }

    public void setRaca(String raca){
        this.raca = raca;
    }

    public String getLatido(){
        return this.latido;
    }
    public void setLatido(String latido){
        this.latido = latido;
    }
}
