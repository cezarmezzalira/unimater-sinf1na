import java.util.Scanner;

public class Exemplo01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe o primeiro valor: ");
        double valor1 = scanner.nextDouble();

        System.out.print("\nInforme o segundo valor:");
        double valor2 = scanner.nextDouble();

        double adicao = valor1 + valor2;

        if (adicao > 10) {
            System.out.println(adicao);
        }

        scanner.close();
    }
}
