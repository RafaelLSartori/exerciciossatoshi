public class Exercicio31 {

    public static void main (String[] args){

        //Exercício 31 - Quadrado dos númerosde 10 a 150.

        double quadrado;
        for (int i = 10; i <= 150; i++) {
            quadrado = Math.pow((double)i,2);
            System.out.println(quadrado);
        }
    }
}
