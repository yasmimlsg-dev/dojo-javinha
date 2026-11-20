package EstruturasCondicionais;
import java.util.Scanner;

public class question12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um numero: ");
        int numero = scanner.nextInt();

        // Verificação do modulo aqui:
        int modulo;
        if (numero >= 0){
            modulo = numero;
        } else {
            modulo = numero * -1;
        }

        System.out.printf("Modulo do numero : %d\n", modulo);
        scanner.close();
    }
}
