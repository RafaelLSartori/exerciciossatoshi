import javax.swing.*;

public class Exercicio37 {
    public static void main (String[] args) {

        //37.Receba um número inteiro. Calcule e mostre a série de Fibonacci até o seu N’nésimo termo.

        int n, anterior = 0, atual = 1;

        n = Integer.parseInt(JOptionPane.showInputDialog("Digite um número: "));

        System.out.println("Série de fibonacci até o " +n+ "° termo");
        for(int i = 0; i < n; i++){
            System.out.print(anterior+ " ");
            int proximo = anterior + atual;
            anterior = atual;
            atual = proximo;
        }

    }
}
