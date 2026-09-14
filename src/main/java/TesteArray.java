public class TesteArray {

    public static void main(String [] args){
        if (args.length>0){
            System.out.println("Tem argumentos");
            for(int k=0; k< args.length; k++){
                System.out.println("Argumento ["+k+"]"+ args[k]);
            }
        } else {
            System.out.println("Não foi passado argumento no programa");
        }
    }

}
