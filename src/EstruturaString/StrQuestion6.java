package EstruturaString;
import java.util.Random;
import java.util.Scanner;

public class StrQuestion6 {

    // Função de Recombinação
    public static String[] recombinacao(String s1, String s2) {
        Random random = new Random();
        int tamanho = s1.length();

        // Sorteia um ponto de corte
        int pontoCorte = random.nextInt(tamanho - 1) + 1;

        // Faz o corte e a troca das partes (fatiamento com substring)
        String parte1S1 = s1.substring(0, pontoCorte);
        String parte2S1 = s1.substring(pontoCorte);

        String parte1S2 = s2.substring(0, pontoCorte);
        String parte2S2 = s2.substring(pontoCorte);

        // Gera os dois filhos combinando as metades
        String s3 = parte1S1 + parte2S2;
        String s4 = parte1S2 + parte2S1;

        return new String[] { s3, s4 };
    }

    // Função de Mutação
    public static String mutacao(String s) {
        Random random = new Random();
        char[] caracteres = s.toCharArray(); // Transforma a string em vetor de letras para poder alterar

        // Sorteia uma posição aleatória para sofrer mutação
        int posicao = random.nextInt(caracteres.length);

        // Sorteia uma nova letra aleatória entre 'A', 'T', 'C' e 'G' (padrão genético)
        char[] bases = { 'A', 'T', 'C', 'G' };
        char novaLetra;
        do {
            novaLetra = bases[random.nextInt(bases.length)];
        } while (novaLetra == caracteres[posicao]); // Garante que a letra realmente mude

        // Aplica a mutação na posição sorteada
        caracteres[posicao] = novaLetra;

        return new String(caracteres);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe a String S1 : ");
        String s1 = scanner.nextLine().toUpperCase();

        System.out.print("Informe a String S2 : ");
        String s2 = scanner.nextLine().toUpperCase();

        // Recombinação gerando S3 e S4
        String[] filhos = recombinacao(s1, s2);
        String s3 = filhos[0];
        String s4 = filhos[1];

        // Aplica mutação
        s3 = mutacao(s3);

        // 3. Exibe os 4 indivíduos da população final
        System.out.println("\n--- População Resultante ---");
        System.out.println("S1 (Pai 1): " + s1);
        System.out.println("S2 (Pai 2): " + s2);
        System.out.println("S3 (Filho 1 com mutação): " + s3);
        System.out.println("S4 (Filho 2): " + s4);

        scanner.close();
    }
}


