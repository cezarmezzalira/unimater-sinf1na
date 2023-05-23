import java.util.Arrays;
import java.util.Scanner;

public class Exemplo03 {
    public static void main(String[] args) {
        int[] numeros = { 20, 12, 44, 90, 77, 1, 23, 100, 81, 65, 33, 9 };

        Scanner scanner = new Scanner(System.in);
        // 1 - Pedir o número para comparação
        System.out.println("Informe o número a ser buscado: ");
        int numero_busca = scanner.nextInt();

        // 2 - ordenação
        for (int i = 0; i < numeros.length - 1; i++) {
            for (int j = i + 1; j < numeros.length; j++) {
                if (numeros[i] > numeros[j]) {
                    int tempNumero = numeros[i];
                    numeros[i] = numeros[j];
                    numeros[j] = tempNumero;
                }
            }
        }

        System.out.println(Arrays.toString(numeros));

        // 3 - variáveis de controle

        int indice_inicial = 0;
        int indice_final = numeros.length;
        int achou = -1;

        while (indice_inicial <= indice_final) {
            // calcula o indice do meio
            int indice_meio = (int) (indice_inicial + indice_final) / 2;
            System.out.println("Item Meio: " + numeros[indice_meio]);
            for (int i = indice_inicial; i < indice_final; i++) {
                System.out.print(numeros[i] + ", ");
            }
            System.out.println("");
            // se o valor do indice do meio for menor que numero buscado
            if (numeros[indice_meio] < numero_busca) {
                indice_inicial = indice_meio + 1;
            } else if (numeros[indice_meio] > numero_busca) {
                indice_final = indice_meio - 1;
            } else {
                achou = indice_meio;
                break;
            }

        }

        if (achou >= 0) {
            System.out.println("Número " + numero_busca
                    + " encontrado no indice " + achou);
        } else {
            System.out.println("Número " + numero_busca
                    + " não encontrado");
        }
        scanner.close();
    }
}
