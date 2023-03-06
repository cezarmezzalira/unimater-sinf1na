public class Exercicio04 {
    public static void main(String[] args) {
        /*
         * 4 - Declare duas variáveis ​​do tipo int
         * chamadas largura e altura
         * e inicialize-as com quaisquer valores.
         * Em seguida, calcule a área e o perímetro de um retângulo
         * com largura e altura e imprima os resultados.
         */
        int largura = 30;
        int altura = 5;

        int area = largura * altura;

        int perimetro = largura + largura + altura + altura;

        System.out.println("A área do retangulo de largura "
                + largura + " * " + altura + " é igual a:" + area);

        System.out.printf("A área do retangulo de largura %d * %d é igual a: %d\n", largura, altura, area);

        System.out.println("O perimêtro do retangulo de largura "
                + largura + " e " + altura + " é igual a:" + perimetro);

    }
}
