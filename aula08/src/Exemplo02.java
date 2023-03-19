import java.util.Scanner;

public class Exemplo02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe o valor do salário");

        double SA = scanner.nextDouble();
        double NS = 0;

        if (SA < 500) {
            NS = ((SA * 15) / 100) + SA;
        } else {
            if (SA <= 1000) {
                NS = ((SA * 10) / 100) + SA;
            } else {
                NS = ((SA * 5) / 100) + SA;
            }
        }

        System.out.println(" Seu novo salário é de " + NS);

        scanner.close();
    }
}
