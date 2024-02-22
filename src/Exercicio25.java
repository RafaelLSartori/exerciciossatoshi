import javax.swing.*;

public class Exercicio25 {
    public static void main(String[] args){
        //25.Receba a hora de início e de final de um jogo (HH,MM), calcular o tempo do jogo em horas e minutos,
        //sabendo que o tempo máximo é menor que 24 horas e pode começar num dia e terminar noutro.

        int horainicial, horafinal, minutoinicial, minutofinal, horadojogo, minutodojogo;

        horainicial = Integer.parseInt(JOptionPane.showInputDialog("Digite a hora inicial do jogo: "));
        minutoinicial = Integer.parseInt(JOptionPane.showInputDialog("Digite o minuto inicial do jogo: "));
        horafinal = Integer.parseInt(JOptionPane.showInputDialog("Digite a hora final do jogo: "));
        minutofinal = Integer.parseInt(JOptionPane.showInputDialog("Digite o minuto final do jogo: "));

        if (minutofinal < minutoinicial){
            minutofinal += 60;
            horafinal -= 1;
        }
        if (horafinal < horainicial){
            horafinal += 24;
        }
        horadojogo = horafinal - horainicial;
        minutodojogo = minutofinal - minutoinicial;
        JOptionPane.showMessageDialog(null, horadojogo + "," + minutodojogo);
    }
}
