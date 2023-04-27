import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe o valor em reais para a conversão: R$ ");
        double valorEmReais = scanner.nextDouble();

        System.out.print("Informe o valor da cotação do dolar hoje: R$ ");
        double valorCotacaoDolar = scanner.nextDouble();

        double valorEmDolares = valorEmReais / valorCotacaoDolar;

        System.out.printf("Você terá US$ %.2f", valorEmDolares);

        scanner.close();

    }
}
