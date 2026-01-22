package ExerciciosComArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class ListaDeNomesComArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        ArrayList<String> nomes = new ArrayList<>();

        for (int i = 1; i <= 3; i++) {
            System.out.print("Digite algum nome: ");
            String nome = input.nextLine();
            nomes.add(nome);
        }

        System.out.println("\nLista de nomes:");
        for (String nome : nomes) {
            System.out.println(nome);
        }
    }
}
