import java.util.Scanner;

public class Exemplo11 {
    public static void main(String[] args) {
        // Laço incondicional com decremento
        Scanner scanner = new Scanner(System.in);
        // para variavel de 1 até 10 passo variavel = variavel +1 faça

        for (int i = 5; i >= 1; i--) {
            System.out.println("Executando pela " + i + "x");
            System.out.print("Informe um valor: ");
            int valor = scanner.nextInt();
            int resultado = valor * 3;
            System.out.println("O resultado é " + resultado);
        }

        scanner.close();
    }
}
