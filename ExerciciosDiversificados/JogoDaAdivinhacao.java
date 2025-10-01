package ExerciciosDiversificados;

import java.util.Scanner;

public class JogoDaAdivinhacao {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String encerrar;

        do {
            System.out.println("------- JOGO DA ADVINHAÇÃO -------");
            int numero = (int) (Math.random() * 100) + 1;
            int num = -1;
            int tentativa = 0;

            while (num != numero) {
                System.out.print("Digite um número: ");
                num = input.nextInt();

                if (num > numero) {
                    System.out.println("O número é menor. tente novamente.");
                } else if (num < numero) {
                    System.out.println("O número é maior. tente novamente.");
                }
                tentativa++;

            }

            System.out.println("Parabéns, você acertou");
            System.out.println("Número: " + numero);
            System.out.println("Numéro de tentativas: " + tentativa);

            input.nextLine();

            while (true) {
                System.out.print("Deseja realizar um novo jogo? (s/n): ");
                encerrar = input.nextLine();

                if (encerrar.equalsIgnoreCase("s") || encerrar.equalsIgnoreCase("n")) {
                    break;
                } else {
                    System.out.println("Opção inválida. Digite 's' para sim ou 'n' para não.");
                }
            }

        } while (encerrar.equalsIgnoreCase("s"));

        System.out.println("Jogo encerrado. Obrigado por jogar!");
        input.close();
    }
}
