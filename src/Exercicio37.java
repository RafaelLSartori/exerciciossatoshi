import javax.swing.*;

public class Exercicio37 {
    public static void main (String[] args) {
        int n, anterior = 0, atual = 1;

        n = Integer.parseInt(JOptionPane.showInputDialog("Digite um número: "));

        System.out.println("Série de fibonacci até o " +n+ "° termo: ");
        for(int i = 0; i < n; i++){
            int proximo = anterior + atual;
            anterior = atual;
            atual = proximo;
            System.out.print(anterior + " ");
        }
    }
}
