import java.util.Scanner;

public class Exercicio08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Simulação de conta bancária
        System.out.println("Bem vindo! Informe o seu saldo inicial: ");
        double saldo_inicial = scanner.nextDouble();

        System.out.println("Agora, informe o valor que deseja sacar: ");
        double valor_saque = scanner.nextDouble();

        double saldo = 0;
        if (valor_saque <= saldo_inicial) {
            saldo = saldo_inicial - valor_saque;
        } else {
            saldo = saldo_inicial;
            System.out.println("Saldo insuficiente");
        }

        System.err.println("Saldo atual: " + saldo);

        scanner.close();
    }
}
