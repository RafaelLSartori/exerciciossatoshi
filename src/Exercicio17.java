import javax.swing.*;

public class Exercicio17 {

    public static void main(String[] args) {

        //17.Calcule a quantidade de litros gastos em uma viagem, sabendo que o automóvel faz 12 km/l. Receber o tempo de percurso e a velocidade média.

        double tempopercurso, vm, litros, distancia;

        tempopercurso = Integer.parseInt(JOptionPane.showInputDialog("Digite o tempo do percurso: "));
        vm = Double.parseDouble(JOptionPane.showInputDialog("Digite a velocidade média: "));

        distancia = (tempopercurso * vm);
        litros = (distancia / 12);

        JOptionPane.showMessageDialog(null,"A quantidade de litros gastos na viagem é de: " + litros);
    }
}