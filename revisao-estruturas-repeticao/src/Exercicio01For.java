import java.util.Scanner;

/**
 * Exercicio01-For
 */
public class Exercicio01For {

    public static void main(String[] args) {
        // calcular o imposto de renda de um ano,
        // mês a mês e mostrar o total do imposto.

        Scanner scanner = new Scanner(System.in);

        double total_imposto = 0;
        // para i = 0 enquanto i < 12 então i = i + 1
        for (int i = 0; i < 12; i++) {
            System.out.printf("\nInforme o salário do mês %d: ", (i + 1));
            double salario = scanner.nextDouble();
            double imposto = salario * 0.75;
            total_imposto = total_imposto + imposto;
        }
        System.out.printf("O total de imposto de doze meses é: R$ %.2f",
                total_imposto);
        scanner.close();
    }
}