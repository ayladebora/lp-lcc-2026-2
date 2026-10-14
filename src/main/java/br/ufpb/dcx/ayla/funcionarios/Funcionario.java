package br.ufpb.dcx.ayla.funcionarios;

public class Funcionario {

    private String cpf;
    private String nome;
    private int cargaHorariaSemanal;
    private String funcao;

    public Funcionario(String cpf, String nome, int cargaHorariaSemanal, String funcao){
        this.cpf = cpf;
        this.nome = nome;
        this.cargaHorariaSemanal = cargaHorariaSemanal;
        this.funcao = funcao;
    }

    public String getNome(){
        return this.nome;
    }

    public String getCpf(){
        return this.cpf;
    }

    public int getCargaHorariaSemanal(){
        return this.cargaHorariaSemanal;
    }

    public void setCargaHorariaSemanal(int cargaHoraria){
        this.cargaHorariaSemanal = cargaHoraria;
    }


    public String getFuncao(){
        return this.funcao;
    }
    public String toString(){
        return "Funcionário "+ this.nome+" de CPF "+ this.cpf+ " com carga horária semanal de " +
                this.cargaHorariaSemanal+" horas e que trabalha como "+ this.funcao;
    }

}
