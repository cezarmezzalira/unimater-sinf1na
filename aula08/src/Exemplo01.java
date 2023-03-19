import java.util.Scanner;

public class Exemplo01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe um valor");
        int valor = scanner.nextInt();

        if (valor == 1) {
            System.out.println("Você entrou o valor 1");
        }

        if (valor == 2) {
            System.out.println("Você entrou o valor 2");
        }

        if (valor < 1) {
            System.out.println("Você entrou um valor muito baixo");
        }

        if (valor > 2) {
            System.out.println("Você entrou um valor muito alto");
        }

        scanner.close();
    }
}
