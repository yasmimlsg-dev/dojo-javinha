package EstruturaRepeticoes;

import java.util.Scanner;

public class question31 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int somaPares = 0;
        int somaImpares = 0;

        while (true) {
            System.out.print("Digite um número (negativo para sair): ");
            int n = sc.nextInt();
            if (n < 0) {
                break;
            }
            if (n % 2 == 0) {
                System.out.println(n + " é Par.");
                somaPares += n;
            } else {
                System.out.println(n + " é Ímpar.");
                somaImpares += n;
            }
        }
        System.out.println("Soma dos pares: " + somaPares);
        System.out.println("Soma dos ímpares: " + somaImpares);
        sc.close();
    }
}
