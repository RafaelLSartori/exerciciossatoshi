import javax.swing.*;

public class Exercicio40 {
    public static void main(String[] args){

        //Receba 2 números inteiros. Verifique e mostre todos os números primos existentes entre eles.

        int num1, num2, primo;

        num1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro número: "));
        num2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo número: "));

        if (num1 < num2){
            for (int cta = (num1+1); cta <= (num2-1); cta++){
                if (cta % cta == 0 && cta % 1 == 0){
                    primo = cta;
                    System.out.println(primo);
                }
            }
        }
        else if(num2 < num1){
            for (int cta = (num2+1); cta <= (num1-1); cta++){
                if (cta % cta == 0 && cta % 1 == 0){
                    primo = cta;
                    System.out.println(primo);
                }
            }
        }
        else{
            JOptionPane.showMessageDialog(null,"Os números não podem ser iguais.");
        }
    }
}
