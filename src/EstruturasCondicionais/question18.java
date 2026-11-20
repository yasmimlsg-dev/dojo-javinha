package EstruturasCondicionais;
import java.util.Scanner;

public class question18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o código (1, 2 ou 3): ");
        int codigo = scanner.nextInt();

        if (codigo < 1 || codigo > 3) {
            System.out.println("Código inválido");
        } else {
            switch (codigo) {
                case 1 -> System.out.println("um");
                case 2 -> System.out.println("dois");
                case 3 -> System.out.println("três");
            }
        }

        scanner.close();
    }
}
