package EstruturaRepeticoes;

import java.util.Scanner;

public class question38 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String encerrar;

        do {
            System.out.print("Digite o código do operário (C): ");
            String c = sc.next();
            System.out.print("Digite o número de horas trabalhadas (N): ");
            double n = sc.nextDouble();

            double horasNormais = (n > 50) ? 50 : n;
            double horasExcedentes = (n > 50) ? (n - 50) : 0;

            double e = horasExcedentes * 20.00;
            double salarioTotal = (horasNormais * 10.00) + e;

            System.out.printf("Salário Total: R$ %.2f%n", salarioTotal);
            System.out.printf("Salário Excedente: R$ %.2f%n", e);

            System.out.print("Deseja encerrar o programa? (Responda 'S' para sim): ");
            encerrar = sc.next();
        } while (!encerrar.equals("S"));

        sc.close();
    }
}
