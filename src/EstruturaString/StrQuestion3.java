package EstruturaString;

import java.util.Scanner;

public class StrQuestion3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe o nome completo: ");
        String nome = scanner.nextLine();

        String[] palavras = nome.split(" ");
        String iniciais = "";

        // Passa por cada palavra uma por uma
        for (int i = 0; i < palavras.length; i++) {
            String palavra = palavras[i].toLowerCase();

            boolean naoEhConector = !palavra.equals("e") &&
                    !palavra.equals("do") &&
                    !palavra.equals("da") &&
                    !palavra.equals("dos") &&
                    !palavra.equals("das") &&
                    !palavra.equals("de") &&
                    !palavra.equals("di") &&
                    !palavra.equals("du");

            // Se não for conector, pega a primeira letra
            if (naoEhConector && !palavra.isEmpty()) {
                char primeiraLetra = Character.toUpperCase(palavras[i].charAt(0));
                iniciais = iniciais + primeiraLetra;
            }
        }

        System.out.println("Iniciais: " + iniciais);

        scanner.close();
    }
}
