package br.ufpb.dcx.ayla.atletas;

import java.util.ArrayList;
import java.util.List;
public class TestaSistemaAtletas {
    public static void main(String[] args) {
        SistemaGerenciaDeAtletas sistema = new MeuSistemaGerenciaDeAtletas();
        sistema.cadastrarAtleta("CX123", 20, new ArrayList<>());
        try {
            sistema.cadastrarTelefoneDeAtleta("CX123", new Telefone("83", "99998888", "Celular"));
            sistema.cadastrarTelefoneDeAtleta("CX123", new Telefone("83", "33335555", "Fixo"));
        } catch (AtletaNaoExisteException e){
            System.out.println("Telefone não cadastrado. Atleta não existe");
            e.printStackTrace();
        }
        sistema.cadastrarAtleta("CX555", 50, new ArrayList<>());
        List<Atleta> listaAtletas = sistema.pesquisarAtletasComIdadeEntre(15, 20);
        for (Atleta a : listaAtletas) {
            System.out.println("Código:" + a.getCodigo() + ", Idade:" + a.getIdade());
        }
        //TODO: Completar a partir daqui
        sistema.cadastrarAtleta("CX444", 45, new ArrayList<>());
        try {
            sistema.cadastrarTelefoneDeAtleta("CX444", new Telefone("83", "98989999", "Celular"));
        } catch (AtletaNaoExisteException e){
            System.out.println("Erro interno: Telefone não cadastrado");
            System.err.println(e.getMessage());
        }
        int maiorIdade = sistema.pesquisarMaiorIdadeDosAtletas();
        System.out.println("Maior idade:"+ maiorIdade);

    }
}
