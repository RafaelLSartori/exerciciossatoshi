import javax.swing.*;

public class Exercicio29 {
    public static void main (String[] args){

        //Exercício 29
        // 1 - poupança - 3%
        // 2 - renda fixa - 5%

        double tipoInvestimento, valor, valorCorrigido;

        tipoInvestimento = Double.parseDouble(JOptionPane.showInputDialog("Digite o tipo de investimento: "));

        if(tipoInvestimento == 1){
            JOptionPane.showMessageDialog(null, "Você selecionou a opção POUPANÇA.");
        }else if(tipoInvestimento ==2){
            JOptionPane.showMessageDialog(null, "Você selecionou a opção RENDA FIXA.");
        }

        valor = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor: "));

        if(tipoInvestimento == 1){
            valorCorrigido = (valor * 1.03);
            JOptionPane.showMessageDialog(null, valorCorrigido);
        } else if(tipoInvestimento == 2){
            valorCorrigido = (valor * 1.05);
            JOptionPane.showMessageDialog(null, valorCorrigido);
        } else{
            JOptionPane.showMessageDialog(null, "Tipo inválido");
        }
    }
}
