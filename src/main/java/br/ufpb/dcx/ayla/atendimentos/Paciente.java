package br.ufpb.dcx.ayla.atendimentos;

public class Paciente {

    private String nome;
    private String cpf;
    private String dataNascimento;
    private Endereco endereco;


    public Paciente(){
        this.nome = "Sem nome";
        this.cpf = "Sem CPF";
        this.dataNascimento = "01/01/2001";
        this.endereco = new Endereco();
    }

    public Paciente(String nome, String dataNascimento,
                    String cpf){
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.cpf = cpf;
        this.endereco = new Endereco();
    }

    public String getNome(){
        return this.nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String toString(){
        return "Paciente de nome "+ this.nome+ " que nasceu no dia "+
                this.dataNascimento;
    }

}
