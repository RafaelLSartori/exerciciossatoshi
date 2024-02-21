import javax.swing.*;

public class Exercicio4 {

    public static void main(String[] args) {

        //4.Receba a temperatura em graus Celsius. Calcule e mostre a sua temperatura convertida em fahrenheit F = (9*C+160) /5.

        int c, f;
        c = Integer.parseInt(JOptionPane.showInputDialog("Digite a temperatura em Celsius: "));
        f = ((9*c+160)/5);
        JOptionPane.showMessageDialog(null,"A temperatura em fahrenheit é: " + f);
    }
}
