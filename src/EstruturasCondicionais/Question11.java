package EstruturasCondicionais;
import java.util.Scanner;

public class Question11 {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        int numeroA, numeroB, aux;

        System.out.println("Digite o valor do primeiro numero: ");
        numeroA = scanner.nextInt();

        System.out.println("Digite o valor do segundo numero: ");
        numeroB = scanner.nextInt();

        System.out.printf("Valores originais de A e B: \nA = %d\n B = %d\n", numeroA, numeroB);

        //Troca aqui:

        aux = numeroA;
        numeroA = numeroB;
        numeroB = aux;

        System.out.printf("Valores depois da troca de A e B: \nA = %d\n B = %d", numeroA, numeroB);
        scanner.close();
    }
}
