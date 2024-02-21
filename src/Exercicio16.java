import javax.swing.*;

public class Exercicio16 {

    public static void main(String[] args) {

        //16.	Receba a quantidade de horas trabalhadas, o valor por hora, o percentual de desconto e o número de descendentes.
        // Calcule o salário que serão as horas trabalhadas x o valor por hora. Calcule o salário líquido (= Salário Bruto – desconto).
        // A cada dependente será acrescido R$ 100 no Salário Líquido. Exiba o salário a receber.

        int horastrab, desconto, descendentes;
        double valorporhora, salariobruto, salarioliquido;

        horastrab = Integer.parseInt(JOptionPane.showInputDialog("Digite as horas trabalhadas: "));
        valorporhora = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor por hora: "));
        desconto = Integer.parseInt(JOptionPane.showInputDialog("Digite o desconto: "));
        descendentes = Integer.parseInt(JOptionPane.showInputDialog("Digite o número de descendentes: "));

        salariobruto = (horastrab * valorporhora);
        salarioliquido = (salariobruto - desconto);
        salarioliquido += (descendentes * 100);

        JOptionPane.showMessageDialog(null,salarioliquido);
    }
}
