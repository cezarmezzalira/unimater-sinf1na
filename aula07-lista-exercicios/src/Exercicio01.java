import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean vaga1 = false;
        boolean vaga2 = false;
        boolean vaga3 = false;
        boolean vaga4 = false;
        boolean vaga5 = false;

        int tentativa = 0;
        // Tentativa 2
        System.out.println("Informe a vaga em que deseja estacionar (1 a 5)");
        tentativa = scanner.nextInt();

        if (tentativa == 1 && vaga1 == false) {
            vaga1 = true;
            System.out.println("Estacionado com sucesso");
        } else if (tentativa == 2 && vaga2 == false) {
            vaga2 = true;
            System.out.println("Estacionado com sucesso");
        } else if (tentativa == 3 && vaga3 == false) {
            vaga3 = true;
            System.out.println("Estacionado com sucesso");
        } else if (tentativa == 4 && vaga4 == false) {
            vaga4 = true;
            System.out.println("Estacionado com sucesso");
        } else if (tentativa == 5 && vaga5 == false) {
            vaga5 = true;
            System.out.println("Estacionado com sucesso");
        }

        // Tentativa 2
        System.out.println("Informe a vaga em que deseja estacionar (1 a 5)");
        tentativa = scanner.nextInt();

        if (tentativa == 1 && vaga1 == false) {
            vaga1 = true;
            System.out.println("Estacionado com sucesso");
        } else if (tentativa == 2 && vaga2 == false) {
            vaga2 = true;
            System.out.println("Estacionado com sucesso");
        } else if (tentativa == 3 && vaga3 == false) {
            vaga3 = true;
            System.out.println("Estacionado com sucesso");
        } else if (tentativa == 4 && vaga4 == false) {
            vaga4 = true;
            System.out.println("Estacionado com sucesso");
        } else if (tentativa == 5 && vaga5 == false) {
            vaga5 = true;
            System.out.println("Estacionado com sucesso");
        }

        // Tentativa 3
        System.out.println("Informe a vaga em que deseja estacionar (1 a 5)");
        tentativa = scanner.nextInt();

        if (tentativa == 1 && vaga1 == false) {
            vaga1 = true;
            System.out.println("Estacionado com sucesso");
        } else if (tentativa == 2 && vaga2 == false) {
            vaga2 = true;
            System.out.println("Estacionado com sucesso");
        } else if (tentativa == 3 && vaga3 == false) {
            vaga3 = true;
            System.out.println("Estacionado com sucesso");
        } else if (tentativa == 4 && vaga4 == false) {
            vaga4 = true;
            System.out.println("Estacionado com sucesso");
        } else if (tentativa == 5 && vaga5 == false) {
            vaga5 = true;
            System.out.println("Estacionado com sucesso");
        }

        // Tentativa 4
        System.out.println("Informe a vaga em que deseja estacionar (1 a 5)");
        tentativa = scanner.nextInt();

        if (tentativa == 1 && vaga1 == false) {
            vaga1 = true;
            System.out.println("Estacionado com sucesso");
        } else if (tentativa == 2 && vaga2 == false) {
            vaga2 = true;
            System.out.println("Estacionado com sucesso");
        } else if (tentativa == 3 && vaga3 == false) {
            vaga3 = true;
            System.out.println("Estacionado com sucesso");
        } else if (tentativa == 4 && vaga4 == false) {
            vaga4 = true;
            System.out.println("Estacionado com sucesso");
        } else if (tentativa == 5 && vaga5 == false) {
            vaga5 = true;
            System.out.println("Estacionado com sucesso");
        }

        // Tentativa 5
        System.out.println("Informe a vaga em que deseja estacionar (1 a 5)");
        tentativa = scanner.nextInt();

        if (tentativa == 1 && vaga1 == false) {
            vaga1 = true;
            System.out.println("Estacionado com sucesso");
        } else if (tentativa == 2 && vaga2 == false) {
            vaga2 = true;
            System.out.println("Estacionado com sucesso");
        } else if (tentativa == 3 && vaga3 == false) {
            vaga3 = true;
            System.out.println("Estacionado com sucesso");
        } else if (tentativa == 4 && vaga4 == false) {
            vaga4 = true;
            System.out.println("Estacionado com sucesso");
        } else if (tentativa == 5 && vaga5 == false) {
            vaga5 = true;
            System.out.println("Estacionado com sucesso");
        }

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
        System.out.println("Vagas disponiveis: " + vagas_disponiveis);
        System.out.println("Vagas ocupadas: " + vagas_ocupadas);

    }
}
