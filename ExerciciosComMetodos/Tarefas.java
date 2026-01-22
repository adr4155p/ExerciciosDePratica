package ExerciciosComMetodos;

import java.util.ArrayList;
import java.util.Scanner;

class Tarefas {

    public static void exibirMenu() {
        System.out.println("\n=== MENU DE OPÇÕES ===");
        System.out.println("1 - Adicionar tarefa");
        System.out.println("2 - Listar tarefas");
        System.out.println("3 - Marcar tarefa como concluída");
        System.out.println("4 - Remover tarefa");
        System.out.println("5 - Sair");
        System.out.print("\nSelecione uma opção: ");
    }

    public static void adicionarTarefa(Scanner input, ArrayList<String> tarefas, ArrayList<Boolean> concluida) {
        System.out.print("\nAdicionar tarefa: ");
        String tarefa = input.nextLine();

        tarefas.add(tarefa);
        concluida.add(false);

        System.out.println("\nTarefa adiconada com sucesso!");
    }

    public static void listarTarefas(ArrayList<String> tarefas) {
        if (tarefas.isEmpty()) {
            System.out.println("\nNenhuma tarefa Adicionada");
        } else {
            System.out.println("\n=== LISTA DE TAREFAS ===\n");
            for (int i = 0; i < tarefas.size(); i++) {
                System.out.println((i + 1) + "- " + tarefas.get(i));
            }
        }
    }

    public static void marcarTarefa(Scanner input, ArrayList<String> tarefas) {
        if (tarefas.isEmpty()) {
            System.out.println("\nNenhuma tarefa para remover.");
        } else {
            listarTarefas(tarefas);

            System.out.print("\nDigite o número da tarefa que deseja marcar como concluida: ");
            int indice = input.nextInt() - 1;
            input.nextLine();
            if (indice >= 0 && indice < tarefas.size()) {

                String tarefa = tarefas.get(indice);
                tarefas.set(indice, tarefa + " [✔]");
                System.out.println("Pronto! Tarefa marcada como concluída");
            }
        }
    }

    public static void removerTarefa(Scanner input, ArrayList<String> tarefas, ArrayList<Boolean> concluida) {
        if (tarefas.isEmpty()) {
            System.out.println("\nNenhuma tarefa para remover.");
        } else {
            listarTarefas(tarefas);
            System.out.print("\nSelecione a tarefa que deseja remover: ");
            int indice = input.nextInt() - 1;
            if (indice >= 0 && indice < tarefas.size()) {
                tarefas.remove(indice);
                concluida.remove(indice);
                System.out.println("\nPronto! Tarefa removida.");
            } else {
                System.out.println("\nNúmero inválido!");
            }
        }
    }
}

