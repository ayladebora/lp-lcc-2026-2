package br.ufpb.dcx.ayla.recursividade;

public class Fatorial {

    public static int fat2(int numero){
        int total = 1;
        for (int k=1;k<=numero;k++){
            total = total*k;
        }
        return total;
    }
    public static int fat(int numero){
        if (numero==1){
            return 1;
        } else {
            return numero* fat(numero-1);
        }
    }

    public static void main(String [] args){
        System.out.println(fat(5));
    }
}
