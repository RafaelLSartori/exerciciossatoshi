import javax.swing.JOptionPane;


public class Exercicio42 {
    public static void main(String[] args){

        //Serie 1 + 2/3 + 3/5 + ... + 50/99

        double i, serie = 0;
        for(i=1; i<=50; i++){
            serie += i / (i + i - 1);
            System.out.println(serie);
        }
    }
}