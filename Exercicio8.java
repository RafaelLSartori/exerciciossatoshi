import javax.swing.*;

public class Exercicio8 {

    public static void main(String[] args) {

        //8.Receba o valor de um depósito em poupança. Calcule e mostre o valor após 1 mês de aplicação sabendo que rende 1,3% a. m.

        double valor, poupanca;

        valor = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor do deposito: "));

        poupanca = (valor + (valor * 1.3 / 100));

        System.out.println("O valor apos 1 mes de aplicacao e:" + poupanca);

    }
}
