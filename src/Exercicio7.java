import javax.swing.*;

public class Exercicio7 {

    public static void main(String[] args) {

        //7.Receba os valores do comprimento, largura e altura de um paralelepípedo. Calcule e mostre seu volume.

        int comprimento, largura, altura, volume;

        comprimento = Integer.parseInt(JOptionPane.showInputDialog("Digite o comprimento: "));
        largura = Integer.parseInt(JOptionPane.showInputDialog("Digite a largura: "));
        altura = Integer.parseInt(JOptionPane.showInputDialog("Digite a altura: "));

        volume = (comprimento * largura * altura);

        JOptionPane.showMessageDialog(null, "O volume é: " + volume);
    }
}
