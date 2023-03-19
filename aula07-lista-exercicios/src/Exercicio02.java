public class Exercicio02 {
    public static void main(String[] args) {
        // letra A
        double u = (15 / 2) - ((15 * Math.sqrt(3)) / 2);
        // letra B
        double x = (Math.pow((1 / 2), 2) * (1.0 / 3.0)) +
                ((1.0 / 4.0) / (1.0 / 3.0));
        // letra c
        double z = Math.sqrt(Math.pow(1, 2) + Math.sqrt(Math.pow(3, 2)));

        // letra d
        double y = ((2 * Math.sqrt(5)) + Math.sqrt(40) +
                (2 * Math.sqrt(8)) + 8) / -3;

        System.out.println("O resultado da letra A é: " + u);
        System.out.println("O resultado da letra B é: " + x);
        System.out.println("O resultado da letra C é: " + z);
        System.out.println("O resultado da letra D é: " + y);
    }
}
