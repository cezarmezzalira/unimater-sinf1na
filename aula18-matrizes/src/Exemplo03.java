import java.util.Arrays;
import java.util.Scanner;

public class Exemplo03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        final int TOTAL_ALUNOS = 10;
        double medias[] = new double[TOTAL_ALUNOS];

        /**
         * double media1 = 0;
         * double media2 = 0;
         * double media3 = 0;
         * double media4 = 0;
         * double media5 = 0;
         * double media6 = 0;
         * double media7 = 0;
         * double media8 = 0;
         * 
         * for (int i = 0; i < 8; i++) {
         * System.out.println("Informe a média: ");
         * if (i == 0) {
         * media1 = scanner.nextDouble();
         * } else if (i == 1) {
         * media2 = scanner.nextDouble();
         * } else if (i == 2) {
         * media3 = scanner.nextDouble();
         * } else if (i == 3) {
         * media4 = scanner.nextDouble();
         * } else if (i == 4) {
         * media5 = scanner.nextDouble();
         * } else if (i == 5) {
         * media6 = scanner.nextDouble();
         * } else if (i == 6) {
         * media7 = scanner.nextDouble();
         * } else if (i == 7) {
         * media8 = scanner.nextDouble();
         * }
         * }
         */
        int index = 0;
        do {
            System.out.printf("Informe a média %d: ", (index + 1));
            medias[index] = scanner.nextDouble();
            index++;
        } while (index < TOTAL_ALUNOS);
        System.out.println(Arrays.toString(medias));

        double soma_medias = 0;
        for (int i = 0; i < TOTAL_ALUNOS; i++) {
            soma_medias += medias[i];
            // soma_medias = soma_medias + medias[i];
        }

        double media_alunos = soma_medias / TOTAL_ALUNOS;
        System.out.printf("\nA média dos %d alunos é: %.2f",
                TOTAL_ALUNOS, media_alunos);
        scanner.close();
    }
}
