import java.util.Scanner;

public class Exercicio02While {
    public static void main(String[] args) {
        // Validar uma senha 3 vezes e se não obter sucesso, mostrar mensagem de erro

        boolean sucesso = false;
        int tentativa = 1;
        String senha = "123";

        Scanner scanner = new Scanner(System.in);

        while (sucesso == false && tentativa <= 3) {
            System.out.printf("Informe a senha: (Tentativa %d)", tentativa);
            String contrasenha = scanner.nextLine();

            if (senha.equals(contrasenha)) {
                sucesso = true;
                System.out.println("Senha válida");
            } else {
                sucesso = false;
                System.out.println("Senha inválida");
            }
            tentativa++;
        }

        if (sucesso) {
            System.out.println("Acesso garantido");
        } else {
            System.out.println("Acesso negado");
        }
        scanner.close();
    }
}
