import java.util.Scanner;

public class Exercicio15 {
    public static void main(String[] args) {
        /*
         * Escreva um programa que calcule a
         * média dos números digitados pelo usuário,
         * se eles forem pares. O programa deve terminar
         * a leitura se o usuário digitar zero.
         */

        Scanner scanner = new Scanner(System.in);

        double valor = 1;
        int contadorPares = 0;
        double somaPares = 0;
        do {
            System.out.print("Informe um valor: ");
            valor = scanner.nextDouble();

            double resto = valor % 2;
            if (resto == 0 && valor > 0) {
                contadorPares++;
                somaPares += valor;
                // somaPares = somaPares + valor;
            }
        } while (valor != 0);
        double media = somaPares / contadorPares;

        System.out.printf("A média dos %d valores pares é %.2f\n", contadorPares, media);
    }

}
