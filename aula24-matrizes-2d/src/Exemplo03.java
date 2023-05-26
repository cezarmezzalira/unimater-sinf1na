import java.util.Scanner;

public class Exemplo03 {
    public static void main(String[] args) {
        // Array bidimensional         
        int[][] matriz_2d = new int[2][3];

        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe um valor inteiro");
        int valor = scanner.nextInt();
        // Atribuo o valor para  linha 0, coluna 0
        matriz_2d[0][0] = valor;
    }
}
