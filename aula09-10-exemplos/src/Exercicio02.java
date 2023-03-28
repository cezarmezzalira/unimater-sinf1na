import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int contador = 0;
        double somatoria = 0;
        double numero = 0;
        boolean continua = false;
        do {
            System.out.println("Informe um número: ");
            numero = scanner.nextDouble();
            continua = numero >= 0;
            if (continua) {
                contador = contador + 1; // == contador++;
                somatoria = somatoria + numero;
            }
        } while (continua);

        // continua = true;
        // while (continua) {
        // System.out.println("Informe um número: ");
        // numero = scanner.nextDouble();
        // continua = numero >= 0;
        // if (continua) {
        // contador = contador + 1; // == contador++;
        // somatoria = somatoria + numero;
        // }
        // }

        double media = somatoria / contador;

        System.out.printf("A média %2f e %d é igual a: %2f",
                somatoria, contador, media);

        scanner.close();
    }
}
