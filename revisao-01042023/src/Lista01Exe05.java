import java.util.Scanner;

public class Lista01Exe05 {
    public static void main(String[] args) {
        final double percentual_imposto = 20.0;
        final double percentual_comissao = 10.0;
        final double percentual_custo = 50.0;

        Scanner scanner = new Scanner(System.in);

        double valor_venda;

        System.out.print("Informe o valor de venda: ");
        valor_venda = scanner.nextDouble();

        System.out.printf("\nO valor de venda é R$ %.2f", valor_venda);

        double valor_impostos = ((valor_venda * percentual_imposto) / 100);

        System.out.printf("\nO valor do imposto é R$ %.2f", valor_impostos);

        double valor_comissao = ((valor_venda * percentual_comissao) / 100);

        System.out.printf("\nO valor da comissão é de R$ %.2f", valor_comissao);

        double valor_custo = ((valor_venda * percentual_custo) / 100);

        System.out.printf("\nO valor de custo é de R$ %.2f", valor_custo);

        double valor_lucro = valor_venda - (valor_custo + valor_comissao + valor_impostos);

        System.out.printf("\nO valor de lucro é de R$ %.2f", valor_lucro);

        scanner.close();
    }
}
