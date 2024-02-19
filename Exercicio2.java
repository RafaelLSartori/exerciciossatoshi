import javax.swing.*;

public class Exercicio2 {

    public static void main(String[] args) {

        //2.Receba o salário de um funcionário e mostre o novo salário com reajuste de 15%.

        double salario, reajuste;
        salario = Integer.parseInt(JOptionPane.showInputDialog("Digite o salário: "));
        reajuste = (salario * 1.15);
        System.out.println("O novo salário com reajuste é: " + reajuste);

    }

}
