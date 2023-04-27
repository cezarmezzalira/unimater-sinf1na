import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe um valor: ");
        double valor1 = scanner.nextDouble();

        System.out.print("\nInforme outro valor: ");
        double valor2 = scanner.nextDouble();

        double soma = valor1 + valor2;
        System.out.printf("O resultado do cálculo %.2f + %.2f é igual a: %.2f\n",
                valor1, valor2, soma);

        double subtracao = valor1 - valor2;
        System.out.printf("O resultado do cálculo %.2f - %.2f é igual a: %.2f\n",
                valor1, valor2, subtracao);

        double divisao = valor1 / valor2;
        System.out.printf("O resultado do cálculo %.2f / %.2f é igual a: %.2f\n",
                valor1, valor2, divisao);

        double multiplicacao = valor1 * valor2;
        System.out.printf("O resultado do cálculo %.2f * %.2f é igual a: %.2f\n",
                valor1, valor2, multiplicacao);

        scanner.close();
    }
}
