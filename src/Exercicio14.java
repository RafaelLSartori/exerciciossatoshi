import javax.swing.*;

public class Exercicio14 {

    public static void main(String[] args) {

        //14.Receba 2ângulos de um triângulo. Calcule e mostre o valor do 3º ângulo.

        int angulo1, angulo2, angulo3;

        angulo1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro angulo: "));
        angulo2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo angulo: "));

        angulo3 = (180 - angulo1 - angulo2);

        JOptionPane.showMessageDialog(null,"O valor do terceiro angulo é:" + angulo3);

    }
}
