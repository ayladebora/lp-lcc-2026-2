package br.ufpb.dcx.ayla.atletas;

import java.util.ArrayList;
import java.util.List;
public class MeuSistemaGerenciaDeAtletas implements SistemaGerenciaDeAtletas {
    private List<Atleta> atletas;
    private GravadorDeAtletas gravador;

    public MeuSistemaGerenciaDeAtletas() {
        this.atletas = new ArrayList<>();
    }

    public void cadastrarTelefoneDeAtleta(String codigoAtleta, Telefone tel)
        throws AtletaNaoExisteException{
        for (Atleta a : this.atletas) {
            if (a.getCodigo().equals(codigoAtleta)) {
                a.cadastraTelefone(tel);
                return;
            }
        }
        throw new AtletaNaoExisteException("Não existe atleta com o código "+ codigoAtleta);
    }//… Outros métodos da classe
//TODO: Implementar outros métodos da interface

    public List<Atleta> pesquisarAtletasComIdadeEntre(
            int idadeInferior, int idadeSuperior){
        List<Atleta> atletasPorIdade = new ArrayList<>();
        for(Atleta a: this.atletas){
            if (a.getIdade()>=idadeInferior && a.getIdade()<=idadeSuperior){
                atletasPorIdade.add(a);
            }
        }
        return atletasPorIdade;
    }


    public void cadastrarAtleta(String codigoAtleta, int idade,
                                List<Telefone> telefones){
        //TODO
    }

    public int pesquisarMaiorIdadeDosAtletas(){
        //TODO
        return -1;
    }

    public boolean apagarTelefoneDeAtleta(String codigoAtleta, Telefone tel){
        //TODO
        return false;
    }


}