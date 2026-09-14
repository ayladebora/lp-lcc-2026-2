public class TesteArray2 {

    public static void main(String [] args){
        int [] numeros = {3, 5, 6, 10, 11, 17};
        int contImpar = 0;
        int k=0;
        while(k<numeros.length){
            if (numeros[k]%2==1){
                contImpar+=1;
            }
            k++;
        }
        System.out.println("Quantidade de ímpares:"+contImpar);
    }
}
