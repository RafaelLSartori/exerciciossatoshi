import javax.swing.*;

public class Exercicio18 {

    public static void main(String[] args) {

        //18.Receba 2 valores inteiros. Calcule e mostre o resultado da diferença do maior pelo menos valor.

        int num1, num2, diferenca;

        num1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro valor: "));
        num2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo valor: "));

        if (num1 > num2){
            diferenca = (num1 - num2);
        }
        else{
            diferenca = (num2 - num1);
        }
        JOptionPane.showMessageDialog(null,"O resultado da diferença é: " + diferenca);
    }
}
