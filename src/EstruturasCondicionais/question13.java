package EstruturasCondicionais;

import java.util.Scanner;

public class question13 {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[3];

        // Recebendo os numeros:
        System.out.println("Digite o primeiro numero: ");
        numeros[0] = scanner.nextInt();
        System.out.println("Digite o segundo numero: ");
        numeros[1] = scanner.nextInt();
        System.out.println("Digite o terceiro numero: ");
        numeros[2] = scanner.nextInt();

        // Sequência original
        System.out.print("Numeros em ordem de entrada: \n");
        for (int i = 0; i < numeros.length; i++){
            System.out.printf("%d ", numeros[i]);
        }

        // Ordenando
        for (int i = 0; i < numeros.length - 1; i++) {
            for (int j = 0; j < numeros.length - 1 - i; j++) {
                // Se o número atual for menor que o próximo, eles trocam de lugar
                if (numeros[j] < numeros[j + 1]) {
                    int aux = numeros[j];
                    numeros[j] = numeros[j + 1];
                    numeros[j + 1] = aux;
                }
            }
        }

        //Sequência ordenada:
        System.out.print("\nNumeros em ordem descrecente: \n");
        for (int i = 0; i < numeros.length; i++){
            System.out.printf("%d ", numeros[i]);
        }

        scanner.close();
    }
}
