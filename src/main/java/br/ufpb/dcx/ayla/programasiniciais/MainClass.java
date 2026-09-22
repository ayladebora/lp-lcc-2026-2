package br.ufpb.dcx.ayla.programasiniciais;

import java.util.Scanner;
public class MainClass {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite nomes separados por ;");
        String [] nomes = leitor.nextLine().split(";");
        System.out.println("Nomes lidos:");
        int k=0;
        do {
            System.out.println(nomes[k]);
            k++;
        } while(k<nomes.length);

        leitor.close();
    }
}