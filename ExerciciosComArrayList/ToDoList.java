package ExerciciosComArrayList;

import java.util.Scanner;
import java.util.ArrayList;

public class ToDoList {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        ArrayList<String> tarefas = new ArrayList<>();

        int opcao = 0;

        while(opcao != 4) {
            System.out.println("\n=== Lista de Tarefas ===");
            System.out.println("1. Adcionar tarefa");
            System.out.println("2. Listar tarefas");
            System.out.println("3. Remover tarefa");
            System.out.println("4. Sair");
            System.out.print("Escolha uma opção: ");

            opcao = input.nextInt();
            input.nextLine();

            if (opcao == 1) {
                System.out.print("Digite a nova tarefa: ");
                String novaTarefa = input.nextLine();
                tarefas.add(novaTarefa);
                System.out.println("Tarefa adiconada!");
            } else if (opcao == 2) {
                System.out.println("\nSuas tarefas:");
                if (tarefas.isEmpty()) {
                    System.out.println("Nenhuma tarefa cadastrada.");
                } else {
                    for (int i = 0; i < tarefas.size(); i++) {
                        System.out.println((i + 1) + "- " + tarefas.get(i));
                    }
                }
            } else if (opcao == 3) {
                if (tarefas.isEmpty()) {
                    System.out.println("Nenhuma tarefa para remover.");
                } else {
                    System.out.println("\nTarefas disponíveis: ");
                    for (int i = 0; i < tarefas.size(); i++) {
                        System.out.println((i + 1) + "- " + tarefas.get(i));
                    }
                    System.out.print("Digite o número da tarefa para remover: ");
                    int indice = input.nextInt() - 1;
                    if (indice > 0 && indice < tarefas.size()) {
                        tarefas.remove(indice);
                        System.out.println("Tarefa removida!");
                    } else {
                        System.out.println("Número inválido.");
                    }
                }
            } else if (opcao == 4) {
                System.out.println("\nAté logo!");
            } else {
                System.out.println("Opção inválida. Tente novamente.");
            }
        }

        input.close();
    }
}
