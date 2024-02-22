import javax.swing.*;

public class Exercicio26 {
    public static void main(String[] args) {
        //26.Receba 2 números inteiros. Verifique e mostre se o maior número é múltiplo do menor.

        int num1, num2, maior, menor;
        num1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro valor: "));
        num2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo valor: "));

        if(num1 > num2 && num1 % num2 == 0){
            JOptionPane.showMessageDialog(null,num1 + " é maior e é mútiplo de " + num2 + ".");
        } else if (num2 > num1 && num2 % num1 == 0){
            JOptionPane.showMessageDialog(null,num2 + " é maior e é mútiplo de " + num1 + ".");
        } else{
            JOptionPane.showMessageDialog(null, "O maior número não é múltiplo do menor.");
        }
    }
}
