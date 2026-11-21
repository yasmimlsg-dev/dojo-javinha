package EstruturasCondicionais;

import java.util.Scanner;

public class question22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um número: ");
        double num = sc.nextDouble();

        double a = 0, b = 0;
        if (num >= 0) {
            a = num;
            System.out.println("Número positivo armazenado em A. A = " + a);
        } else {
            b = num;
            System.out.println("Número negativo armazenado em B. B = " + b);
        }
        sc.close();
    }
}
