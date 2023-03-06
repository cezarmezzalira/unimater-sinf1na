import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        /*
         * 3 - Declare e inicialize uma variável do tipo String
         * chamada name com seu próprio nome.
         * Em seguida, imprima uma mensagem que diga
         * "Olá, meu nome é [nome]",
         * na sequência declare outra variável, e através
         * da Classe Scanner, peço ao usuário para
         * informar o sobrenome, e por fim imprima o nome completo.
         */
        String name = "Cezar";
        System.out.println("Olá, meu nome é " + name);

        Scanner meuScanner = new Scanner(System.in);

        System.out.println("Informe o sobrenome");

        String sobrenome = meuScanner.nextLine();

        System.out.println("Seu nome completo é " + name + " " + sobrenome);
        System.out.printf("Seu nome completo é %s %s\n", name, sobrenome);

        meuScanner.close();

    }
}
