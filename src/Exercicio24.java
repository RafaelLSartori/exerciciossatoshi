import javax.swing.*;

public class Exercicio24 {
    public static void main(String[] args) {
        //24.Receba um valor inteiro. Verifique e mostre se é divisível por 2 e 3.

        int num1;
        num1 = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor inteiro: "));

        if (num1 % 2 == 0 && num1 % 3 == 0){
            JOptionPane.showMessageDialog(null, "O valor é divisível por 2 e 3.");
        } else if (num1 % 2 == 0) {
            JOptionPane.showMessageDialog(null, "O valor é divisível por 2.");
        } else if (num1 % 3 == 0) {
            JOptionPane.showMessageDialog(null, "O valor é divisível por 3.");
        } else {
            JOptionPane.showMessageDialog(null, "O valor não é divisível por 2 e 3.");
        }
    }
}
