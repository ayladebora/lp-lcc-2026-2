package br.ufpb.dcx.ayla.agenda;

public class Endereco {
    private String logradouro;
    private String numero;
    private String bairro;
    private String cidade;
    private String estado;

    public Endereco(String logradouro, String numero, String bairro,
                    String cidade, String estado){
        this.logradouro = logradouro;
        this.numero = numero;
        this.bairro = bairro;
        this.cidade = cidade;
        this.estado = estado;
    }

    public Endereco(){
        this("", "", "", "", "");
    }

    public Endereco(String logradouro){
        this(logradouro,"","","Rio Tinto","PP");
    }

    public String getLogradouro(){
        return this.logradouro;
    }

    public String toString(){
        return this.logradouro+","+this.numero+", "+this.cidade+"-"+this.estado;
    }



}
