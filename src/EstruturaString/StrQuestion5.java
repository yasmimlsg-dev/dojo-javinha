package EstruturaString;
import java.util.Scanner;

public class StrQuestion5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe o texto completo: ");
        String texto = scanner.nextLine();

        String[] palavras = texto.trim().split("\\s+");

        String textoLimpo = String.join(" ", palavras);

        System.out.println("Texto corrigido: " + textoLimpo);

        scanner.close();
    }
}
