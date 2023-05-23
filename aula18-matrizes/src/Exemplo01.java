import java.util.Arrays;
import java.util.Scanner;

public class Exemplo01 {
    public static void main(String[] args) {
        // Desenvolver um programa que leia dez elementos
        // numéricos reais de uma matriz A do tipo vetor.
        // Construir uma matriz B de mesmo tipo,
        // observando a seguinte lei de formação:
        // se o valor do índice da matriz A for par,
        // o valor deve ser multiplicado por 5;
        // sendo ímpar, deve ser somado com 5.
        // Ao final, mostrar o conteúdo da matriz A e B.

        double[] matriz_a = new double[10];
        double[] matriz_b = new double[10];

        Scanner scanner = new Scanner(System.in);

        for (int indice = 0; indice < 10; indice++) {
            System.out.println("Informe um valor: ");
            double valor = scanner.nextDouble();
            matriz_a[indice] = valor;

            if (indice % 2 == 0) {
                matriz_b[indice] = valor * 5;
            } else {
                matriz_b[indice] = valor + 5;
            }

        }

        System.out.println(Arrays.toString(matriz_a));
        System.out.println(matriz_a[2]);
        System.out.println(Arrays.toString(matriz_b));

        scanner.close();
    }
}
