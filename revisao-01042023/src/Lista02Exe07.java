import java.math.BigInteger;

public class Lista02Exe07 {
    public static void main(String[] args) {
        final int tamanho_tabuleiro = 64;

        BigInteger total_graos = BigInteger.valueOf(0L);
        BigInteger dobro_graos = BigInteger.valueOf(1L);
        for (int i = 1; i <= tamanho_tabuleiro; i++) {
            // if (i == 1) {
            // total_graos = total_graos.add(dobro_graos);
            // } else {
            // dobro_graos = dobro_graos.multiply(BigInteger.valueOf(2L));
            // total_graos = total_graos.add(dobro_graos);
            // }

            if (i > 1) {
                dobro_graos = dobro_graos.multiply(BigInteger.valueOf(2L));
            }
            total_graos = total_graos.add(dobro_graos);

            System.out.printf("\nTotal graos casa %d é igual a %d", i, total_graos);

        }

    }
}
