package EstruturasCondicionais;

import java.util.Scanner;

public class question21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String opcao;

        do {
            System.out.print("Digite um número inteiro: ");
            int num = sc.nextInt();

            if (num > 0) {
                System.out.println("O número é positivo.");
            } else if (num < 0) {
                System.out.println("O número é negativo.");
            } else {
                System.out.println("O número é zero (neutro).");
            }

            System.out.print("Deseja parar a execução? (Digite 'S' para sim): ");
            opcao = sc.next();
        } while (!opcao.equalsIgnoreCase("S"));

        sc.close();
    }
}
