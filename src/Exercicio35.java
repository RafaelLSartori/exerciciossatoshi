import javax.swing.*;

public class Exercicio35 {
    public static void main (String[] args){

        //35.Receba 2 números inteiros, verifique qual o maior entre eles. Calcule e mostre o resultado da somatória dos números ímpares entre esses valores.

        int num1, num2, soma;

        num1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro número: "));
        num2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo número: "));

        soma = 0;
        if (num1 > num2){
            for (int cta = num2; cta <= num1; cta++ ){
                if (cta % 2 != 0){
                    soma += cta;
                }
            }
        } else {
            for (int cta = num1; cta <= num2; cta++ ){
                if (cta % 2 != 0){
                    soma += cta;
                }
            }
        }
        JOptionPane.showMessageDialog(null, soma );
    }
}
