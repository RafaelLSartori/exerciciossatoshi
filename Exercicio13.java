import javax.swing.*;

public class Exercicio13 {

    public static void main(String[] args) {

        //13.Receba a quantidade de alimento em quilos. Calcule e mostre quantos dias durará esse alimento sabendo que a pessoa consome 50g ao dia.

        double alimento, dias;

        alimento = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de alimento em quilos: "));

        dias = (alimento * 1000 / 50);

        System.out.println("O alimento ira durar: " + dias + " dias");

    }
}
