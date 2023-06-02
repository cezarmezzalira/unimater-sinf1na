import java.util.Arrays;
import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Array bidimensional - 10 linhas - 5 colunas
        String[][] matriz_2d = new String[5][5];
        // Percorrro a matriz no sentido da linha (vertical)
        for (int i = 0; i < matriz_2d.length; i++) {

            System.out.printf("Cadastro usuário %d ", i + 1);
            System.out.println("");
            // Ler atribuir para coluna nome
            System.out.print("Informe o nome do usuário: ");
            String nome = scanner.nextLine();
            matriz_2d[i][0] = nome;

            // Ler atribuir para coluna endereço
            System.out.print("Informe o endereço do usuário: ");
            String endereco = scanner.nextLine();
            matriz_2d[i][1] = endereco;

            // Ler atribuir para coluna código postal
            System.out.print("Informe o código postal do usuário: ");
            String cep = scanner.nextLine();
            matriz_2d[i][2] = cep;

            // Ler atribuir para coluna bairro
            System.out.print("Informe o bairro do usuário: ");
            String bairro = scanner.nextLine();
            matriz_2d[i][3] = bairro;

            // Ler atribuir para coluna telefone
            System.out.print("Informe o telefone do usuário: ");
            String telefone = scanner.nextLine();
            matriz_2d[i][4] = telefone;

            System.out.println(Arrays.toString(matriz_2d[i]));
        }
        // Ordenar os dados da matriz a partir da coluna nome (índice 0)
        // Mostrar a matriz ordenada (Arrays.deepToString(matriz_2d))
        System.out.println(Arrays.deepToString(matriz_2d));
        /*
         * 
         * 
         * for (int i = 0; i < nomes.length - 1; i++) {
         * for (int j = i + 1; j < nomes.length; j++) {
         * if (nomes[i].compareToIgnoreCase(nomes[j]) > 0) {
         * String tempNome = nomes[i];
         * nomes[i] = nomes[j];
         * nomes[j] = tempNome;
         * }
         * }
         * }
         */

        for (int i = 0; i < matriz_2d.length - 1; i++) {
            for (int j = i + 1; j < matriz_2d.length; j++) {
                // SE O NOME NA LINHA I VIER ANTES DO NOME NA LINHA J
                if (matriz_2d[i][0].compareToIgnoreCase(matriz_2d[j][0]) > 0) {
                    String temp = matriz_2d[i][0];
                    matriz_2d[i][0] = matriz_2d[j][0];
                    matriz_2d[j][0] = temp;
                }
            }
        }
        System.out.println();

        System.out.println(Arrays.deepToString(matriz_2d));

        scanner.close();
    }
}
