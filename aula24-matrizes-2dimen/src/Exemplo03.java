import java.util.Arrays;
import java.util.Scanner;

public class Exemplo03 {
    public static void main(String[] args) {
        double[][] matriz = new double[3][4];

        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe o valor da primeira linha e primeira coluna");
        matriz[0][0] = scanner.nextDouble();

        System.out.println(Arrays.deepToString(matriz));

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.println("Informe um valor");
                matriz[i][j] = scanner.nextDouble();
            }
        }
        System.out.println(Arrays.deepToString(matriz));

    }
}
