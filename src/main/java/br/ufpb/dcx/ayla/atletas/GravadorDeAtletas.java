package br.ufpb.dcx.ayla.atletas;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class GravadorDeAtletas {
    private String arquivoAtletas;

    public GravadorDeAtletas(String arquivo){
        this.arquivoAtletas = arquivo;
    }

    public GravadorDeAtletas(){
        this("atletas.txt");
    }

    public void gravarAtletas(List<Atleta> atletasAGravar)
        throws IOException {
        BufferedWriter escritor = null;
        try {
            escritor = new BufferedWriter(
                    new FileWriter(this.arquivoAtletas));
            for (Atleta a: atletasAGravar){
                escritor.write(a.getCodigo()+ "###"+ a.getIdade()+"\n");
            }
        } finally {
            if (escritor != null){
                escritor.close();
            }
        }
    }
}
