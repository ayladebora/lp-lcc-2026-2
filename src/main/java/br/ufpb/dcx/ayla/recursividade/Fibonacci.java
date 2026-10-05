package br.ufpb.dcx.ayla.recursividade;

public class Fibonacci {

    //0 1 1 2 3 5 8 13 21 34...


    public static int fib(int posicao){
        if (posicao==0){
            return 0;
        } else if (posicao==1){
            return 1;
        } else {
            return fib(posicao-1)+ fib(posicao-2);
        }
    }


    public static void main(String [] args){
        System.out.println("Série de Fibonacci até 10");
        for (int k=0; k<=10; k++){
            System.out.println(fib(k));
        }
    }
}
