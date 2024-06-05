import javax.swing.*;

public class Exercicio37_2 {
    public static void main(String [] args) {
        //37.Receba um número inteiro. Calcule e mostre a série de Fibonacci até o seu N’nésimo termo.
        // Função recursiva

        int num;
        num = Integer.parseInt(JOptionPane.showInputDialog("Digite um número: "));
        System.out.print(FRecFib(num));
    }
    static int FRecFib(int n){
        if (n==1 || n==2){
            return 1;
        }
        else {
            return (FRecFib(n - 1) + FRecFib(n - 2));
        }

    }
}
