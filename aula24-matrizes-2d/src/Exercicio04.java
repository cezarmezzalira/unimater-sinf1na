import java.security.SecureRandom;
import java.util.Arrays;

public class Exercicio04 {
    public static void main(String[] args) {
        /*
         * Todos os anos, as prefeituras de todo o país fazem a cobrança do IPTU,
         * imposto predial e territorial urbano, o qual é a principal fonte de receita
         * das prefeituras para manter os serviços municipais funcionando.
         * Dessa forma,
         * a prefeitura precisa de um software que seja capaz de calcular as parcelas de
         * IPTU fazendo o rateio e a correta divisão dos valores em 5 parcelas, para os
         * contribuintes que desejam pagar parcelados seu imposto.
         * Neste exercício, crie
         * um vetor com 50 posições, com valores reais gerados randomicamente entre 900
         * e 10000, que servirá como base para gerar os valores das parcelas em uma
         * matriz de 50 linhas e 5 colunas, sendo as colunas o valor de cada parcela.
         * Utilizar o cálculo de rateio de parcelas com percentual igual, ou seja cada
         * parcela vai corresponder a 20%. Validar se a soma de todas as parcelas fecha
         * com valor total e somar a diferença na última parcela.
         */

        double[] valores_iniciais = new double[50];

        SecureRandom random = new SecureRandom();

        for (int i = 0; i < valores_iniciais.length; i++) {
            valores_iniciais[i] = random.nextDouble(900, 10001);
        }

        System.out.println(Arrays.toString(valores_iniciais));

        double[][] parcelas = new double[50][5];
        double percentual_rateio = 100 / 5;
        for (int i = 0; i < parcelas.length; i++) {
            double total = valores_iniciais[i];
            double parcela = 0;
            double total_parcelas = 0;
            for (int j = 0; j < parcelas[0].length; j++) {
                parcela = total * (percentual_rateio / 100);

                total_parcelas += parcela;
                if (j == 4) {
                    double diferenca = total - total_parcelas;
                    parcela += diferenca;
                }

                parcelas[i][j] = parcela;
            }
            System.out.println(Arrays.toString(parcelas[i]));
        }

    }
}
