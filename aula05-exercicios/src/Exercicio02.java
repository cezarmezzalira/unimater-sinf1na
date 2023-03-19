public class Exercicio02 {
    public static void main(String[] args) {
        /*
         * 2 - Declare duas variáveis ​​do tipo double chamadas
         * num1 e num2 e inicialize-as
         * com quaisquer valores decimais.
         * Em seguida, calcule a soma, a diferença,
         * o produto e o quociente de num1 e num2
         * e imprima os resultados.
         */

        double num1 = 5;
        double num2 = 3;

        // soma
        double soma = num1 + num2;
        System.out.println("O valor da soma de "
                + num1 + " + " + num2 + " é igual a " + soma);

        // diferenca
        double diferenca = num1 - num2;
        System.out.println("O valor da diferenca de "
                + num1 + " - " + num2 + " é igual a " + diferenca);

        // produto
        double produto = num1 * num2;
        System.out.println("O valor do produto de "
                + num1 + " . " + num2 + " é igual a " + produto);

        // quociente
        double quociente = num1 / num2;
        System.out.println("O valor do quociente de "
                + num1 + " / " + num2 + " é igual a " + quociente);
    }
}
