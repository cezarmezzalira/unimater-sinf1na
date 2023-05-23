import java.util.Scanner;

public class Exemplo02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double[] matriz_irpf = new double[12];
        double[] matriz_inss = new double[12];

        for (int mes = 0; mes < 12; mes++) {
            String nomeMes = "";
            switch (mes) {
                case 0:
                    nomeMes = "Janeiro";
                    break;
                case 1:
                    nomeMes = "Fevereiro";
                    break;
                case 2:
                    nomeMes = "Março";
                    break;
                case 3:
                    nomeMes = "Abril";
                    break;
                case 4:
                    nomeMes = "Maio";
                    break;
                case 5:
                    nomeMes = "Junho";
                    break;
                case 6:
                    nomeMes = "Julho";
                    break;
                default:
                    nomeMes = "Mes qualquer";
                    break;
            }

            System.out.printf("Informe o salário do mês de %s: ", nomeMes);
            double valorSalario = scanner.nextDouble();

            double valorIRPF = valorSalario * 0.05;
            double valorINSS = valorSalario * 0.01;

            matriz_inss[mes] = valorINSS;
            matriz_irpf[mes] = valorIRPF;
        }

        double totalAnualIRPF = 0;
        double totalAnualINSS = 0;

        for (int i = 0; i < 12; i++) {
            totalAnualINSS += matriz_inss[i];
            System.out.printf("\nO valor total do INSS do mês %d é R$ %.2f", i + 1, matriz_inss[i]);
            totalAnualIRPF += matriz_irpf[i];
            System.out.printf("\nO valor total do IRPF do mês %d é R$ %.2f", i + 1, matriz_irpf[i]);

        }

        System.out.printf("\nO total do IRPF anual é de %.2f", totalAnualIRPF);
        System.out.printf("\nO total do INSS anual é de %.2f\n", totalAnualINSS);

    }
}
