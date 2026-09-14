import javax.swing.JOptionPane;

public class TesteArray3 {
    public static void main(String [] args){
        String listaNumerosStr = JOptionPane.showInputDialog("Digite 4 números separados por espaço");
        System.out.println("Os números lidos foram:"+ listaNumerosStr);
        String [] listaNumerosListaMesmo = listaNumerosStr.split(" ") ;
        for (int k=0; k< listaNumerosListaMesmo.length; k++){
            System.out.println("Número "+k+" : "+ listaNumerosListaMesmo[k]);
        }

        int [] numeros = new int[4];
        for (int k=0; k<4; k++ ){
            numeros[k] = Integer.parseInt(listaNumerosListaMesmo[k]);
        }

        int cont = 0;
        while(cont<numeros.length){
            System.out.println(numeros[cont]);
            cont++;
        }
        System.out.println("A soma dos números é "+ somaNumeros(numeros));


    }

    public static int somaNumeros(int [] numeros){
        int somatorio = 0;
        for(int k=0; k< numeros.length; k++){
            somatorio+= numeros[k];
        }
        return somatorio;
    }

}
