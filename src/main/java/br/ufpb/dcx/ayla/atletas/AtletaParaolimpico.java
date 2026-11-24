package br.ufpb.dcx.ayla.atletas;

import java.util.List;

public class AtletaParaolimpico extends Atleta{

    private String tipoAtletaParaolimpico;

    public AtletaParaolimpico(String codigo, int idade, List<Telefone> telefones, String tipoAtletaParaolimpico){
        super(codigo, idade, telefones);
        this.tipoAtletaParaolimpico = tipoAtletaParaolimpico;
    }

    public String getTipoAtletaParaolimpico(){
        return this.tipoAtletaParaolimpico;
    }
}
