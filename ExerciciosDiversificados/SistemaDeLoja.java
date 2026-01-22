package ExerciciosDiversificados;

import java.util.Scanner;

public class SistemaDeLoja {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double camisa = 50, calca = 80, tenis = 120;
        int qntCamisa = 0, qntCalca = 0, qntTenis = 0;
        double totalCamisa = 0, totalCalca = 0, totalTenis = 0;


        String continuar = "s";

        System.out.println("\n=== BEM VINDO A LOJA ===\n");
        do {
            int opcao;
            System.out.println("ITENS DISPONIVEIS");
            System.out.println("\n1 - Camisa - R$ 50,00 ");
            System.out.println("\n2 - Calça - R$ 80,00 ");
            System.out.println("\n3 - Tênis - R$ 120,00 ");
            System.out.println("\n4 - Sair ");
            System.out.print("\nSelecione o número item que gostaria de comprar: ");
            opcao = input.nextInt();

            if (opcao < 1 || opcao > 4) {
                System.out.println("Opção inválida. Selecione uma opção válida");
                continue;
            }

            if (opcao == 4) {
                break;
            }
            System.out.print("Quantidade: ");
            int qtd = input.nextInt();
            switch (opcao) {
                case 1:
                    System.out.printf("Item %d selecionado: Camisa\n", opcao);
                    qntCamisa += qtd;
                    totalCamisa += qtd * camisa;
                    System.out.println("Pronto! Seu produto foi cadastrado");
                    break;

                case 2:
                    System.out.printf("Item %d selecionado: Calça\n", opcao);
                    qntCalca += qtd;
                    totalCalca += qtd * calca;
                    System.out.println("Pronto! Seu produto foi cadastrado");

                    break;

                case 3:
                    System.out.printf("Item %d selecionado: Tênis\n", opcao);
                    qntTenis += qtd;
                    totalTenis += qtd * tenis;
                    System.out.println("Pronto! Seu produto foi cadastrado");
                    break;
            }


            input.nextLine();
            while (true) {
                System.out.print("\nDeseja continuar comprando? (s/n): ");
                continuar = input.nextLine();

                if (continuar.equalsIgnoreCase("s") || continuar.equalsIgnoreCase("n")) {
                    break;
                } else {
                    System.out.println("Opção inválida. Digite 's' para sim ou 'n' para não.");
                }
            }

        } while (continuar.equalsIgnoreCase("s"));

        double valorTotal = totalCalca + totalTenis + totalCamisa;

        if (qntCamisa + qntCalca + qntTenis > 0) {
            System.out.println("\n=== RESUMO DA COMPRA ===");
            if (qntCamisa > 0) {
                System.out.printf("%-10s x%-3d = R$%.2f\n", "Camisa", qntCamisa, totalCamisa);
            }
            if (qntCalca > 0) {
                System.out.printf("%-10s x%-3d = R$%.2f\n", "Calça", qntCalca, totalCalca);
            }
            if (qntTenis > 0) {
                System.out.printf("%-10s x%-3d = R$%.2f\n", "Tênis", qntTenis, totalTenis);
            }
            System.out.printf("\n%-15s R$%.2f\n", "TOTAL:", valorTotal);
        } else {
            System.out.println("Comprou nada, vacilão. Vai pá bosta!");
        }


        input.close();
    }
}
