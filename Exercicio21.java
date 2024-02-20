import javax.swing.*;

public class Exercicio21 {

    public static void main(String[] args) {

        //21.	Receba 4 notas bimestrais de um aluno. Calcule e mostre a média aritmética. Mostre a mensagem de acordo com a média:
        //a.	Se a média for >= 6,0 exibir “APROVADO”;
        //b.	Se a média for >= 3,0 ou < 6,0 exibir “EXAME”;
        //c.	Se a média for < 3,0 exibir “RETIDO”.

        double nota1, nota2, nota3, nota4, media;

        nota1 = Integer.parseInt(JOptionPane.showInputDialog("Digite a nota do aluno: "));
        nota2 = Integer.parseInt(JOptionPane.showInputDialog("Digite a nota do aluno: "));
        nota3 = Integer.parseInt(JOptionPane.showInputDialog("Digite a nota do aluno: "));
        nota4 = Integer.parseInt(JOptionPane.showInputDialog("Digite a nota do aluno: "));

        media = ((nota1 + nota2 + nota3 + nota4) / 4);

        if (media >= 6){
            System.out.println("Aprovado");
        } else if (media >= 3 || media < 6){
            System.out.println("EXAME");
        } else {
            System.out.println("Retido");
        }
    }
}
