import javax.swing.*;

public class Exercicio28 {
    public static void main (String[] args){

        //Exercício 28


        //variaveis
        double precoatual, mediamensal, novopreco;

        //processo
        precoatual = Double.parseDouble(JOptionPane.showInputDialog("Digite o preço atual: "));
        mediamensal = Double.parseDouble(JOptionPane.showInputDialog("Digite a média mensal: "));

        if(mediamensal < 500 && precoatual < 30){
            novopreco = precoatual * 1.1;
            JOptionPane.showMessageDialog(null, novopreco);
        } else if (mediamensal >= 500 && mediamensal < 1000 && precoatual >= 30 && precoatual < 80){
            novopreco = precoatual * 1.15;
            JOptionPane.showMessageDialog(null, novopreco);
        } else if (mediamensal >= 1000 && precoatual >= 80){
            novopreco = precoatual * 0.95;
            JOptionPane.showMessageDialog(null, novopreco);
        } else {
            novopreco = precoatual;
            JOptionPane.showMessageDialog(null, novopreco);
        }
    }
}
