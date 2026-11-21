package EstruturasCondicionais;

import java.util.Scanner;

public class question15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a 1ª nota: ");
        double n1 = sc.nextDouble();
        System.out.print("Digite a 2ª nota: ");
        double n2 = sc.nextDouble();
        System.out.print("Digite a 3ª nota: ");
        double n3 = sc.nextDouble();
        System.out.print("Digite a 4ª nota: ");
        double n4 = sc.nextDouble();

        double media = (n1 + n2 + n3 + n4) / 4.0;

        if (media >= 7.0) {
            System.out.printf("Aluno aprovado com média: %.2f%n", media);
        } else {
            System.out.printf("Média parcial: %.2f. Digite a nota de recuperação: ", media);
            double recuperacao = sc.nextDouble();

            double novaMedia = (media + recuperacao) / 2.0;

            if (novaMedia >= 7.0) {
                System.out.printf("Aluno aprovado na recuperação com nova média: %.2f%n", novaMedia);
            } else {
                System.out.printf("Aluno não aprovado. Média final: %.2f%n", novaMedia);
            }
        }
        sc.close();
    }
}
