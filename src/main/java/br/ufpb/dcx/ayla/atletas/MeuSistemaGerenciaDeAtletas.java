package br.ufpb.dcx.ayla.atletas;

import java.util.ArrayList;
import java.util.List;
public class MeuSistemaGerenciaDeAtletas implements SistemaGerenciaDeAtletas {
    private List<Atleta> atletas;

    public MeuSistemaGerenciaDeAtletas() {
        this.atletas = new ArrayList<>();
    }

    public boolean cadastrarTelefoneDeAtleta(String codigoAtleta, Telefone tel) {
        for (Atleta a : this.atletas) {
            if (a.getCodigo().equals(codigoAtleta)) {
                a.cadastraTelefone(tel);
                return true;
            }
        }
        return false;
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