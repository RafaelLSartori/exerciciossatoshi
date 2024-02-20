import javax.swing.*;

public class Exercicio19 {

    public static void main(String[] args) {

        //19.	Receba 2 valores reais. Calcule e mostre o maior deles.

        double num1, num2;

        num1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro valor: "));
        num2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo valor: "));

        if (num1 > num2){
            System.out.println("O maior número é :" + num1);
        } else {
            System.out.println("O maior número é :" + num2);
        }
    }
}
