import java.util.Scanner;

public class Exemplo06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe o sexo da pessoa (M ou F)");
        String sexo = scanner.nextLine();

        if (!(sexo.equals("M") || sexo.equals("F"))) {
            System.out.println("Sexo inválido");
        } else {
            System.out.println("Sexo válido");
        }

        // boolean isValid = !(sexo.equals("M") || sexo.equals("F"));

        // if (isValid) {
        // System.out.println("Sexo inválido");
        // } else {
        // System.out.println("Sexo válido");
        // }
    }
}
