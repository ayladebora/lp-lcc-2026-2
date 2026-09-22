package br.ufpb.dcx.ayla.programasiniciais;

import java.util.Scanner;
public class TestaMetodo {

    public static void main(String [] args){
        System.out.println(args[0]);
        TestaMetodo.digaOlaDezVezes();
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite um número inteiro");
        int numero = Integer.parseInt(leitor.nextLine());
        if (ehMultiploDe3(numero)){
            System.out.println("O número "+numero+" é múltiplo de 3");
        } else {
            System.out.println("O número "+numero+" não é múltiplo de 3");
        }
        leitor.close();
    }

    public static boolean ehMultiploDe3(int numeroAPesquisar){
        if (numeroAPesquisar%3==0){
            return true;
        } else {
            return false;
        }
    }

    public static void digaOlaDezVezes(){
        int k=10;
        do {
            System.out.println("Olá "+k);
            k--;
        } while(k>0);
    }

}
