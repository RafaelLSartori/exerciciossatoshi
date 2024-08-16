
import javax.swing.JOptionPane;
public class Exercicio40 {

	public static void main(String[] args) {
		//Receba 2 números inteiros. Verifique e mostre todos os números primos existentes entre eles.

        int num1, num2, primo;

        num1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro número: "));
        num2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo número: "));

        if (num1 < num2){
            for (int i = (num1+1); i <= (num2-1); i++){
                if ((i % i == 0) && (i % 1 == 0) && (i % 2 !=0)){
                    System.out.println(i);
                }
            }
        }
        else if(num2 < num1){
            for (int i = (num2+1); i <= (num1-1); i++){
                if ((i % i == 0) && (i % 1 == 0) && (i % 2 !=0)){
                    System.out.println(i);
                }
            }
        }
        else{
            JOptionPane.showMessageDialog(null,"Os números não podem ser iguais.");
        }

	}

}
