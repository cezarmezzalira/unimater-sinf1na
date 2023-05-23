import java.util.Arrays;

public class Exemplo04 {
    public static void main(String[] args) {
        int[] lista_int = { 1, 2, 3, 5, 6 };

        String[] lista_string = { "Cezar", "Gubert",
                "Fransley", "João Pedro" };

        double[] lista_double = { 0.1, 1.3, 5.4 };

        System.out.println(Arrays.toString(lista_int));
        for (int i = 0; i < lista_int.length; i++) {
            System.out.println("Indice ou Index: " + i
                    + " - Valor: " + lista_int[i]);
        }

    }
}