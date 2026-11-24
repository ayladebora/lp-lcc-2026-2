package br.ufpb.dcx.ayla.atletas;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class TestaGravacao {
    public static void main(String [] args){
        List<Atleta> atletaList = new ArrayList<>();
        GravadorDeAtletas gravadorDeAtletas = new GravadorDeAtletas();

        try {
            atletaList = gravadorDeAtletas.recuperaAtletas();
            System.out.println("Dados recuperados de "+ atletaList.size()+" atletas");
        } catch (IOException e){
            System.out.println("Erro: Não deu...");
        }

        atletaList.add(new Atleta("CY986", 24, new ArrayList<>()));
        atletaList.add(new Atleta("BTT547", 16, new ArrayList<>()));
        try {
            gravadorDeAtletas.gravarAtletas(atletaList);
            System.out.println("Atletas gravados com sucesso");
        } catch(IOException e){
            e.printStackTrace();
        }
    }
}
