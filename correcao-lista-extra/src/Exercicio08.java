import java.util.Scanner;

public class Exercicio08 {
    public static void main(String[] args) {
        /**
         * Escreva um programa que resolva o seguinte problema:
         * uma cópia “xerox” custa R$ 0,25 por folha,
         * mas acima de 100 folhas esse valor cai para
         * R$ 0,20 por unidade. Dado o total de cópias,
         * informe o valor a ser pago.
         */
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe a quantidade de cópias: ");
        int copias = scanner.nextInt();

        double total = 0;

        if (copias <= 100) {
            total = copias * 0.25;
        } else {
            total = copias * 0.2;
        }

        System.out.printf("O valor a ser pago por %d cópias é de R$ %.2f\n",
                copias, total);

        scanner.close();
    }

}
