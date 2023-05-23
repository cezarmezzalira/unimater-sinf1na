import java.util.Scanner;

public class Exemplo01 {
    public static void main(String[] args) {
        String[] nomes = { "Golias", "Rodolfo", "Paula",
                "Alexa", "Mario", "Neymar",
                "Roberto", "Celso", "Jacinto", "João" };

        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe o nome para ser pesquisado: ");
        String nome_pesquisa = scanner.nextLine();

        // boolean achou = false;
        int indice_achou = -1;
        // pesquisa sequencial
        // 1- percorrer a lista
        for (int i = 0; i < nomes.length; i++) {
            // 2- Comparação
            if (nome_pesquisa.equalsIgnoreCase(nomes[i])) {
                // achou = true;
                indice_achou = i;
                break;
            }
        }

        if (indice_achou >= 0) {
            System.out.println("Nome encontrado no indice "
                    + indice_achou);
        } else {
            System.out.println(nome_pesquisa
                    + " não foi encontrado.");
        }

        // if (!achou) {
        // System.out.println(nome_pesquisa + " não foi encontrado.");
        // }
        scanner.close();
    }
}
