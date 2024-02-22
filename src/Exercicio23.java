import javax.swing.*;

public class Exercicio23 {
    public static void main(String[] args) {
        // 23.Receba 3 valores obrigatoriamente em ordem crescente e um 4º valor não necessariamente em ordem. Mostre os 4 números em ordem crescente.

        int num1, num2, num3, num4;

        num1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro valor: "));
        num2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo valor: "));
        while (num2 <= num1){
            JOptionPane.showMessageDialog(null,"ERRO: Os números precisam estar em ordem crescente");
            num2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo valor: "));
        }
        num3 = Integer.parseInt(JOptionPane.showInputDialog("Digite o terceiro valor: "));
        while (num3 <= num2){
            JOptionPane.showMessageDialog(null,"ERRO: Os números precisam estar em ordem crescente");
            num3 = Integer.parseInt(JOptionPane.showInputDialog("Digite o terceiro valor: "));
        }
        num4 = Integer.parseInt(JOptionPane.showInputDialog("Digite o quarto valor: "));

        if (num4 < num1){
            JOptionPane.showMessageDialog(null, num4 + ", " + num1 + ", " + num2 + ", " + num3 + ".");
        } else if (num4 < num2){
            JOptionPane.showMessageDialog(null, num1 + ", " + num4 + ", " + num2 + ", " + num3 + ".");
        } else if (num4 < num3){
            JOptionPane.showMessageDialog(null, num1 + ", " + num2 + ", " + num4 + ", " + num3 + ".");
        } else {
            JOptionPane.showMessageDialog(null, num1 + ", " + num2 + ", " + num3 + ", " + num4 + ".");
        }
    }
}
