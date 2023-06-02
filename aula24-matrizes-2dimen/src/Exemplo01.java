import java.util.Arrays;

public class Exemplo01 {

    public static void main(String[] args) {
        // matriz unidimensional ou vetor
        // int[] matriz = new int[5];

        // int[][] matriz_2d = new int[2][3];
        // 1 3 4 -> vetor
        // 1 4 5
        int[][] matriz_2d = {
                { 1, 3 }, // indice 0
                { 1, 4 }, // indice 1
                { 4, 9 } // indice 2
        };

        int[] linha_1 = matriz_2d[0];

        System.out.println(Arrays.toString(linha_1));
    }
}