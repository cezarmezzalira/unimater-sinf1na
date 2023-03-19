import java.util.Scanner;

public class Exercicio07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Cálculo do Imposto de Renda Familiar");
        System.out.println("Informe o salário bruto familiar:");
        double salario = scanner.nextDouble();

        // faixa 1 (isento) -> até 1903,98
        double total = 0;

        if (salario <= 2826.65) { // faixa 2 (7,5%) -> de 1903,98 a 2826,65 -> máx 142,80
            total = ((salario * 7.5) / 100) - 142.80;
        } else if (salario <= 3751.05) { // faixa 3 (15%) -> de 2826,66 a 3751,05 -> máx 354,80
            total = ((salario * 15) / 100) - 354.80;
        } else if (salario <= 4664.68) { // faixa 4 (22,5%) -> de 3751,06 a 4664,68 -> máx 636,13
            total = ((salario * 22.5) / 100) - 636.13;
        } else { // faixa 5 (27,5%) -> a partir de 4664,68 -> máx 869,36
            total = ((salario * 27.5) / 100) - 869.36;
        }

        System.out.println("O total do seu imposto de renda é: " + total);
    }
}
