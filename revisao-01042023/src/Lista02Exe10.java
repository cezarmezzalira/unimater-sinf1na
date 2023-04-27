import java.util.Scanner;

public class Lista02Exe10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Nome do comodo
        // largura
        // comprimento
        // Ler enquanto até o usuário informar não e mostrar a área total

        String continuar = "";
        double area_total = 0;
        do {
            System.out.print("Informe o nome do cômodo: ");
            String comodo = scanner.next();

            System.out.print("\nInforme a largura do cômodo: ");
            double largura = scanner.nextDouble();

            System.out.print("\nInforme o comprimento do cômodo: ");
            double comprimento = scanner.nextDouble();

            double area_comodo = largura * comprimento;

            area_total = area_total + area_comodo;

            System.out.printf("\nA área do cômodo %s é de %.2f m²", comodo, area_comodo);

            System.out.print("\nDeseja continuar calculando a área da residência? (SIM ou NÃO)");
            continuar = scanner.next();
        } while (continuar.equals("SIM"));

        System.out.printf("\nA área da residência é de %.2f m²", area_total);

        scanner.close();

    }
}
