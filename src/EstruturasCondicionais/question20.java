package EstruturasCondicionais;

import java.util.Scanner;

public class question20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = 0, b = 0, c = 0;

        while (a <= 0) {
            System.out.print("Digite um valor maior que zero para 'a': ");
            a = sc.nextInt();
            if (a <= 0) System.out.println("Valor inválido!");
        }
        while (b <= 0) {
            System.out.print("Digite um valor maior que zero para 'b': ");
            b = sc.nextInt();
            if (b <= 0) System.out.println("Valor inválido!");
        }
        while (c <= 0) {
            System.out.print("Digite um valor maior que zero para 'c': ");
            c = sc.nextInt();
            if (c <= 0) System.out.println("Valor inválido!");
        }

        int menor = Math.min(a, Math.min(b, c));
        int maior = Math.max(a, Math.max(b, c));

        System.out.println("Menor multiplicado pelo maior: " + (menor * maior));
        System.out.println("Menor x Maior: " + (menor * maior));
        System.out.println("Maior / Menor: " + ((double) maior / menor));
        sc.close();
    }
}
