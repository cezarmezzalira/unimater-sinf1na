Faça um programa que peça ao usuário para digitar um número e imprima a tabuada desse número até 10.

```java

import java.util.Scanner;
class Tabuada {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Digite um número: ");
    int num = scanner.nextInt();
    int i = 1;
    do {
      System.out.println(num + " x " + i + " = " + (num * i));
      i++;
    } while(i <= 10);
  }
}
```

Faça um programa que calcule a média de um conjunto de números informados pelo usuário. O programa deve continuar pedindo números até que o usuário informe um valor negativo.

```java

import java.util.Scanner;

class MediaNumeros {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int num = 0;
    int soma = 0;
    int quantidade = 0;
    do {
      System.out.print("Digite um número (negativo para sair): ");
      num = scanner.nextInt();
      if(num >= 0){
        soma += num;
        quantidade++;
      }
    } while(num >= 0);
    double media = (double) soma / quantidade;
    System.out.println("A média dos números digitados é: " + media);
  }
}



```

Faça um programa que peça ao usuário para digitar uma palavra e verifique se essa palavra é um palíndromo (ou seja, se pode ser lida da mesma forma da esquerda para a direita e da direita para a esquerda).

```java
import java.util.Scanner;

class Palindromo {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Digite uma palavra: ");
    String palavra = scanner.next();
    int i = 0;
    int j = palavra.length() - 1;
    boolean palindromo = true;
    do {
      if(palavra.charAt(i) != palavra.charAt(j)){
        palindromo = false;
        break;
      }
      i++;
      j--;
    } while(i <= j);
    if(palindromo){
      System.out.println("A palavra " + palavra + " é um palíndromo.");
    } else {
      System.out.println("A palavra " + palavra + " não é um palíndromo.");
    }
  }
}
```

Faça um programa que simule um jogo de adivinhação. O programa deve gerar um número aleatório entre 1 e 100, e pedir para o usuário tentar adivinhar o número. A cada tentativa do usuário, o programa deve informar se o número a ser adivinhado é maior ou menor do que o número informado pelo usuário. O jogo termina quando o usuário acerta o número.

```java

import java.util.Random;
import java.util.Scanner;

Scanner scanner = new Scanner(System.in);
Random random = new Random();
int numeroAleatorio = random.nextInt(100) + 1;
int tentativa = 0;
do {
  System.out.print("Tente adivinhar o número (1 a 100): ");
  tentativa = scanner.nextInt();
  if(tentativa > numeroAleatorio){
    System.out.println("O número a ser adivinhado é menor.");
  } else if(tentativa < numeroAleatorio){
    System.out.println("O número a ser adivinhado é maior.");
  }
} while(tentativa != numeroAleatorio);
System.out.println("Parabéns, você acertou o número!");
```
