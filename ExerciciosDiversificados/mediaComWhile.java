package ExerciciosDiversificados;

import java.util.Scanner;

public class mediaComWhile {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double somaDasNotas = 0.0;
        int quantidadeDeNotas = 0;
        String continuar;

        do {
            System.out.print("Digite uma nota: ");
            double nota = input.nextDouble();

            somaDasNotas += nota;
            quantidadeDeNotas++;

            System.out.println("Deseja inserir outra nota? (s/n): ");
            continuar = input.next();
        } while (continuar.equalsIgnoreCase("s"));

        if (quantidadeDeNotas > 0) {
            double media = somaDasNotas / quantidadeDeNotas;
            System.out.println("A média das " + quantidadeDeNotas + " notas é: " + media);
        } else {
            System.out.println("Nenhuma nota foi inserida.");
        }

        input.close();
    }
}
