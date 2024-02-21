import javax.swing.*;

public class Exercicio10 {

    public static void main(String[] args) {

        //10.Receba 2 números reais. Calcule e mostre a diferença desses valores.

        double num1, num2, diferenca;

        num1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro valor: "));
        num2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o segundo valor: "));

        diferenca = (num1 - num2);

        JOptionPane.showMessageDialog(null,"A soma dos quadrados é :" + diferenca);
    }
}
