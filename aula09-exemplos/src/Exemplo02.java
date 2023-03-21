import java.util.Scanner;

public class Exemplo02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char resposta = 'S';

        while (resposta == 'S') {
            System.out.println("Informe um valor: ");
            int valor_n = scanner.nextInt();

            int valor_r = valor_n * 3;

            System.out.println("A multiplicação de " + valor_n
                    + " por 3 é igual a " + valor_r);

            System.out.println("Deseja continuar? (S ou N)");

            resposta = scanner.next().charAt(0);

        }

        scanner.close();
    }
}
