import java.util.Scanner;

public class Exemplo04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe um número");

        int numero = scanner.nextInt();

        if ((numero >= 20) && (numero <= 90)) {
            System.out.println("O número está na faixa de 20 a 90");
        } else {
            System.out.println("O número está fora da faixa de 20 a 90");
        }
    }
}
