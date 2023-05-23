import java.util.Arrays;
import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        // 2. Elaborar um programa que
        // leia oito elementos inteiros em uma matriz A do tipo vetor.
        // Construir uma matriz B de mesma dimensão
        // com os elementos da matriz A multiplicados por 3.
        // O elemento B[1] deve ser implicado pelo elemento A[1] * 3,
        // o elemento B[2] implicado pelo elemento A[2] * 3,
        // e assim por diante, até 8. Apresentar a matriz B

        Scanner scanner = new Scanner(System.in);

        int matriz_a[] = new int[8];
        int matriz_b[] = new int[matriz_a.length];

        for (int indice = 0; indice < matriz_a.length; indice++) {
            System.out.println("Informe um valor: ");
            matriz_a[indice] = scanner.nextInt();
            matriz_b[indice] = matriz_a[indice] * 3;
            System.out.println(Arrays.toString(matriz_a));
            System.out.println(Arrays.toString(matriz_b));
        }

        scanner.close();
    }
}
