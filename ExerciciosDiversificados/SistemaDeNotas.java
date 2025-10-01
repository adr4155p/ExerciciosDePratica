package ExerciciosDiversificados;

import java.util.Scanner;

public class SistemaDeNotas {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String entrada;
        String continuar;
        double notas;

        do {
            System.out.print("\nDigite o nome do aluno (ou 'sair' para encerrar): ");
            entrada = input.nextLine();

            if (entrada.equalsIgnoreCase("sair")) {
                System.out.println("Saindo...");
                break;
            }

            double totalNotas = 0;

            for (int i = 1; i <= 3; i++) {
                System.out.printf("Digite a nota %d: ", i);
                notas = input.nextDouble();
                input.nextLine();
                totalNotas += notas;
            }
            double mediaFinal = totalNotas / 3;
            System.out.printf("\nMédia final: %.2f%n", mediaFinal);

            if (mediaFinal >= 7) {
                System.out.println("\nAluno aprovado!");
            } else if (mediaFinal > 5 && mediaFinal <= 6.9) {
                System.out.println("\nAluno de recuperação!");
            } else {
                System.out.println("\nAluno reprovado!");
            }
            System.out.print("Deseja calcular uma nova média? (s/n): ");
            continuar = input.nextLine();
        } while (continuar.equalsIgnoreCase("s"));
        input.close();
    }
}
