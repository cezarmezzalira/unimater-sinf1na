import java.util.Scanner;

public class Exercicio01_ICM {
    public static void main(String[] args) {
        // Formula do IMC
        // IMC = peso / altura²
        // IMC = peso / (altura * altura)

        Scanner meuScanner = new Scanner(System.in);
        System.out.println("Informe seu peso");
        float peso = meuScanner.nextFloat();

        System.out.println("Informe a sua altura");
        float altura = meuScanner.nextFloat();

        float imc = peso / (altura * altura);
        System.out.println("Seu IMC é de " + imc);
        meuScanner.close();
    }
}
