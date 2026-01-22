package ExerciciosComMetodos;
import java.util.ArrayList;

import java.util.Scanner;

public class GerenciamentoDeTarefas {

    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        ArrayList<String> tarefas = new ArrayList<>();
        ArrayList<Boolean> concluida = new ArrayList<>();
        int opcao;


        do {
            Tarefas.exibirMenu();
            opcao = input.nextInt();
            input.nextLine();

            switch(opcao) {
                case 1 -> Tarefas.adicionarTarefa(input, tarefas, concluida);
                case 2 -> Tarefas.listarTarefas(tarefas);
                case 3 -> Tarefas.marcarTarefa(input, tarefas);
                case 4 -> Tarefas.removerTarefa(input, tarefas, concluida);
                case 5 -> System.out.println("Fechando lista de tarefas...");
                default -> System.out.println("Opção inválida!");
            }
        } while (opcao != 5);

        input.close();
    }
}