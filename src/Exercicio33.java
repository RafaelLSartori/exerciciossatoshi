import javax.swing.*;

public class Exercicio33 {

    public static void main(String[] args){

        //Exercício 33
        //Serie 1 + 1/2 + 1/3 + 1/n ...

        int n, serie;

        n = Integer.parseInt(JOptionPane.showInputDialog("Digite um número: "));

        serie = 0;
        for (int cta = 1; cta <= n; cta++){
            serie += (n/cta);
        }
        System.out.println(serie);
    }
}