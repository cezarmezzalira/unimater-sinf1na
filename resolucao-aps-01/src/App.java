import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);
        String nome = "";
        String bairro = "";
        String rua = "";
        String numero = "";
        double saldo_inicial = 0;

        do {
            System.out.print("Informe seu nome: ");
            nome = scanner.nextLine();
        } while (nome.isEmpty());

        System.out.print("Informe seu bairro: ");
        bairro = scanner.nextLine();

        System.out.print("Informe sua rua: ");
        rua = scanner.nextLine();

        System.out.print("Informe seu numero: ");
        numero = scanner.nextLine();

        System.out.print("Informe o saldo inicial: ");
        saldo_inicial = scanner.nextDouble();

        System.out.print("Dados cadastrados: \n");
        System.out.printf("Nome: %s, Endereço: %s, %s, Bairro: %s\n",
                nome, rua, numero, bairro, saldo_inicial);

        scanner.close();
    }
}
