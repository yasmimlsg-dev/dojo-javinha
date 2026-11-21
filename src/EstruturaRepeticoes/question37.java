package EstruturaRepeticoes;

import java.util.Scanner;

public class question37 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char continuar;

        do {
            System.out.println("\n--- MENU ---");
            System.out.println("1 - Adição");
            System.out.println("2 - Subtração");
            System.out.println("3 - Multiplicação");
            System.out.println("4 - Divisão");
            System.out.print("Informe a opção: ");
            int opcao = sc.nextInt();

            System.out.print("Digite o primeiro número: ");
            double n1 = sc.nextDouble();
            System.out.print("Digite o segundo número: ");
            double n2 = sc.nextDouble();

            switch (opcao) {
                case 1:
                    System.out.println("Resultado: " + (n1 + n2));
                    break;
                case 2:
                    System.out.println("Resultado: " + (n1 - n2));
                    break;
                case 3:
                    System.out.println("Resultado: " + (n1 * n2));
                    break;
                case 4:
                    if (n2 != 0) {
                        System.out.println("Resultado: " + (n1 / n2));
                    } else {
                        System.out.println("Erro: Divisão por zero!");
                    }
                    break;
                default:
                    System.out.println("Opção inválida.");
            }

            System.out.print("Deseja voltar ao menu principal? ('S' ou 's'): ");
            continuar = sc.next().charAt(0);
        } while (continuar == 'S' || continuar == 's');

        sc.close();
    }
}
