package br.ufpb.dcx.ayla.atletas;

import java.util.List;
public class Atleta {
    private String codigo;
    private int idade;
    private List<Telefone> telefones;


    public Atleta(String codigo, int idade, List<Telefone> telefones) {
        this.codigo = codigo;
        this.idade = idade;
        this.telefones = telefones;
    } //… outros métodos da classe
    //TODO

    public String getCodigo(){
        return this.codigo;
    }

    public int getIdade(){
        return this.idade;
    }

    public void cadastraTelefone(Telefone tel){
        this.telefones.add(tel);
    }
}

