import javax.swing.*;

public class Exercicio38 {

    public static void main (String[] args){

        //38.Receba 100 números inteiros reais. Verifique e mostre o maior e o menor valor. Obs.: somente valores positivos.

        int num, maior, menor;

        maior = 0;
        menor = Integer.MAX_VALUE;
        for(int i=0; i<100; i++){
            num = Integer.parseInt(JOptionPane.showInputDialog("Digite um número: "));
            while(num < 1){
                JOptionPane.showMessageDialog(null,"Os valores precisam ser positivos!");
                num = Integer.parseInt(JOptionPane.showInputDialog("Digite um número: "));
            }
            if(num > maior){
                maior = num;
            }
            else if (num < menor){
                menor = num;
            }
        }
        System.out.println("O maior número é: " + maior);
        System.out.println("O menor número é: " + menor);
    }
}