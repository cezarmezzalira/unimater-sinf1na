import java.util.Scanner;

public class Exemplo09 {
    public static void main(String[] args) {
        Scanner scannerDoZe = new Scanner(System.in);

        int i = 1;

        while (i <= 5) {
            if (i > 4) {
                System.out.println("Vai parar");
                break;
            } else {
                System.out.println("Vai continuar");
            }

            System.out.println("Executando pela " + i + "x");

            System.out.println("Informe um valor");
            int valor = scannerDoZe.nextInt();

            int resultado = valor * 3;
            System.out.println("O resultado é " + resultado);

            i = i + 1;
        }

        scannerDoZe.close();
    }
}
