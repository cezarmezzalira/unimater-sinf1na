import java.util.Scanner;

public class Aula03_Exemplo01 {
  public static void main(String[] args) {
    // Criando um objeto do tipo Scanner
    Scanner meuScanner = new Scanner(System.in);

    System.out.println("Informe seu nome:");

    // Usando o Scanner para obter dados de entrada do tipo texto
    String meuNome = meuScanner.nextLine();
    System.out.println("Olá " + meuNome);
    meuScanner.close();

    // Imprimindo informações de formas diferentes
    // Imprimindo um texto sem quebrar linha
    System.out.print("Olá! Eu não quebro linha");

    // Imprimindo um texto que quebra linha usando println
    System.out.println("Olá! Após imprimir essa linha, será quebrada uma linha.");
    // Imprimindo um texto que quebra linha usando a sequencia de escape \n
    System.out.print("Olá! Após imprimir essa linha, também será quebrada uma linha.\n");
    
    // Imprimindo um texto, mas substituindo o inicio por outro texto
    System.out.println("Olá!! Você não verá Olá hoje\rHello");

    // Imprimindo um texto com barras
    System.out.println("Olá \\Fulano\\");

    // Imprimindo um texto com aspas
    System.out.println("Olá \"Fulano\"");

    // Imprimindo com printf para formatar a saída
    System.out.printf("Olá %s! Que bom ter você por aqui!", meuNome);
  }
}
