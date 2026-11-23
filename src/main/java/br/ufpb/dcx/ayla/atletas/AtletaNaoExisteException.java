package br.ufpb.dcx.ayla.atletas;

public class AtletaNaoExisteException extends Exception{
    public AtletaNaoExisteException(String msg){
        super(msg);
    }

    public AtletaNaoExisteException(){
        super("Erro: Atleta não existe");
    }
}
