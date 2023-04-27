public class Exercicio10 {
    public static void main(String[] args) {
        int i = 0;
        int total = 0;
        boolean controle = false;

        while (!controle) {
            // Só soma os impares
            if (i % 2 > 0) {
                total += i;
            }
            i++;
            if (i >= 12) {
                controle = true;
            }
        }
        System.out.println(total);
    }
}
