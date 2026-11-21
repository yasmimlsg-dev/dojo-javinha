package EstruturaRepeticoes;

import java.util.Scanner;

public class question36 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int soma = 0, maior = 0, menor = 0;

        for (int i = 1; i <= 10; i++) {
            System.out.print("Digite o " + i + "º valor inteiro e positivo: ");
            int val = sc.nextInt();

            if (i == 1) {
                maior = val;
                menor = val;
            } else {
                if (val > maior) maior = val;
                if (val < menor) menor = val;
            }
            soma += val;
        }

        double media = soma / 10.0;
        System.out.printf("Maior: %d | Menor: %d | Média: %.2f%n", maior, menor, media);
        sc.close();
    }
}
