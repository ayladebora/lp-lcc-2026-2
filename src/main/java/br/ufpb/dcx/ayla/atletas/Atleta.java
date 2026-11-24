package br.ufpb.dcx.ayla.atletas;

import java.util.List;
import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Atleta atleta = (Atleta) o;
        return Objects.equals(codigo, atleta.codigo);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(codigo);
    }

    public void cadastraTelefone(Telefone tel){
        this.telefones.add(tel);
    }
}

