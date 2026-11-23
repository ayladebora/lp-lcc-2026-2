package br.ufpb.dcx.ayla.atletas;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class TestaGravacao {
    public static void main(String [] args){
        List<Atleta> atletaList = new ArrayList<>();
        atletaList.add(new Atleta("AX111", 20, new ArrayList<>()));
        atletaList.add(new Atleta("BTT987", 15, new ArrayList<>()));


        GravadorDeAtletas gravadorDeAtletas = new GravadorDeAtletas();
        try {
            gravadorDeAtletas.gravarAtletas(atletaList);
            System.out.println("Atletas gravados com sucesso");
        } catch(IOException e){
            e.printStackTrace();
        }
    }
}
