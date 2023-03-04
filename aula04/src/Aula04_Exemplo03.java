import java.util.Scanner;

public class Aula04_Exemplo03 {
    public static void main(String[] args) {
        Scanner meuScanner = new Scanner(System.in);
        System.out.println("Digite seu nome:");
        String nome = meuScanner.nextLine();
        System.out.println("Olá " + nome);

        System.out.println("Digite seu telefone:");
        int telefone = meuScanner.nextInt();
        System.out.println("Seu telefone é " + telefone);
        meuScanner.close();
    }
}
