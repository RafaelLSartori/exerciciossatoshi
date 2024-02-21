import javax.swing.*;

public class Exercicio11 {

    public static void main(String[] args) {

        //11.Receba o raio de uma circunferência. Calcule e mostre o comprimento da circunferência.

        double raio, comprimento;

        raio = Double.parseDouble(JOptionPane.showInputDialog("Digite o raio: "));

        comprimento = ( 2 * Math.PI * raio);

        JOptionPane.showMessageDialog(null,"O comprimento da circunferência é igual a :" + comprimento);
    }
}
