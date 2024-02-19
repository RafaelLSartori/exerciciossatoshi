import javax.swing.*;

public class Exercicio10 {

    public static void main(String[] args) {

        //10.Receba 2 números reais. Calcule e mostre a diferença desses valores.

        double num1, num2, diferenca;

        num1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro valor: "));
        num2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo valor: "));

        diferenca = (num1 - num2);

        System.out.println("A soma dos quadrados é :" + diferenca);
    }
}
