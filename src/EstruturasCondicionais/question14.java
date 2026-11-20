package EstruturasCondicionais;

import java.util.Scanner;

public class question14 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int a, b, resultado;

        System.out.println("Digite o numero: ");
        a = scanner.nextInt();
        System.out.println("Digite outro numero: ");
        b = scanner.nextInt();

        if (a >= b) {
            resultado = a - b;
        } else {
            resultado = b - a;
        }

        System.out.print(resultado);
        scanner.close();
    }

}
