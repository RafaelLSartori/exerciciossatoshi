import javax.swing.*;

public class Exercicio15 {

    public static void main(String[] args) {

        //15.Receba os valores de 2 catetos de um triângulo retângulo. Calcule e mostre a hipotenusa.

        double cateto1, cateto2, hipotenusa;

        cateto1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro valor: "));
        cateto2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o segundo valor: "));

        hipotenusa = Math.pow(cateto1,2) + Math.pow(cateto2,2);

        hipotenusa = Math.sqrt(hipotenusa);

        JOptionPane.showMessageDialog(null,"O valor da hipotenusa é:" + hipotenusa);
    }
}
