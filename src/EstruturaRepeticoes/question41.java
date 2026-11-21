package EstruturaRepeticoes;

import java.util.Scanner;

public class question41 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite a idade do nadador: ");
        int idade = sc.nextInt();

        if (idade >= 5 && idade <= 7) {
            System.out.println("Categoria: Infantil A");
        } else if (idade >= 8 && idade <= 11) {
            System.out.println("Categoria: Infantil B");
        } else if (idade >= 12 && idade <= 13) {
            System.out.println("Categoria: Juvenil A");
        } else if (idade >= 14 && idade <= 17) {
            System.out.println("Categoria: Juvenil B");
        } else if (idade >= 18) {
            System.out.println("Categoria: Adultos");
        } else {
            System.out.println("Idade abaixo da faixa mínima atendida.");
        }
        sc.close();
    }
}
