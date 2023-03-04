import java.util.Scanner;

public class Aula04_Exercicio01 {
    public static void main(String[] args) {
        Scanner meuScanner = new Scanner(System.in);
        String provedor = "Provedor do Cezar";
        System.out.printf("Olá, bem vindo a central de atendimento %s\n", provedor);
        // Constante: final Tipo nome = valor;
        final String atendente = "Fulano";
        System.out.println("Meu nome é " + atendente + ", sou seu assistente virtual");
        // System.out.printf("Meu nome é %s, sou seu assistente virtual\n", atendente);
        System.out.println("Durante o atendimento siga minhas instruções");
        System.out.println("Primeiramente informe seu nome");
        String nome = meuScanner.nextLine();
        System.out.println("Obrigado " + nome + ", como posso lhe ajudar?");
        System.out.println("Poderia informar seu telefone?");
        Integer telefone = meuScanner.nextInt();
        System.out.println("O telefone informado é "+telefone.toString());
        System.out.println("Poderia informar sua idade?");
        int idade = meuScanner.nextInt();
        System.out.println("A idade informada é " + idade);
        System.out.println("Confirme sua idade");
        idade = meuScanner.nextInt();
        meuScanner.close();
    }
}
