import java.util.Scanner;

public class Exemplo10 {
    public static void main(String[] args) {
        // Laço incondicional com incremento
        Scanner scanner = new Scanner(System.in);
        // para variavel de 1 até 10 passo variavel = variavel +1 faça

        for (int i = 1; i <= 5; i++) {
            System.out.print("Informe um valor: ");
            int valor = scanner.nextInt();
            int resultado = valor * 3;
            System.out.println("O resultado é " + resultado);
        }

        scanner.close();
    }
}
