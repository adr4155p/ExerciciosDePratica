package ExerciciosDiversificados;

import java.util.Scanner;

public class SistemaDeAtendimento {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean atendendo = true;

        int senhaAtual = 1;
        while (atendendo) {
            System.out.println("\n[1] Chamar próxima senha");
            System.out.println("[2] Pular senha (cliente não está presente)");
            System.out.println("[3] Encerrar atendimento");
            System.out.print("\nDigite uma opção:");

            byte opcao = input.nextByte();

            switch (opcao) {
                case 1:
                    System.out.println("Atendendo a senha número: " + senhaAtual);
                    senhaAtual++;
                    break;
                case 2:
                    System.out.println("Pulando a senha número: " + senhaAtual);
                    senhaAtual++;
                    break;
                case 3:
                    System.out.println("Encerrando atendimento...");
                    atendendo = false;
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }

        input.close();
    }
}
