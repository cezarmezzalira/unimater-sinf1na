import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Programa para o cálculo da área de um retângulo");

        System.out.println("Informe a altura (h)");
        double altura = scanner.nextDouble();

        System.out.println("Informe a largura (b)");
        double largura = scanner.nextDouble();

        double area = largura * altura;

        System.out.printf("A área do retangulo de altura %.2f e largura %.2f é igual a: %.2f", altura, largura, area);

        scanner.close();

    }
}
