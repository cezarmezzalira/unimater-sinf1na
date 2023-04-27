import java.util.Scanner;

public class Exercicio11 {
    public static void main(String[] args) {
        /*
         * Escreva um programa de controle de senha
         * que dê três chances de acerto ao usuário;
         * se ele não conseguir, o programa deve avisar
         * que o cartão foi bloqueado.
         */

        final int senha = 123456;
        int contagem = 0;

        Scanner scanner = new Scanner(System.in);

        // do {
        // System.out.print("Informe a senha: ");
        // int senhaUsuario = scanner.nextInt();

        // if (senha == senhaUsuario) {
        // System.out.println("Senha correta");
        // break;
        // } else {
        // System.out.println("Errou amigão!");
        // contagem++;
        // }
        // } while (contagem < 2);

        for (int i = 1; i <= 3; i++) {
            System.out.print("Informe a senha: ");
            int senhaUsuario = scanner.nextInt();

            if (senha == senhaUsuario) {
                System.out.println("Senha correta");
                break;
            } else {
                System.out.println("Errou amigão!");
                contagem++;
            }
        }

        if (contagem == 3) {
            System.out.println("Seu cartão foi hackeado!");
        }

        scanner.close();
    }
}
