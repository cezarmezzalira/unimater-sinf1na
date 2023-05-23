import java.util.Arrays;

public class Exemplo03 {
    public static void main(String[] args) {
        int[] numeros = { 7, 3, 1, 9,
                5, 2, 8, 6, 4,
                1, 4, 1, 8, 0,
                7, 3 };

        int total_comparacoes = 0;
        int total_trocas = 0;
        // ordenar de forma crescente a lista de números
        System.out.println(Arrays.toString(numeros));
        for (int i = 0; i < numeros.length - 1; i++) {
            System.out.println("Iteração >>>>>>>>>>>>>" + (i + 1));
            for (int j = i + 1; j < numeros.length; j++) {
                total_comparacoes++;
                if (numeros[i] > numeros[j]) {
                    total_trocas++;
                    // armazenando o maior valor antes da substituição
                    int tempNumero = numeros[i];
                    // jogo o menor valor na posição do maior
                    numeros[i] = numeros[j];
                    // jogo o maior valor na posição do menor
                    numeros[j] = tempNumero;
                }
                System.out.println("Substituição " + j +
                        Arrays.toString(numeros));
            }
        }
        System.out.println("Total de comparações: " + total_comparacoes);
        System.out.println("Total de trocas: " + total_trocas);
    }
}
