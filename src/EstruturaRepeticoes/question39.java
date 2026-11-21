package EstruturaRepeticoes;

import java.util.Scanner;

public class question39 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String encerrar;

        do {
            System.out.print("Digite um número inteiro: ");
            int num = sc.nextInt();

            String parImpar = (num % 2 == 0) ? "Par" : "Ímpar";
            String posNeg = (num > 0) ? "Positivo" : (num < 0 ? "Negativo" : "Neutro");

            System.out.println("O número é " + parImpar + " e " + posNeg + ".");

            System.out.print("Deseja encerrar o programa? (Responda 'S' para sim): ");
            encerrar = sc.next();
        } while (!encerrar.equals("S"));

        sc.close();
    }
}
