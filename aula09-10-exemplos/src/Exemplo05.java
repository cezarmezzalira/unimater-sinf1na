import java.util.Scanner;

public class Exemplo05 {
    public static void main(String[] args) {
        // Laço condicional pós-teste iterativo de condição falsa
        Scanner scanner = new Scanner(System.in);
        int i = 1;

        do {
            System.out.printf("Executando pela %dx\n", i);
            System.out.println("Informe um valor: ");
            int valor_n = scanner.nextInt();
            int valor_r = valor_n * 3;

            System.out.println(valor_r);
            i = i + 1;
        } while (!(i > 5));

        scanner.close();
    }
}
