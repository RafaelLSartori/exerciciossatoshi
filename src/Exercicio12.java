import javax.swing.*;

public class Exercicio12 {

    public static void main(String[] args) {

        //12.Receba o ano de nascimento e o ano atual. Calcule e mostre a sua idade e quantos anos terá daqui a 17 anos.

        int anonasc, anoatual, idade, idadefutura;

        anonasc = Integer.parseInt(JOptionPane.showInputDialog("Digite o ano de nascimento: "));
        anoatual = Integer.parseInt(JOptionPane.showInputDialog("Digite o ano atual: "));

        idade = anoatual - anonasc;

        System.out.println("Sua idade é: " + idade);

        idadefutura = idade + 17;

        JOptionPane.showMessageDialog(null,"Daqui 17 anos, a sua idade será: " + idadefutura);
    }
}
