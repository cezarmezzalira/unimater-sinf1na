import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe o nome do primeiro jogador: ");
        String jogador1 = scanner.nextLine();

        System.out.println("Informe o nome do segundo jogador: ");
        String jogador2 = scanner.nextLine();

        System.out.println("Jogador 1, informe sua jogada (1-pedra; 2-papel; 3-tesoura): ");
        int jogada_jogador1 = scanner.nextInt();

        System.out.println("Jogador 2, informe sua jogada (1-pedra; 2-papel; 3-tesoura): ");
        int jogada_jogador2 = scanner.nextInt();

        String vencedor = "";

        if (jogada_jogador1 == 1 &&
                jogada_jogador2 == 3) { // pedra e tesoura
            vencedor = jogador1;
        } else if (jogada_jogador1 == 1 &&
                jogada_jogador2 == 2) { // pedra e papel
            vencedor = jogador2;
        } else if (jogada_jogador1 == 2 &&
                jogada_jogador2 == 3) { // papel e tesoura
            vencedor = jogador2;
        } else if (jogada_jogador1 == 2 &&
                jogada_jogador2 == 1) { // papel e pedra
            vencedor = jogador1;
        } else if (jogada_jogador1 == 3 &&
                jogada_jogador2 == 2) { // tesoura e papel
            vencedor = jogador1;
        } else if (jogada_jogador1 == 3 &&
                jogada_jogador2 == 1) { // tesoura e pedra
            vencedor = jogador2;
        }

        System.out.println("O vencedor foi " + vencedor);

        scanner.close();
    }
}
