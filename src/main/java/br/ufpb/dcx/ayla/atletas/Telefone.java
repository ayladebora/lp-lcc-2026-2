package br.ufpb.dcx.ayla.atletas;

public class Telefone {
    private String DDD;
    private String numero;
    private String tipo;

    public Telefone(String DDD, String numero, String tipo) {
        this.DDD = DDD;
        this.numero = numero;
        this.tipo = tipo;
    } //… outros métodos da classe

    public String toString(){
        return "("+this.DDD+") "+ this.numero;
    }
//TODO
}
