public class Exercicio45 {
    public static void main(String[] args){

        //45.	Calcule e mostre a série 1 – 2/4 + 3/9 – 4/16 + 5/25 + ... + 15/225

        double serie;

        serie = 0;
        for (double i=1; i<=15; i++ ){
            if(i % 2 !=0) {
                serie = serie + (i / (i*i));
                System.out.println(serie);
            }
            else{
                serie = serie + (-1 *(i / (i*i)));
                System.out.println(serie);
            }
        }
    }
}
