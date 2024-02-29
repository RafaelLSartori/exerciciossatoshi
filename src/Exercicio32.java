import javax.swing.*;

public class Exercicio32 {
    public static void main (String[] args){

        //Exercício 32
        //Receba um número inteiro. Calcule e mostre seu fatorial.

        int n, fat;

        n = Integer.parseInt(JOptionPane.showInputDialog("Digite um número inteiro: "));

        fat = 1;
        for (int cta = 1; cta <= n; cta++){
            fat = fat * cta;
        }
        System.out.println(fat);
    }
}
