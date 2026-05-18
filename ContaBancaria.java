import java.util.Scanner;

public class ContaBancaria {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite o nome do titular: ");
        String titular = input.nextLine();

        System.out.print("Digite o número da agência: ");
        int agencia = input.nextInt();

        System.out.print("Digite o saldo inicial: ");
        double saldo = input.nextDouble();

        System.out.printf("%nTitular: %s | Agência: %d | Saldo: R$ %.2f%n%n", titular, agencia, saldo);

        int opcao;

        do {
            System.out.println("---------------------------------------");
            System.out.println("1 - Depositar");
            System.out.println("2 - Sacar");
            System.out.println("3 - Ver saldo");
            System.out.println("4 - Sair");
            System.out.print("\nDigite opcao: ");
            opcao = input.nextInt();

            switch (opcao) {
                case 1:
                    saldo = depositar(saldo, input);
                    break;
                case 2:
                    saldo = sacar(saldo, input);
                    break;
                case 3:
                    verSaldo(saldo);
                    break;
                case 4:
                    System.out.println("Encerrando operação...");
                    break;
                default:
                    System.out.println("Opção inválida.");
            }
        } while (opcao != 4);
    }

    static double depositar(double saldo, Scanner input) {
        System.out.print("\nDigite o valor do depósito: ");
        double deposito = input.nextDouble();

        if (deposito <= 0.0) {
            System.out.println("\nValor inválido.");
            return saldo;
        }
        saldo += deposito;
        System.out.printf("%nValor de %.2f depositado com sucesso!", deposito);
        System.out.printf("%nSaldo atualizado: R$ %.2f%n", saldo);
        return saldo;
    }

    static double sacar(double saldo, Scanner input) {
        System.out.print("\nDigite o valor do saque: ");
        double valorSaque = input.nextDouble();

        if (valorSaque <= 0.0) {
            System.out.println("\nNão é possível sacar valores negativos.");
            return saldo;

        }
        if (valorSaque > saldo) {
            System.out.println("\nNão é possível realizar saques maiores que o saldo total.");
            return saldo;

        }
        saldo -= valorSaque;
        System.out.printf("%nSaque no valor de R$ %.2f realizado com sucesso!%n", valorSaque);
        System.out.printf("Saldo atualizado: R$ %.2f%n", saldo);
        return saldo;
    }

    static void verSaldo(double saldo) {
        System.out.printf("%nSaldo atual: R$ %.2f%n", saldo);
    }
}

