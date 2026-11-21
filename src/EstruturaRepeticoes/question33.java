package EstruturaRepeticoes;

import java.util.Scanner;

public class question33 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double somaNotas = 0;
        int qtdAlunos = 0;

        while (true) {
            System.out.print("Digite a matrícula do aluno (negativa para encerrar): ");
            int matricula = sc.nextInt();
            if (matricula < 0) {
                break;
            }
            System.out.print("Digite a nota do aluno: ");
            double nota = sc.nextDouble();

            somaNotas += nota;
            qtdAlunos++;
        }

        if (qtdAlunos > 0) {
            System.out.printf("A média da turma é: %.2f%n", (somaNotas / qtdAlunos));
        } else {
            System.out.println("Nenhum aluno cadastrado.");
        }
        sc.close();
    }
}
