package ExerciciosDiversificados;

import java.util.Scanner;

public class SimuladorDeUrna {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int candidato1 = 0, candidato2 = 0, candidato3 = 0, candidato4 = 0;
        int branco = 0, nulo = 0;
        String encerrar = "s";

        int opcao;

        do {
            System.out.println("\n=== URNA ELETRÔNICA ===");
            System.out.println("1 - Cleitin Rapadura");
            System.out.println("2 - Ernesto pé de breque");
            System.out.println("3 - Jalin Habey");
            System.out.println("4 - Jacinto Pinto");
            System.out.println("5 - Voto em branco");
            System.out.println("6 - Voto nulo");
            System.out.println("0 - encerrar votação");
            System.out.print("\nDigite sua opção: ");

            opcao = input.nextInt();

            if (opcao < 0 || opcao > 6) {
                System.out.println("Opção inválida");
                continue;
            }

            if (opcao == 0) {
                break;
            }

            switch (opcao) {
                case 1:
                    System.out.println("Candidato Cleitin Rapadura selecionado! ");
                    candidato1 += 1;
                    System.out.println("Seu voto foi computado!");
                    break;
                case 2:
                    System.out.println("Ernesto pé de breque");
                    candidato2 += 1;
                    System.out.println("Seu voto foi computado!");
                    break;
                case 3:
                    System.out.println("Jalin Habey");
                    candidato3 += 1;
                    System.out.println("Seu voto foi computado!");
                    break;
                case 4:
                    System.out.println("Jacinto Pinto");
                    candidato4 += 1;
                    System.out.println("Seu voto foi computado!");
                    break;
                case 5:
                    System.out.println("Você votou em branco!");
                    branco += 1;
                    System.out.println("Seu voto foi computado!");
                    break;
                case 6:
                    System.out.println("Você votou nulo!");
                    nulo += 1;
                    System.out.println("Seu voto foi computado!");
                    break;
            }

            input.nextLine();

        while (true) {
            System.out.print("Deseja continuar votando? (s/n): ");
            encerrar = input.nextLine();

            if (encerrar.equalsIgnoreCase("s") || encerrar.equalsIgnoreCase("n")) {
                break;
            } else {
                System.out.println("Opção inválida. Digite 's' para sim ou 'n' para não.");
            }
        }

        } while (encerrar.equalsIgnoreCase("s"));

        if (candidato1 + candidato2 + candidato3 + candidato4 + branco + nulo >= 0) {
            System.out.println("\n=== RESULTADO DA VOTAÇÃO ===");
            System.out.println("Cleitin Rapadura: " + candidato1);
            System.out.println("Ernesto pé de breque: " + candidato2);
            System.out.println("Jalin Habey: " + candidato3);
            System.out.println("Jacinto Pinto: " + candidato4);
            System.out.println("Voto em branco: " + branco);
            System.out.println("Votos nulos: " + nulo);

        }

        int[] votos = {candidato1, candidato2, candidato3, candidato4};
        String[] nomes = {"Cleitin Rapadura", "Ernesto pé de breque", "Jalin Habey", "Jacinto Pinto"};

        int nomeVencedor = 0;
        int vencedor = votos[0];
        for (int i = 1; i < votos.length; i++) {   // começa do segundo candidato
            if (votos[i] > vencedor) {
                vencedor = votos[i];   // atualiza maior número de votos
                nomeVencedor = i;      // guarda o índice desse candidato
            }
        }

        System.out.printf("O vencedor foi %s com %d votos!\n", nomes[nomeVencedor], vencedor);

        input.close();
    }
}
