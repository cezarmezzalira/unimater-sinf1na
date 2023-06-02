import java.util.Arrays;

public class Exemplo02 {
    public static void main(String[] args) {
        int[][] matriz_valores = {
                { 2, 4, 3 }, // indice 0
                { 4, 20, 12 }, // indice 1
                { 3, 25, 8 }, // indice 2
                { 11, 22, 42 }, // indice 3
                { 7, 21, 35 } // indice 4
        };

        // int valor = matriz_valores[2][1];
        // System.out.println(valor);

        System.out.println("Mostrando todos os itens da matriz por linha");
        for (int linha = 0; linha < matriz_valores.length; linha++) {
            // System.out.println(Arrays.toString(matriz_valores[linha]));
            for (int coluna = 0; coluna < matriz_valores[linha].length; coluna++) {
                System.out.print(", " + matriz_valores[linha][coluna]);
            }
            System.out.println();
        }

        System.out.println("Mostrando todos os itens da primeira coluna");
        for (int linha = 0; linha < matriz_valores.length; linha++) {
            System.out.println(matriz_valores[linha][0]);
            System.out.println();
        }

        System.out.println("Mostrando todos os itens da matriz por coluna ");
        for (int coluna = 0; coluna < matriz_valores[0].length; coluna++) {
            for (int linha = 0; linha < matriz_valores.length; linha++) {
                System.out.println(matriz_valores[linha][coluna]);
            }
            System.out.println();
        }
        System.out.println(Arrays.deepToString(matriz_valores));
    }
}
