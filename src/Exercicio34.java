import javax.swing.*;

public class Exercicio34 {
    public static void main (String[] args){

        //34.Receba um número. Calcule e mostre os resultados da tabuada desse número.

        int num, tab;

        num = Integer.parseInt(JOptionPane.showInputDialog("Digite um número: "));

        for (int cta = 1; cta <= 10; cta++ ){
            tab = (cta * num);
            JOptionPane.showMessageDialog(null, num + "*" + cta + "=" + tab );
        }
    }
}
