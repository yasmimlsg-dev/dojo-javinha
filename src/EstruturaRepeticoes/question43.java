package EstruturaRepeticoes;
import java.math.BigInteger;

public class question43 {
    public static void main(String[] args) {
        // Como estoura o limite de 'long', usamos BigInteger
        BigInteger somaGraos = BigInteger.ZERO;
        BigInteger graosQuadro = BigInteger.ONE;

        for (int i = 1; i <= 64; i++) {
            somaGraos = somaGraos.add(graosQuadro);
            graosQuadro = graosQuadro.multiply(BigInteger.TWO);
        }

        System.out.println("O total de grãos esperados é: " + somaGraos);
    }
}
