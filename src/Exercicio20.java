import javax.swing.*;

public class Exercicio20 {
    static int a, b, c;
    static double delta, x1, x2;
    public static void main(String[] args) {

        //20.Receba 3 coeficientes A, B, e C de uma equação do 2º grau da fórmula AX²+BX+C=0.
        // Verifique e mostre a existência de raízes reais e se caso exista, calcule e mostre.

        a = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de a: "));
        b = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de b: "));
        c = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de c: "));
        ProcedureRaiz();
    }
    static void ProcedureRaiz(){
        delta = ((Math.pow(b,2)) -4 * a * c);

        x1 = (- b + Math.sqrt(delta))/ (2 * a);
        x2 = (- b - Math.sqrt(delta))/(2 * a);

        if (delta < 0){
            JOptionPane.showMessageDialog(null,"Delta menor que zero. Não existem raízes reais.");
        } else if (delta == 0){
            JOptionPane.showMessageDialog(null,"Delta igual a zero. Existe uma raíz real: " + x1 );
        } else {
            JOptionPane.showMessageDialog(null,"Delta maior que zero. Existem duas raízes reais: " + x1 + " e " + x2);
        }

    }
}
