import java.util.Random;
import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Jogo de advinhação");

        Random random = new Random();
        int resultado = random.nextInt(100) + 1;

        boolean acertou = false;
        do {
            // Leu a informação do usuário
            System.out.println("Informe um número de 0 a 100");
            int aposta = scanner.nextInt();

            if (aposta < resultado) {
                System.out.println("O resultado é maior ");
            } else if (aposta > resultado) {
                System.out.println("O resultado é menor ");
            } else {
                acertou = true;
                System.out.println("Você acertou");
            }
            // Forma sem mensagens
            // acertou = (aposta == resultado);

        } while (!acertou);

        System.out.println("Jogo encerrado!");

        scanner.close();
    }

}