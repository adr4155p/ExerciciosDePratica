package ExerciciosDiversificados;

import java.util.Scanner;

public class SistemaDeLojaCorrigido {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double camisa = 50, calca = 80, tenis = 120;
        int qntCamisa = 0, qntCalca = 0, qntTenis = 0;
        double totalCamisa = 0, totalCalca = 0, totalTenis = 0;

        String continuar = "s";

        System.out.println("\n=== BEM VINDO A LOJA ===\n");

        do {
            int opcao;
            System.out.println("\n==== MENU DE PRODUTOS ====");
            System.out.println("1 - Camisa - R$ 50,00 ");
            System.out.println("2 - Calça  - R$ 80,00 ");
            System.out.println("3 - Tênis  - R$ 120,00 ");
            System.out.println("4 - Sair");
            System.out.print("Selecione o número do item: ");
            opcao = input.nextInt();

            if (opcao < 1 || opcao > 4) {
                System.out.println("Opção inválida. Tente novamente.");
                continue; // volta pro menu sem rodar o resto
            }

            if (opcao == 4) {
                System.out.println("Saindo do menu de compras...");
                break;
            }

            // Pergunta quantidade
            System.out.print("Quantidade: ");
            int qtd = input.nextInt();

            switch (opcao) {
                case 1:
                    qntCamisa += qtd;
                    totalCamisa += qtd * camisa;
                    System.out.println("Camisa adicionada ao carrinho!");
                    break;

                case 2:
                    qntCalca += qtd;
                    totalCalca += qtd * calca;
                    System.out.println("Calça adicionada ao carrinho!");
                    break;

                case 3:
                    qntTenis += qtd;
                    totalTenis += qtd * tenis;
                    System.out.println("Tênis adicionado ao carrinho!");
                    break;
            }

            // Pergunta se continua
            input.nextLine(); // consumir quebra de linha
            while (true) {
                System.out.print("Deseja continuar comprando? (s/n): ");
                continuar = input.nextLine();

                if (continuar.equalsIgnoreCase("s") || continuar.equalsIgnoreCase("n")) {
                    break;
                } else {
                    System.out.println("Opção inválida. Digite 's' ou 'n'.");
                }
            }

        } while (continuar.equalsIgnoreCase("s"));

        // Exibir telinha final
        double valorTotal = totalCamisa + totalCalca + totalTenis;

        System.out.println("\n=== RESUMO DA COMPRA ===");
        if (qntCamisa > 0) {
            System.out.printf("Camisa x%d = R$%.2f\n", qntCamisa, totalCamisa);
        }
        if (qntCalca > 0) {
            System.out.printf("Calça  x%d = R$%.2f\n", qntCalca, totalCalca);
        }
        if (qntTenis > 0) {
            System.out.printf("Tênis  x%d = R$%.2f\n", qntTenis, totalTenis);
        }

        System.out.printf("\nValor total da compra: R$%.2f\n", valorTotal);

        input.close();
    }
}
