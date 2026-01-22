package ExerciciosComArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class ControleDeCompras {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        ArrayList<String> produtos = new ArrayList<>();
        ArrayList<Double> precos = new ArrayList<>();

        int opcao;

        do {
            System.out.println("\n----- LISTA DE COMPRAS -----\n");
            System.out.println("1 - Adicionar produto");
            System.out.println("2 - Listar produtos");
            System.out.println("3 - Mostrar total");
            System.out.println("4 - Sair");
            System.out.print("\nEscolha: ");
            opcao = input.nextInt();
            input.nextLine();

            switch (opcao) {
                case 1:
                    System.out.print("Nome do produto: ");
                    String produto = input.nextLine();

                    System.out.print("Preço do produto: R$ ");
                    double preco = input.nextDouble();
                    input.nextLine();

                    produtos.add(produto);
                    precos.add(preco);
                    System.out.println("\nProduto adicionado com sucesso!");
                    break;

                case 2:
                    if (produtos.isEmpty()) {
                        System.out.println("Nenhum produto cadastrado!");
                    } else {
                        System.out.println("----- Produtos Listados -----");
                        for (int i = 0; i < produtos.size(); i++) {
                            System.out.printf("%d - %-5s | R$ %.2f%n", i + 1, produtos.get(i), precos.get(i));
                        }
                    }
                    break;

                case 3:
                    double soma = 0;
                    for (double totalPreco : precos)
                        soma += totalPreco;
                    System.out.printf("Total Gasto: %.2f", soma);
                    break;

                case 4:
                    System.out.println("\nEncerrando lista de compras...");
                    break;

                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }

        } while(opcao != 4);

        input.close();
    }
}
