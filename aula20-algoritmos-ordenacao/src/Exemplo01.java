import java.util.Arrays;

public class Exemplo01 {
    public static void main(String[] args) {
        int[] lista = { 9, 4, 7, 2, 3, 5, 1, 8 };
        // 3,5,7,8,9
        for (int i = 0; i < lista.length; i++) {
            for (int j = i + 1; j < lista.length; j++) {
                System.out.println(Arrays.toString(lista));
                if (lista[i] > lista[j]) {
                    int temp = lista[i];
                    lista[i] = lista[j];
                    lista[j] = temp;
                }
            }
        }
    }
}
