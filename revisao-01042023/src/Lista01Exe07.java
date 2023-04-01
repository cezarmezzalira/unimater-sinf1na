import java.util.Scanner;

public class Lista01Exe07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe o salário bruto da sua família: ");
        double salario_bruto = scanner.nextDouble();

        System.out.print("\nInforme a quantidade de indivíduos da famíla: ");
        int individuos = scanner.nextInt();

        double media_salarial = salario_bruto / individuos;

        double total = 0;

        // se media salarial for maior ou igual a 1903.98
        // E a media salarial for menor ou igual 2826.65
        // vai calcular o imposto de 7,5%, deduzindo R$ 142,80
        if (media_salarial >= 1903.98 &&
                media_salarial <= 2826.65) {
            total = ((media_salarial * 7.5) / 100) - 142.80;
        } else if (media_salarial >= 2826.66 &&
                media_salarial <= 3751.05) {
            total = ((media_salarial * 15) / 100) - 354.80;
        } else if (media_salarial >= 3751.06 &&
                media_salarial <= 4664.68) {
            total = ((media_salarial * 22.5) / 100) - 636.13;
        } else if (media_salarial > 4664.68) {
            total = ((media_salarial * 27.5) / 100) - 869.36;
        }

        System.out.printf("A média salarial da família é R$ %.2f", media_salarial);
        System.out
                .printf("\nO valor de imposto de renda de sua família com %d indivíduos é igual a: R$ %.2f \n",
                        individuos, total);

        scanner.close();
    }
}
