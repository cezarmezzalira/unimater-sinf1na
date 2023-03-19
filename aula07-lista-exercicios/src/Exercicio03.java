import java.util.Random;
import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Jogador 1, informe seu nome: ");
        String jogador1 = scanner.nextLine();

        System.out.println("Jogador 2, informe seu nome: ");
        String jogador2 = scanner.nextLine();

        System.out.println("Jogador 1, informe sua jogada (cara ou coroa)");
        String jogada_jogador1 = scanner.nextLine();

        System.out.println("Jogador 2, informe sua jogada (cara ou coroa)");
        String jogada_jogador2 = scanner.nextLine();

        Random random = new Random();
        int resultado = random.nextInt(1);

        // zero = cara
        // um = coroa
        String resultadoTexto;
        if (resultado > 0) {
            resultadoTexto = "coroa";
        } else {
            resultadoTexto = "cara";
        }

        if (jogada_jogador1.equals(jogada_jogador2) &&
                jogada_jogador1.equals(resultadoTexto)) {
            System.out.println("Empate!");
        } else if (jogada_jogador1.equals(resultadoTexto)) {
            System.out.println("Jogador " + jogador1 + " é o vencedor! Escolha: " + jogada_jogador1);
        } else if (jogada_jogador2.equals(resultadoTexto)) {
            System.out.println("Jogador " + jogador2 + " é o vencedor! Escolha: " + jogada_jogador2);
        } else {
            System.out.println("Não houve ganhador.");
        }
        scanner.close();
    }
}
