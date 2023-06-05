import java.security.SecureRandom;
import java.util.Arrays;

public class Exercicio02 {
    public static void main(String[] args) {
        /*
         * Exercício 02 - Gerar e escrever uma
         * matriz bidimensional de tamanho 9x7,
         * com números aleatórios entre zero e cem.
         * Ao final, imprimir a média geral dos números da tabela.
         */

        int[][] aleatorios = new int[9][7];

        SecureRandom random = new SecureRandom();

        int contador = 0;
        int soma = 0;

        for (int i = 0; i < aleatorios.length; i++) {// linhas
            for (int j = 0; j < aleatorios[0].length; j++) { // colunas
                aleatorios[i][j] = random.nextInt(0, 101);
                contador++;
                soma += aleatorios[i][j];
            }
            System.out.println(Arrays.toString(aleatorios[i]));
        }

        System.out.println(contador);
        System.out.println(soma);

        double media = soma / contador;

        System.out.printf("A média da soma dos números na matriz é %.2f", media);

    }
}
