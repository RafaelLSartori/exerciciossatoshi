import javax.swing.*;

public class Exercicio02 {

    public static void main(String[] args) {

        //2.Receba o salário de um funcionário e mostre o novo salário com reajuste de 15%.

        double salario, reajuste;
        salario = Double.parseDouble(JOptionPane.showInputDialog("Digite o salário: "));
        reajuste = (salario * 1.15);
        JOptionPane.showMessageDialog(null,"O novo salário com reajuste é: " + reajuste);

    }

}
