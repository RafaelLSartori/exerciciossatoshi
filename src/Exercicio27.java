import javax.swing.*;

public class Exercicio27 {
    public static void main(String[] args) {
        //27.Receba o número de voltas, a extensão do circuito (em metros) e o tempo de duração (minutos). Calcule e mostre a velocidade média em km/h.

        double voltas, metros, tempo, vm;
        voltas = Double.parseDouble(JOptionPane.showInputDialog("Digite a quantidade de voltas: "));
        metros = Double.parseDouble(JOptionPane.showInputDialog("Digite a extensão do circuito em metros: "));
        tempo = Double.parseDouble(JOptionPane.showInputDialog("Digite o tempo de duração em minutos: "));

        vm = (metros * voltas / tempo) * 0.06;

        JOptionPane.showMessageDialog(null,vm);
    }
}
