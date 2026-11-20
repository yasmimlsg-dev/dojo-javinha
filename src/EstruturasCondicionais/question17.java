package EstruturasCondicionais;
import java.util.Scanner;

public class question17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int numero = scanner.nextInt();

        if (numero >= 0 && numero <= 9) {
            System.out.println("valor válido");
        } else {
            System.out.println("valor inválido");
        }

        scanner.close();
    }
}
