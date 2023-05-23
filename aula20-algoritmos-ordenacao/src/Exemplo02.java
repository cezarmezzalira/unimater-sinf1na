import java.util.Arrays;

public class Exemplo02 {
    public static void main(String[] args) {
        String[] nomes = { "William", "Milena", "Eduardo",
                "Vinicius", "Victor", "Marcelo",
                "Valentina", "Cezar", "Vitor", "Gustavo" };
        System.out.println(Arrays.toString(nomes));

        for (int i = 0; i < nomes.length - 1; i++) {
            System.out.println("Iteração >>>>>>>>>>>>>" + (i + 1));
            for (int j = i + 1; j < nomes.length; j++) {

                if (nomes[i].compareToIgnoreCase(nomes[j]) > 0) {
                    String tempNome = nomes[i];
                    nomes[i] = nomes[j];
                    nomes[j] = tempNome;
                }
                System.out.println(Arrays.toString(nomes));

            }
        }

        for (String nome : nomes) {
            System.out.println(nome);
        }
    }
}
