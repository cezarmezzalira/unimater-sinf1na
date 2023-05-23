import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        // Elaborar um programa que efetue a leitura de dez
        // nomes de pessoas em uma matriz A do tipo vetor e
        // apresentá-los em seguida

        Scanner scanner = new Scanner(System.in);

        String nomes[] = new String[10];

        int index = 0;

        while (index < nomes.length) {
            System.out.println("Informe o seu nome: ");
            nomes[index] = scanner.nextLine();
            index++;
        }

        for (int i = 0; i < nomes.length; i++) {
            System.out.printf("\nO nome na posição %d é: %s ",
                    (i + 1), nomes[i]);
        }
        System.out.println("");
        scanner.close();
    }
}
