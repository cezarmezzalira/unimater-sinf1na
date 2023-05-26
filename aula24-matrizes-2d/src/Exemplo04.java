import java.util.Arrays;
import java.util.Scanner;

public class Exemplo04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Array bidimensional
        int[][] matriz_2d = new int[2][3];
        // Percorrro a matriz no sentido da linha (vertical)
        for (int i = 0; i < matriz_2d.length; i++) {
            // Percorro a matriz no sentido da coluna (horizontal)
            for (int j = 0; j < matriz_2d[i].length; j++) {
                System.out.println("Informe um valor inteiro");
                int valor = scanner.nextInt();
                matriz_2d[i][j] = valor;
            }
            System.out.println(Arrays.toString(matriz_2d[i]));
        }
    }
}
