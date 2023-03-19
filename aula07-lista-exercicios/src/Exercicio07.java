import java.util.Scanner;

public class Exercicio07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Cálculo do Imposto de Renda Familiar");
        System.out.println("Informe o salário bruto familiar:");
        double salario = scanner.nextDouble();

        // faixa 1 (isento) -> até 1903,98
        double total = 0;
        double faixa1 = 0;
        double faixa2 = 0;
        double faixa3 = 0;
        double faixa4 = 0;
        double faixa5 = 0;
        // faixa 2 (7,5%) -> de 1903,98 a 2826,65 -> máx 142,80
        if (salario >= 1903.98) {
            faixa2 = (((salario - 1903.98) * 7.5) / 100);
            if (faixa2 > 142.80) {
                faixa2 = 142.80;
            }
            total = total + faixa2;
            System.out.println("Faixa 2 " + faixa2);
        }
        // faixa 3 (15%) -> de 2826,66 a 3751,05 -> máx 354,80
        if (salario >= 2826.66) {
            faixa3 = (((salario - 2826.66) * 15) / 100);
            if (faixa3 > 354.80) {
                faixa3 = 354.80;
            }
            total = total + faixa3;
            System.out.println("Faixa 3 " + faixa3);
        }
        // faixa 4 (22,5%) -> de 3751,06 a 4664,68 -> máx 636,13
        if (salario >= 3751.06) {
            faixa4 = (((salario - 3751.06) * 22.5) / 100);
            if (faixa4 > 636.13) {
                faixa4 = 636.13;
            }
            total = total + faixa4;
            System.out.println("Faixa 4 " + faixa4);
        }
        // faixa 5 (27,5%) -> a partir de 4664,68 -> máx 869,36
        if (salario > 4664.68) {
            faixa5 = (((salario - 4664.68) * 27.5) / 100);
            if (faixa5 > 869.36) {
                faixa5 = 869.36;
            }
            System.out.println("Faixa 5 " + faixa5);
            total = total + faixa5;
        }

        System.out.println("O total do seu imposto de renda é: " + total);
    }
}
