package EstruturaRepeticoes;

import java.util.Scanner;

public class question34 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean primeiro = true;
        int maior = 0, menor = 0;

        while (true) {
            System.out.print("Digite um número positivo (negativo para parar): ");
            int n = sc.nextInt();
            if (n < 0) {
                break;
            }

            if (primeiro) {
                maior = n;
                menor = n;
                primeiro = false;
            } else {
                if (n > maior) maior = n;
                if (n < menor) menor = n;
            }
        }

        if (!primeiro) {
            System.out.println("Maior: " + maior + " | Menor: " + menor);
        } else {
            System.out.println("Nenhum número válido foi inserido.");
        }
        sc.close();
    }
}
