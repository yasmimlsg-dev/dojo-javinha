package EstruturaString;

import java.util.Scanner;

public class StrQuestion4 {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe o texto completo: ");
        String texto = scanner.nextLine();

        int quantidadeLetras = texto.length();

        String[] palavras = texto.trim().split("\\s+");

        int quantidadePalavras;

        if (texto.trim().isEmpty()) {
            quantidadePalavras = 0;
        } else {
            quantidadePalavras = palavras.length;
        }

        System.out.println("Número total de caracteres: " + quantidadeLetras);
        System.out.println("Número de palavras: " + quantidadePalavras);

        scanner.close();
    }
}