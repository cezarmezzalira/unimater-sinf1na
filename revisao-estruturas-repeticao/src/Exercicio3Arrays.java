import java.util.Scanner;

public class Exercicio3Arrays {
    public static void main(String[] args) {
        // 3. Escrever um programa que leia duas matrizes
        // (denominadas A e B) do tipo vetor com 20 elementos reais.
        // Construir uma matriz C, sendo cada elemento da matriz C
        // a subtração de um elemento correspondente da matriz A
        // com um elemento correspondente da matriz B, ou seja,
        // a operação de processamento deve estar baseada na operação
        // C[I] ← A[I] – B[I].
        // Ao final, apresentar os elementos da matriz C

        double matriz_a[] = new double[20];
        double matriz_b[] = new double[20];
        double matriz_c[] = new double[20];

        Scanner scanner = new Scanner(System.in);

        for (int indice = 0; indice < 20; indice++) {
            System.out.printf("\nInforme o valor do indice %d para a matriz A",
                    indice);
            matriz_a[indice] = scanner.nextDouble();

            System.out.printf("\nInforme o valor do indice %d para a matriz B",
                    indice);
            matriz_b[indice] = scanner.nextDouble();

            matriz_c[indice] = matriz_a[indice] - matriz_b[indice];
        }

        for (int indice = 0; indice < 20; indice++) {
            System.out.println(matriz_c[indice]);
        }
        scanner.close();
    }
}
