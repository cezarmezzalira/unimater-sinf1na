import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Jogador 1, escolha sua opção de jogada: (X-xis ou 0-Zero)");
        char opcao_jogador_1 = scanner.nextLine().charAt(0);

        char opcao_jogador_2 = ' ';
        do {
            System.out.println("Jogador 2, escolha sua opção de jogada: (X-xis ou 0-Zero)");
            opcao_jogador_2 = scanner.nextLine().charAt(0);
        } while (opcao_jogador_2 == opcao_jogador_1);

        char casa_1 = ' ';
        char casa_2 = ' ';
        char casa_3 = ' ';
        char casa_4 = ' ';
        char casa_5 = ' ';
        char casa_6 = ' ';
        char casa_7 = ' ';
        char casa_8 = ' ';
        char casa_9 = ' ';

        for (int i = 1; i <= 9; i++) {
            System.out.println("Jogador 1, faça sua jogada");
            char jogada_jogador_1 = scanner.System.out.println("Jogador 1, faça sua jogada");
        }
    }
}
