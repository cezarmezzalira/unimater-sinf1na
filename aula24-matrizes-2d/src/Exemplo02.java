public class Exemplo02 {
    public static void main(String[] args) {
        // Array bidimensional, com 2 linhas e três colunas.
        int[][] matriz_2d = {
                { 7, 8, 5 },
                { 10, 7, 6 }
        };

        // Percorrro a matriz no sentido da linha
        for (int i = 0; i < matriz_2d.length; i++) {
            //
            for (int j = 0; j < matriz_2d[i].length; j++) {
                System.out.printf("linha %d - coluna %d = %d\n", i, j, matriz_2d[i][j]);
            }
        }
        System.out.println();
    }
}
