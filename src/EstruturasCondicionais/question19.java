package EstruturasCondicionais;
import java.util.Scanner;

public class question19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor do lado A: ");
        double a = scanner.nextDouble();
        System.out.print("Digite o valor do lado B: ");
        double b = scanner.nextDouble();
        System.out.print("Digite o valor do lado C: ");
        double c = scanner.nextDouble();

        if (a < b + c && b < a + c && c < a + b) {
            if (a == b && b == c) {
                System.out.println("Triângulo equilátero");
            } else if (a == b || a == c || b == c) {
                System.out.println("Triângulo isósceles");
            } else {
                System.out.println("Triângulo escaleno");
            }
        } else {
            System.out.println("Os valores fornecidos não caracterizam um triângulo.");
        }

        scanner.close();
    }
}
