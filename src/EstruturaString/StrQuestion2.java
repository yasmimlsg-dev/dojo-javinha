package EstruturaString;

import java.util.Scanner;

public class StrQuestion2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Entre o número: ");
        int numero = sc.nextInt();


        String numeroStr = String.valueOf(Math.abs(numero)); // Math.abs garante que funcione mesmo se o número for negativo


        String[] nomesNumeros = {"zero", "um", "dois", "três", "quatro", "cinco", "seis", "sete", "oito", "nove"};

        System.out.print("Resultado: ");

        // Se o número for negativo imprimir "menos"
        if (numero < 0) {
            System.out.print("menos, ");
        }

        for (int i = 0; i < numeroStr.length(); i++) {
            char caractere = numeroStr.charAt(i);
            int digito = Character.getNumericValue(caractere);

            System.out.print(nomesNumeros[digito]);

            if (i < numeroStr.length() - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();

        sc.close();
    }
}