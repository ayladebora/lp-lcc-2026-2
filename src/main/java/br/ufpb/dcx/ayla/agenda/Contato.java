package br.ufpb.dcx.ayla.agenda;

public class Contato {
    private String nome;
    private Endereco endereco;

    public Contato(String nome, Endereco endereco){
        this.nome = nome;
        this.endereco = endereco;
    }

    public Contato(String nome){
        this(nome, new Endereco());
    }

    public Contato(){
        this("", new Endereco());
    }
}
