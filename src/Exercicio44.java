import javax.swing.*;

public class Exercicio44 {
    public static void main(String[] args){

        //44.Receba o número da base e do expoente. Calcule e mostre o valor da potência.

        double base, exp, pot;

        base = Integer.parseInt(JOptionPane.showInputDialog("Digite a base: "));
        exp = Integer.parseInt(JOptionPane.showInputDialog("Digite o expoente: "));

        pot = Math.pow(base,exp);

        System.out.println(pot);
    }
}
