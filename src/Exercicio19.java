import javax.swing.*;

public class Exercicio19 {

    static double num1, num2;
    public static void main(String[] args) {

        //19.	Receba 2 valores reais. Calcule e mostre o maior deles.

        num1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro valor: "));
        num2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o segundo valor: "));
        ProcedureMaior();
    }
    static void ProcedureMaior(){
        if (num1 > num2){
            JOptionPane.showMessageDialog(null,"O maior número é :" + num1);
        } else {
            JOptionPane.showMessageDialog(null,"O maior número é :" + num2);
        }
    }
}
