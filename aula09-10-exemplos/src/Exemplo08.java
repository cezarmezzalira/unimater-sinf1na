import java.util.Scanner;

public class Exemplo08 {
    public static void main(String[] args) {
        // Laço condicional pós-teste interativo de condição verdadeira
        Scanner scanner = new Scanner(System.in);
        System.out.println("Deseja continuar? (S ou N)");
        char resposta = scanner.next().charAt(0);

        do {
            System.out.println("Informe um valor: ");
            int valor_n = scanner.nextInt();
            int valor_r = valor_n * 3;

            System.out.println("A multiplicação de " + valor_n
                    + " por 3 é igual a " + valor_r);

            System.out.println("Deseja continuar? (S ou N)");
            resposta = scanner.next().charAt(0);
        } while (resposta == 'S');

        scanner.close();
    }
}
