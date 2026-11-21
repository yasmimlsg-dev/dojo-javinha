package EstruturasCondicionais;

import java.util.Scanner;

public class question25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite a altura (ex: 1.75): ");
        double h = sc.nextDouble();
        System.out.print("Digite o sexo (M para Masculino / F para Feminino): ");
        char sexo = sc.next().toUpperCase().charAt(0);

        double pesoIdeal = 0;
        if (sexo == 'M') {
            pesoIdeal = (72.7 * h) - 58;
            System.out.printf("O peso ideal para homem é: %.2f kg%n", pesoIdeal);
        } else if (sexo == 'F') {
            pesoIdeal = (62.1 * h) - 44.7;
            System.out.printf("O peso ideal para mulher é: %.2f kg%n", pesoIdeal);
        } else {
            System.out.println("Sexo não reconhecido.");
        }
        sc.close();
    }
}
