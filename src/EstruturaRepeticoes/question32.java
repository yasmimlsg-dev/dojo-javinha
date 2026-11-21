package EstruturaRepeticoes;

import java.util.Scanner;

public class question32 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um número entre 1 e 9: ");
        int inicio = sc.nextInt();

        while (inicio <= 0 || inicio >= 10) {
            System.out.print("Inválido. Digite um número maior que 0 e menor que 10: ");
            inicio = sc.nextInt();
        }

        int soma = 0;
        int contador = 0;
        int atual = inicio;

        while (contador < 20) {
            if (atual % 2 != 0) {
                soma += atual * atual;
                contador++;
            }
            atual++;
        }

        System.out.println("A soma dos quadrados é: " + soma);
        sc.close();
    }
}
