import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe a medida do lado 1: ");
        double lado1 = scanner.nextDouble();

        System.out.print("Informe a medida do lado 2: ");
        double lado2 = scanner.nextDouble();

        double resultado = lado1 * lado2;

        System.out.printf("A área dessa sala é %.2f", resultado);

        scanner.close();
    }
}
