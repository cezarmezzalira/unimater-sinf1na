import java.util.Arrays;
import java.util.Scanner;

public class Exemplo02 {
    public static void main(String[] args) {
        String[] nomes = { "Golias", "Rodolfo", "Paula",
                "Alexa", "Mario", "Neymar",
                "Roberto", "Celso", "Jacinto", "João" };

        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe o nome para ser pesquisado: ");
        String nome_pesquisa = scanner.nextLine();

        // 1 - ordenar a lista

        for (int i = 0; i < nomes.length - 1; i++) {
            for (int j = i + 1; j < nomes.length; j++) {
                if (nomes[i].compareToIgnoreCase(nomes[j]) > 0) {
                    String tempNome = nomes[i];
                    nomes[i] = nomes[j];
                    nomes[j] = tempNome;
                }
            }
        }

        System.out.println(Arrays.toString(nomes));

        // 2 - inicializar as variavéis de controle
        int indice_inicial = 0;
        int indice_final = nomes.length - 1;
        int achou = -1;
        // 3 - percorrer a lista

        while (indice_inicial <= indice_final) {
            int indice_meio = (int) (indice_inicial + indice_final) / 2;
            int comparacao = nomes[indice_meio]
                    .compareToIgnoreCase(nome_pesquisa);
            // Se for menor
            if (comparacao < 0) {
                indice_inicial = indice_meio + 1;
            } else if (comparacao > 0) { // Se for maior
                indice_final = indice_meio - 1;
            } else {
                achou = indice_meio;
                break;
            }
        }

        if (achou >= 0) {
            System.out.println("Nome " + nome_pesquisa
                    + " encontrado no indice " + achou);
        } else {
            System.out.println("Nome " + nome_pesquisa
                    + " não encontrado");
        }

    }
}
