import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe um número: ");
        double valor = scanner.nextDouble();

        double valorDobro = valor * 2;

        System.out.printf("O dobro do valor é %.2f\n", valorDobro);
        scanner.close();
    }
}
