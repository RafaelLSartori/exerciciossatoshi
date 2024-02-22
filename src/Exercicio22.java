import javax.swing.*;

public class Exercicio22 {

    public static void main(String[] args) {

        //22.Receba 2 valores inteiros e diferentes. Mostre seus valores em ordem crescente.

        int num1, num2;

        num1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro valor: "));
        num2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo valor: "));

        if (num1 == num2){
            JOptionPane.showMessageDialog(null,"Os números digitados precisam ser diferentes.");
        } else if (num1 > num2){
            JOptionPane.showMessageDialog(null, num1 + " e " + num2);
        }
        else{
            JOptionPane.showMessageDialog(null, num2 + " e " + num1);
        }
    }
}
