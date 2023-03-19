import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        // Entrada dos dados
        Scanner scanner = new Scanner(System.in);

        boolean vaga1 = false;
        boolean vaga2 = false;
        boolean vaga3 = false;
        boolean vaga4 = false;
        boolean vaga5 = false;

        // Tentativa 1
        System.out.println("Informe o número da vaga em que deseja estacionar (de 1 a 5)");
        int vaga = scanner.nextInt();

        // Processamento
        if (vaga == 1 && vaga1 == false) {
            vaga1 = true;
            System.out.println("Estacionado com sucesso");
        } else if (vaga == 2 && vaga2 == false) {
            vaga2 = true;
            System.out.println("Estacionado com sucesso");
        } else if (vaga == 3 && vaga3 == false) {
            vaga3 = true;
            System.out.println("Estacionado com sucesso");
        } else if (vaga == 4 && vaga4 == false) {
            vaga4 = true;
            System.out.println("Estacionado com sucesso");
        } else if (vaga == 5 && vaga5 == false) {
            vaga5 = true;
            System.out.println("Estacionado com sucesso");
        } else if (vaga < 1 || vaga > 5) {
            System.out.println("Vaga inválida");
        } else {
            System.out.println("Vaga ocupada");
        }

        // Tentativa 2
        System.out.println("Informe o número da vaga em que deseja estacionar (de 1 a 5)");
        vaga = scanner.nextInt();

        if (vaga == 1 && vaga1 == false) {
            vaga1 = true;
            System.out.println("Estacionado com sucesso");
        } else if (vaga == 2 && vaga2 == false) {
            vaga2 = true;
            System.out.println("Estacionado com sucesso");
        } else if (vaga == 3 && vaga3 == false) {
            vaga3 = true;
            System.out.println("Estacionado com sucesso");
        } else if (vaga == 4 && vaga4 == false) {
            vaga4 = true;
            System.out.println("Estacionado com sucesso");
        } else if (vaga == 5 && vaga5 == false) {
            vaga5 = true;
            System.out.println("Estacionado com sucesso");
        } else if (vaga < 1 || vaga > 5) {
            System.out.println("Vaga inválida");
        } else {
            System.out.println("Vaga ocupada");
        }

        // Tentativa 3
        System.out.println("Informe o número da vaga em que deseja estacionar (de 1 a 5)");
        vaga = scanner.nextInt();

        if (vaga == 1 && vaga1 == false) {
            vaga1 = true;
            System.out.println("Estacionado com sucesso");
        } else if (vaga == 2 && vaga2 == false) {
            vaga2 = true;
            System.out.println("Estacionado com sucesso");
        } else if (vaga == 3 && vaga3 == false) {
            vaga3 = true;
            System.out.println("Estacionado com sucesso");
        } else if (vaga == 4 && vaga4 == false) {
            vaga4 = true;
            System.out.println("Estacionado com sucesso");
        } else if (vaga == 5 && vaga5 == false) {
            vaga5 = true;
            System.out.println("Estacionado com sucesso");
        } else if (vaga < 1 || vaga > 5) {
            System.out.println("Vaga inválida");
        } else {
            System.out.println("Vaga ocupada");
        }

        // Tentativa 4
        System.out.println("Informe o número da vaga em que deseja estacionar (de 1 a 5)");
        vaga = scanner.nextInt();

        if (vaga == 1 && vaga1 == false) {
            vaga1 = true;
            System.out.println("Estacionado com sucesso");
        } else if (vaga == 2 && vaga2 == false) {
            vaga2 = true;
            System.out.println("Estacionado com sucesso");
        } else if (vaga == 3 && vaga3 == false) {
            vaga3 = true;
            System.out.println("Estacionado com sucesso");
        } else if (vaga == 4 && vaga4 == false) {
            vaga4 = true;
            System.out.println("Estacionado com sucesso");
        } else if (vaga == 5 && vaga5 == false) {
            vaga5 = true;
            System.out.println("Estacionado com sucesso");
        } else if (vaga < 1 || vaga > 5) {
            System.out.println("Vaga inválida");
        } else {
            System.out.println("Vaga ocupada");
        }

        // Tentativa 5
        System.out.println("Informe o número da vaga em que deseja estacionar (de 1 a 5)");
        vaga = scanner.nextInt();

        if (vaga == 1 && vaga1 == false) {
            vaga1 = true;
            System.out.println("Estacionado com sucesso");
        } else if (vaga == 2 && vaga2 == false) {
            vaga2 = true;
            System.out.println("Estacionado com sucesso");
        } else if (vaga == 3 && vaga3 == false) {
            vaga3 = true;
            System.out.println("Estacionado com sucesso");
        } else if (vaga == 4 && vaga4 == false) {
            vaga4 = true;
            System.out.println("Estacionado com sucesso");
        } else if (vaga == 5 && vaga5 == false) {
            vaga5 = true;
            System.out.println("Estacionado com sucesso");
        } else if (vaga < 1 || vaga > 5) {
            System.out.println("Vaga inválida");
        } else {
            System.out.println("Vaga ocupada");
        }

        // int vagas_disponiveis = 5;
        // int vagas_ocupadas = 5;

        // if (vaga1 == true) {
        // vagas_ocupadas = vagas_ocupadas - 1;
        // } else {
        // vagas_disponiveis = vagas_disponiveis - 1;
        // }

        int vagas_disponiveis = 0;
        int vagas_ocupadas = 0;

        if (vaga1 == true) {
            vagas_ocupadas = vagas_ocupadas + 1;
        } else {
            vagas_disponiveis = vagas_disponiveis + 1;
        }

        if (vaga2 == true) {
            vagas_ocupadas = vagas_ocupadas + 1;
        } else {
            vagas_disponiveis = vagas_disponiveis + 1;
        }

        if (vaga3 == true) {
            vagas_ocupadas = vagas_ocupadas + 1;
        } else {
            vagas_disponiveis = vagas_disponiveis + 1;
        }

        if (vaga4 == true) {
            vagas_ocupadas = vagas_ocupadas + 1;
        } else {
            vagas_disponiveis = vagas_disponiveis + 1;
        }

        if (vaga5 == true) {
            vagas_ocupadas = vagas_ocupadas + 1;
        } else {
            vagas_disponiveis = vagas_disponiveis + 1;
        }

        System.out.println("Vagas Ocupadas: " + vagas_ocupadas);
        System.out.println("Vagas Disponíveis: " + vagas_disponiveis);
    }
}
