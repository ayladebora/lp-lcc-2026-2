package br.ufpb.dcx.ayla.encomendas;

public class PedidoNaoExisteException extends Exception{

    public PedidoNaoExisteException(String msg){
        super(msg);
    }
}
