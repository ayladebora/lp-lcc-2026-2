package br.ufpb.dcx.ayla.atletas;

import java.io.*;
import java.util.LinkedList;
import java.util.List;

public class GravadorDeAtletas {
    private String arquivoAtletas;
    public static final String NOME_ARQUIVO_ATLETAS_DEFAULT = "atletas.txt";

    public GravadorDeAtletas(String arquivo){
        this.arquivoAtletas = arquivo;
    }

    public GravadorDeAtletas(){
        this(NOME_ARQUIVO_ATLETAS_DEFAULT);
    }

    public List<Atleta> recuperaAtletas() throws IOException{
        List<Atleta> atletasAchados = new LinkedList<>();
        BufferedReader leitor = null;
        try {
            leitor = new BufferedReader(new FileReader(this.arquivoAtletas));
            boolean acabou = false;
            while (!acabou){
                String linhaLida = leitor.readLine();
                if (linhaLida!=null) {
                    String[] dadosLidos = linhaLida.split("###");
                    String codigoAtleta = dadosLidos[0];
                    int idade = Integer.parseInt(dadosLidos[1]);
                    Atleta atleta = new Atleta(codigoAtleta, idade, new LinkedList<>());
                    atletasAchados.add(atleta);
                } else {
                    acabou = true;
                }
            }


        } finally {
            if (leitor!=null){
                leitor.close();
            }
        }


        return atletasAchados;
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
