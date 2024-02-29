import javax.swing.*;

public class Exercicio36 {
    static public void main (String[] args){

        //36.Receba um número N. Calcule e mostre a série 1 + 1/1! + 1/2! + ... + 1/N!

        double n, serie, fat;

        n = Double.parseDouble(JOptionPane.showInputDialog("Digite um número: "));

        fat = 1;
        serie = 0;
        for (int cta = 1; cta <= n; cta ++){
            fat = (fat * cta);
            serie = (serie + (1 / fat));
            }
        System.out.print(serie);
        }
    }
