package br.ufpb.dcx.ayla.animais;

public class Animal {
    private String nome;
    private int idade;

    public Animal(String nome, int idade){
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome(){
        return this.nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public int getIdade(){
        return this.idade;
    }

    @Override
    public String toString(){
        return "Animal "+ this.nome + " que tem "+ this.idade+" anos";
    }

}
