import java.util.Scanner;

public class Exercicio09 {
    public static void main(String[] args) {
        /*
         * Escreva um programa que informe a
         * categoria de um jogador de futebol,
         * considerando sua idade: infantil (até 13 anos),
         * juvenil (até 17 anos) ou sênior (acima de 17 anos).
         */

        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe a sua idade: ");
        int idade = scanner.nextInt();

        if (idade <= 13) {
            System.out.println("\nSua categoria é infantil.");
        } else if (idade <= 17) {
            System.out.println("\nSua categoria é juvenil.");
        } else {
            System.out.println("\nSua categoria é sênior.");
        }

        scanner.close();
    }
}
