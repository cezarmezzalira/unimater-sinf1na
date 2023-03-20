import java.util.Scanner;

public class Exemplo01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int i = 1;

        while (i <= 5) {
            System.out.println("Informe um valor: ");
            int valor_n = scanner.nextInt();
            int valor_r = valor_n * 3;

            System.out.println(valor_r);
            i = i + 1;
            // Autoincremento
            // i++;
        }

        scanner.close();
    }
}
