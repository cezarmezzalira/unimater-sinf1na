import java.util.Locale;
import java.util.Scanner;

public class Exercicio05 {
        public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);
                // imposto = 20% fixo
                final double imposto = 20;
                // pagamento a vista = 10% de desconto
                // pagamento a prazo = 5% de desconto
                // comissão do vendedor = 10%
                // custo de producao = 50% do valor de venda

                // ler o valor de venda
                System.out.println("Informe o valor de venda do produto (Ex: 100,20)");
                double valor_venda = scanner.nextDouble();
                // imprimir os valores da operacao:
                // Valor de venda
                Locale localeBR = new Locale("pt", "BR");

                System.err.println("O valor de venda do produto é: R$ " +
                                String.format(localeBR, "%,.2f", valor_venda));
                // Custo do produto
                double valor_custo = (valor_venda * 50) / 100;
                System.out.println("O custo de producao do produto é de R$ " +
                                String.format(localeBR, "%,.2f", valor_custo));
                // Valor de desconto não será impresso
                // Valor dos impostos
                double valor_imposto = (valor_venda * imposto) / 100;
                System.out.println("O imposto sobre o produto é de R$ " +
                                String.format(localeBR, "%,.2f", valor_imposto));
                // Valor da comissão
                double valor_comissao = (valor_venda * 10) / 100;
                System.out.println("O comissão sobre o produto é de R$ " +
                                String.format(localeBR, "%,.2f", valor_comissao));
                // Valor do Lucro = valor_venda - (custo + impostos + comissão)
                double valor_lucro = valor_venda - (valor_custo + valor_imposto + valor_comissao);
                System.out.println("O lucro do produto é de R$ " +
                                String.format(localeBR, "%,.2f", valor_lucro));

                scanner.close();
        }
}
