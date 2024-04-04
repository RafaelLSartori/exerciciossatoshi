import javax.swing.*;

public class Exercicio03 {

    public static void main(String[] args) {

        //3.Receba a base e a altura de um triângulo. Calcule e mostre a sua área.

        int base, altura, area;
        base = Integer.parseInt(JOptionPane.showInputDialog("Digite a base: "));
        altura = Integer.parseInt(JOptionPane.showInputDialog("Digite a altura: "));
        area = (base * altura / 2);
        JOptionPane.showMessageDialog(null,"A área do triângulo é: " + area);
    }
}
