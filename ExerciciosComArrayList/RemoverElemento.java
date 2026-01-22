package ExerciciosComArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class RemoverElemento {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        ArrayList<Integer> numeros = new ArrayList<>();

        for(int i = 1; i <= 5; i++) {
            System.out.print("Digite um número inteiro: ");
            int numero = input.nextInt();
            numeros.add(numero);
            input.nextLine();
        }
        System.out.println("\nLista de números: ");
        for (int numero : numeros) {
            System.out.println(numero);
        }

        System.out.print("Informe a posição que deseja excluir: ");
        int posicao = input.nextInt();
        numeros.remove(posicao);
        System.out.printf("\nPronto! número na posição %d apagado!", posicao);

        System.out.println("Lista atualizada:");
        for (int numero : numeros) {
            System.out.println(numero);
        }

        input.close();
    }
}
