import java.util.Scanner;
import java.lang.Math;

public class Exemplo02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe um valor: ");
        double N = scanner.nextDouble();
        if (N >= 0) {
            double R = Math.sqrt(N);
            System.out.println("A raiz quadrada de "
                    + N + " é igual a " + R);
        }
        scanner.close();
    }
}
