import java.util.Scanner;

public class Exercicio06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe o valor em reais para calcular as notas:");
        int valor = scanner.nextInt();

        int notas_100 = valor / 100;
        int resto = valor - (notas_100 * 100);

        int notas_50 = resto / 50;
        resto = resto - (notas_50 * 50);

        int notas_20 = resto / 20;
        resto = resto - (notas_20 * 20);

        int notas_10 = resto / 10;
        resto = resto - (notas_10 * 10);

        int notas_5 = resto / 5;
        resto = resto - (notas_5 * 5);

        int notas_2 = resto / 2;
        resto = resto - (notas_2 * 2);

        int notas_1 = resto / 1;
        resto = resto - (notas_1 * 1);

        System.out.println("Você precisará de " + notas_100 + " notas de R$ 100");
        System.out.println("Você precisará de " + notas_50 + " notas de R$ 50");
        System.out.println("Você precisará de " + notas_20 + " notas de R$ 20");
        System.out.println("Você precisará de " + notas_10 + " notas de R$ 10");
        System.out.println("Você precisará de " + notas_5 + " notas de R$ 5");
        System.out.println("Você precisará de " + notas_2 + " notas de R$ 2");
        System.out.println("Você precisará de " + notas_1 + " notas de R$ 1");

        scanner.close();
    }
}
