import java.util.Scanner;

public class Exemplo07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // nome 1
        System.out.print("Informe o nome da primeira pessoa: ");
        String nome1 = scanner.next();
        // genero 1
        System.out.print("Informe o genero da pessoa: ");
        char genero1 = scanner.next().charAt(0);

        // nome 2
        System.out.print("Informe o nome da segunda pessoa: ");
        String nome2 = scanner.next();
        // genero 2
        System.out.print("Informe o genero da pessoa: ");
        char genero2 = scanner.next().charAt(0);

        // se o genero das duas pessoas forma um par
        if ((genero1 == 'M') ^ (genero2 == 'M')) {
            System.out.printf("%s e %s formam par!\n", nome1, nome2);
        } else {
            System.out.printf("%s e %s não formam par!\n", nome1, nome2);
        }

        scanner.close();
    }
}
