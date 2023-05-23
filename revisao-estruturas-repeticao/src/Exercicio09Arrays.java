import java.util.Arrays;
import java.util.Random;

public class Exercicio09Arrays {
    // 9. Escrever um programa que leia três matrizes (A, B e C)
    // de uma dimensão do tipo vetor com cinco elementos cada
    // que sejam do tipo real. Construir uma matriz D,
    // sendo esta o resultado da junção das três matrizes (A, B e C).
    // Desta forma, a matriz D deve ter o triplo de elementos das matrizes
    // A, B e C, ou seja, 15 elementos.
    // Apresentar os elementos da matriz D

    public static void main(String[] args) {
        double matriz_a[] = new double[5];
        double matriz_b[] = new double[5];
        double matriz_c[] = new double[5];
        double matriz_d[] = new double[15];
        Random random = new Random();

        for (int indice = 0; indice < 5; indice++) {
            matriz_a[indice] = Math.floor(random.nextDouble() * 100);
            matriz_b[indice] = Math.floor(random.nextDouble() * 100);
            matriz_c[indice] = Math.floor(random.nextDouble() * 100);
        }
        System.out.println("Matriz A: " + Arrays.toString(matriz_a));
        System.out.println("Matriz B: " + Arrays.toString(matriz_b));
        System.out.println("Matriz C: " + Arrays.toString(matriz_c));

        for (int indice = 0; indice < 15; indice++) {
            if (indice < 5) {
                matriz_d[indice] = matriz_a[indice];
            } else if (indice < 10) {
                matriz_d[indice] = matriz_b[indice - 5];
            } else if (indice < 15) {
                matriz_d[indice] = matriz_c[indice - 10];
            }
        }

        System.out.println(Arrays.toString(matriz_d));
    }
}
