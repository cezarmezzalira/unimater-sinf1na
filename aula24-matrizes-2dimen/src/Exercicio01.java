import java.util.Arrays;
import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[][] agenda = new String[10][5];

        for (int i = 0; i < agenda.length; i++) {
            System.out.println("Cadastro de usuário - ID " + (i + 1));

            // nome
            System.out.print("Informe o nome: ");
            agenda[i][0] = scanner.nextLine();

            // endereço
            System.out.print("Informe o endereço: ");
            agenda[i][1] = scanner.nextLine();

            // código postal ou cep
            // bairro
            // telefone

            System.out.println(Arrays.toString(agenda[i]));
        }
        // Ordenar a matriz pelo campo nome

    }
}
