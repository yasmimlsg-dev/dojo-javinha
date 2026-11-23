package EstruturaString;

import java.util.Scanner;

public class StrQuestion1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite uma palavra ou frase: ");
        String palavra = sc.nextLine();

        // A) O número de caracteres da string.
        int caracteres = palavra.length();
        System.out.printf("O número de caracteres da string: %d \n", caracteres);

        // B) A string com todas suas letras em maiúsculo.
        String palavraUpper = palavra.toUpperCase();
        System.out.printf("A string em maiúsculo: %s \n", palavraUpper);

        // C) O número de vogais da string.
        int numeroVogais = 0;
        String palavraMinuscula = palavra.toLowerCase();
        for (int i = 0; i < palavraMinuscula.length(); i++) {
            char c = palavraMinuscula.charAt(i);
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                numeroVogais++;
            }
        }
        System.out.println("Número de vogais: " + numeroVogais);

        // D) Se a string digitada começa com “UNI” (ignorando maiúsculas/minúsculas).
        boolean comecaComUni = palavra.toLowerCase().startsWith("uni");
        System.out.println("Começa com 'UNI'? " + (comecaComUni ? "Sim" : "Não"));

        // E) Se a string digitada termina com “RIO” (ignorando maiúsculas/minúsculas).
        boolean terminaComRio = palavra.toLowerCase().endsWith("rio");
        System.out.println("Termina com 'RIO'? " + (terminaComRio ? "Sim" : "Não"));

        // F) O número de dígitos (0 a 9) da string.
        String apenasDigitos = palavra.replaceAll("[^0-9]", "");
        int qtdDigitos = apenasDigitos.length();
        System.out.println("Número de dígitos (0-9): " + qtdDigitos);

        // G) Se a string é um palíndromo ou não.
        String palavraInvertida = new StringBuilder(palavra).reverse().toString();
        boolean ehPalindromo = palavra.equalsIgnoreCase(palavraInvertida);
        System.out.println("É um palíndromo? " + (ehPalindromo ? "Sim" : "Não"));

        sc.close();
    }
}