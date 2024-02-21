import javax.swing.*;

public class Exercicio6 {

    public static void main(String[] args) {

        //6.Receba os valores em x e y. Efetua a troca de seus valores e mostre seus conteúdos.

        int x, y, z;

        x = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de x: "));
        y = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de y: "));

        z = x;
        x = y;
        y = z;

        JOptionPane.showMessageDialog(null,"O valor de x: " + x + ". Valor de y: " + y);
    }
}
