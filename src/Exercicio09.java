import javax.swing.*;

public class Exercicio09 {

    public static void main(String[] args) {

        //9.Receba os 2 números inteiros. Calcule e mostre a soma dos quadrados.

        double num1, num2, soma;

        num1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro valor: "));
        num2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o segundo valor: "));

        soma = Math.pow(num1,2) + Math.pow(num2,2);

        JOptionPane.showMessageDialog(null,"A soma dos quadrados é :" + soma);
    }
}
