import java.util.Arrays;
import java.util.Random;

public class Exercicio06 {
    public static void main(String[] args) {
        // 6) Uma grande empresa precisa
        // fazer o levantamento dos setores
        // que mais imprimem em um
        // determinado período do dia. Para
        // simular, gere uma lista de 100
        // valores inteiros usando a classe
        // Random, ordene do maior para o
        // menor e imprima os 10 maiores
        // valores.

        int[] total_impressoes = new int[100];

        Random random = new Random();

        // passo 1 - gerar 100 valores aleatoriamente com o RANDOM
        for (int indice = 0; indice < total_impressoes.length; indice++) {
            total_impressoes[indice] = random.nextInt(100) + 1;
        }

        System.out.println(Arrays.toString(total_impressoes));

        // passo 2 - ordernar do maior para o menor
        for (int i = 0; i < total_impressoes.length - 1; i++) {
            for (int j = i + 1; j < total_impressoes.length; j++) {
                if (total_impressoes[i] < total_impressoes[j]) {
                    int temp = total_impressoes[i];
                    total_impressoes[i] = total_impressoes[j];
                    total_impressoes[j] = temp;
                }
            }
        }

        System.out.println(Arrays.toString(total_impressoes));

        int[] top10 = new int[10];
        // passo 3 - imprimir os 10 maiores valores
        for (int i = 0; i < top10.length; i++) {
            top10[i] = total_impressoes[i];
        }

        System.out.println(Arrays.toString(top10));

    }
}
