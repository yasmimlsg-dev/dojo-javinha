package EstruturaRepeticoes;

import java.util.Scanner;

public class question40 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String encerrar;

        do {
            System.out.print("Digite o índice de poluição medido: ");
            double indice = sc.nextDouble();

            if (indice >= 0.5) {
                System.out.println("Notificação: TODOS os grupos devem suspender as atividades.");
            } else if (indice >= 0.4) {
                System.out.println("Notificação: Indústrias do 1º e 2º grupos devem suspender as atividades.");
            } else if (indice >= 0.3) {
                System.out.println("Notificação: Indústrias do 1º grupo devem suspender as atividades.");
            } else {
                System.out.println("Índice de poluição dentro do aceitável (0,05 a 0,25).");
            }

            System.out.print("Deseja encerrar o programa? (Responda 'S' para sim): ");
            encerrar = sc.next();
        } while (!encerrar.equals("S"));

        sc.close();
    }
}
