import javax.swing.*;

public class Exercicio32 {
    public static void main (String[] args) {
        //Exercício 32
        //Receba um número inteiro. Calcule e mostre seu fatorial.

        int num;

        num = Integer.parseInt(JOptionPane.showInputDialog("Digite um número inteiro: "));
        System.out.println(FunctionFat(num));
    }
        static int FunctionFat(int n){
        int fat;
        fat = 1;
        for (int cta = 1; cta <= n; cta++){
            fat = fat * cta;
        }
        return fat;
    }
}
