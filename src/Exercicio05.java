import javax.swing.*;

public class Exercicio05 {

    public static void main(String[] args) {

        //5.Receba os coeficientes A, B e C de uma equação do 2º grau (AX²+BX+C=0). Calcule e mostre as raízes reais (considerar que a equação possue2 raízes).

        int a, b, c;
        double delta, x1, x2;

        a = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de a: "));
        b = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de b: "));
        c = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de c: "));

        delta = ((Math.pow(b,2)) - (4 * a * c));

        x1 = (- b + Math.sqrt(delta))/ (2 * a);
        x2 = (- b - Math.sqrt(delta))/(2 * a);

        JOptionPane.showMessageDialog(null,"As raizes sao: " + x1 + " e " + x2);

    }
}
