import javax.swing.*;

public class Exercicio01 {

    public static void main(String[] args) {
        // 1.Coletar o valor do lado de um quadrado, calcular sua área e apresentar o resultado.

        int lado, area;
        lado = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor do lado: "));
        area = lado * lado;
        JOptionPane.showMessageDialog(null, "O valor da área é: " + area);
    }

}