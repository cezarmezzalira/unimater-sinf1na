import java.util.Scanner;

public class Exemplo04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char resposta = 'S';

        while (resposta != 'N') {
            System.out.println("Informe um valor: ");
            int valor_n = scanner.nextInt();

            int valor_r = valor_n * 3;

            System.out.println(valor_r);

            System.out.println("Deseja continuar?");

            resposta = scanner.next().charAt(0);

        }

        scanner.close();
    }
}
