package ExerciciosDiversificados;

import java.util.Scanner;

public class SimuladorCaixaEletronico {
    public static void main(String[] args) {
        double saldo = 1000;
        int opcao;
        String continuar;
        Scanner input = new Scanner(System.in);

        do {
            System.out.println("\n=== SISTEMA BANCÁRIO ===");
            System.out.println("1 - Consultar saldo");
            System.out.println("2 - Depositar");
            System.out.println("3 - Sacar");
            System.out.println("3 - Sair");
            System.out.print("Selecione uma opção: ");

            opcao = input.nextInt();
            input.nextLine();

            switch (opcao) {
                case 1:
                    System.out.printf("Saldo atual: R$ %.2f%n", saldo);
                    break;

                case 2:
                    System.out.print("\nDigite o valor que deseja depositar: ");
                    double valorDeposito = input.nextDouble();
                    input.nextLine();
                    saldo += valorDeposito;
                    System.out.printf("\nPronto! Um valor de R$%.2f foi depositado na sua conta\n", valorDeposito);
                    System.out.printf("\nSaldo atual: R$ %.2f%n\n", saldo);
                    break;
                case 3:
                    do {
                        System.out.print("Digite o valor de que deseja sacar: ");
                        double valorSaque = input.nextDouble();
                        input.nextLine();

                        if (valorSaque > saldo) {
                            System.out.println("Saldo zerado! Encerrando operação..");
                            break;
                        } else {
                            saldo -= valorSaque;
                            System.out.printf("\nPronto! um valor de R$ %.2f foi retirado com sucesso!\n", valorSaque);
                            System.out.printf("\nSaldo atual: R$ %.2f%n\n", saldo);
                        }

                        System.out.print("Deseja realizar outro Saque? (s/n): ");
                        continuar = input.next();

                    } while (continuar.equalsIgnoreCase("s"));
                    break;

                case 4:
                    System.out.println("\nSaindo...");
                    break;
                default:
                    System.out.println("Opção Inválida!!");
                    break;
            }
        } while (opcao != 4);
    }
}
