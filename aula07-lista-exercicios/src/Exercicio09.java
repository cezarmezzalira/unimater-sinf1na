import java.util.Random;
import java.util.Scanner;

public class Exercicio09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Random random = new Random();
        int resultado = random.nextInt(4) + 1;

        System.out.println("Aposte com o Java!\nInforme um número de 1 a 4");
        int aposta = scanner.nextInt();

        if (aposta == resultado) {
            System.out.println("Você acertou!");
        } else {
            System.out.println("Você errou.");
        }

        scanner.close();
    }
}
