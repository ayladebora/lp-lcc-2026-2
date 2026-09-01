import javax.swing.JOptionPane;

public class Ola {

    public static void mostreSaudacao(String nome){
        System.out.println("Salveeeee "+ nome);
    }

    public static void main(String [] args){
        System.out.println("Olá");
        String nome = "Ayla";
        System.out.println(nome);
        System.out.println(nome.charAt(0));
        System.out.println(nome.charAt(3));

        nome = JOptionPane.showInputDialog("Digite seu nome");
        System.out.println("Oi " + nome);
        mostreSaudacao(nome);

        int idade  = 15;
        System.out.println(idade);

        double altura = 1.75;
        boolean toComSono = false;
        idade = Integer.parseInt(JOptionPane.showInputDialog("Digite sua idade"));
        System.out.println("Que idade boa hein essa dos "+ idade+  " anos");
        altura = Double.parseDouble(JOptionPane.showInputDialog("Digite sua altura"));
        System.out.println("Sua altura é "+ altura);


    }

}
