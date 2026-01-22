package ExerciciosDiversificados;

import java.util.Scanner;

public class SistemaDeCalculo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double num1, num2;
        int opcao;

        do {
            System.out.println("=== MENU DE OPÇÕES ===");
            System.out.println("1- Soma");
            System.out.println("2- Sair");
            System.out.print("Escolha: ");

            opcao = input.nextInt();
            input.nextLine();

            switch (opcao) {
                case 1:
                    System.out.print("Digite o primeiro número: ");
                    num1 = input.nextDouble();
                    System.out.print("Digite o segundo número: ");
                    num2 = input.nextDouble();
                    input.nextLine();

                    double resultado = num1 + num2;

                    System.out.println(resultado);
            }
        } while (opcao != 2);
    }
}
