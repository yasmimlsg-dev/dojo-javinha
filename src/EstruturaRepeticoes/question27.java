package EstruturaRepeticoes;


import java.util.Scanner;

public class question27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite a quantidade de números a processar: ");
        int qtd = sc.nextInt();

        for (int c = 0; c < qtd; c++) {
            System.out.print("Digite um número para calcular o fatorial: ");
            int n = sc.nextInt();
            long fatorial = 1;
            for (int i = 1; i <= n; i++) {
                fatorial *= i;
            }
            System.out.println("O fatorial de " + n + " é " + fatorial);
        }
        sc.close();
    }
}