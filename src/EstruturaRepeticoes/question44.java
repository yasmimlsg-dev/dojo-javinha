package EstruturaRepeticoes;

import java.util.Scanner;

public class question44 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String encerrar;

        do {
            System.out.println("\n--- MENU ---");
            System.out.println("1 - Conversão de Graus Celsius em Graus Fahrenheit");
            System.out.println("2 - Conversão de Graus Fahrenheit em Graus Celsius");
            System.out.println("3 - Peso ideal do homem");
            System.out.println("4 - Peso ideal da mulher");
            System.out.print("Escolha uma opção: ");
            int opcao = sc.nextInt();

            switch (opcao) {
                case 1:
                    System.out.print("Digite a temperatura em Celsius: ");
                    double c = sc.nextDouble();
                    double f = (c * 9.0 / 5.0) + 32;
                    System.out.printf("Fahrenheit: %.2f%n", f);
                    break;
                case 2:
                    System.out.print("Digite a temperatura em Fahrenheit: ");
                    double fahr = sc.nextDouble();
                    double cels = (fahr - 32) * 5.0 / 9.0;
                    System.out.printf("Celsius: %.2f%n", cels);
                    break;
                case 3:
                    System.out.print("Digite a altura (ex: 1,75): ");
                    double altH = sc.nextDouble();
                    System.out.print("Digite o peso atual (kg): ");
                    double pesoH = sc.nextDouble();
                    double idealH = (72.7 * altH) - 58;
                    System.out.printf("Peso ideal: %.2f kg%n", idealH);
                    if (pesoH > idealH) {
                        System.out.println("Você está acima do peso ideal.");
                    } else if (pesoH < idealH) {
                        System.out.println("Você está abaixo do peso ideal.");
                    } else {
                        System.out.println("Você está no peso ideal!");
                    }
                    break;
                case 4:
                    System.out.print("Digite a altura (ex: 1,65): ");
                    double altM = sc.nextDouble();
                    System.out.print("Digite o peso atual (kg): ");
                    double pesoM = sc.nextDouble();
                    double idealM = (62.1 * altM) - 44.7;
                    System.out.printf("Peso ideal: %.2f kg%n", idealM);
                    if (pesoM > idealM) {
                        System.out.println("Você está acima do peso ideal.");
                    } else if (pesoM < idealM) {
                        System.out.println("Você está abaixo do peso ideal.");
                    } else {
                        System.out.println("Você está no peso ideal!");
                    }
                    break;
                default:
                    System.out.println("Opção inválida.");
            }

            System.out.print("Deseja encerrar o programa? Digite 'S' para sim: ");
            encerrar = sc.next();
        } while (!encerrar.equals("S"));

        sc.close();
    }
}
