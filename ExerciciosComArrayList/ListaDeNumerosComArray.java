package ExerciciosComArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class ListaDeNumerosComArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> numeros = new ArrayList<>();

        for (int i = 1; i <=5; i++){
            System.out.println("Digite um número inteiro: ");
            int numero = input.nextInt();
            numeros.add(numero);
        }

        System.out.println("Números digitados: ");
        for (int numero : numeros) {
            System.out.println(numero);
        }
    }
}
