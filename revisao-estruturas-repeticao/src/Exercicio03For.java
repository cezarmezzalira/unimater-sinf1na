public class Exercicio03For {
    public static void main(String[] args) {
        // em um loop de 0 a 100, retorne a soma dos números pares
        // até 50 e dos numeros impares até 100
        int soma_pares = 0;
        int soma_impares = 0;

        for (int i = 100; i > 0; i--) {
            if (i % 2 == 0 && i < 50) {
                soma_pares += i;
            } else if (i > 50) {
                soma_impares += i;
            }
            System.out.printf("\n%d", i);
        }
        System.out.printf("\nTotal pares: %d", soma_pares);
        System.out.printf("\nTotal impares: %d", soma_impares);

    }
}
