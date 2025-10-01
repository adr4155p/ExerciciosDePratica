package ExerciciosDiversificados;

import java.util.Scanner;

public class parOuImpar {
    public static void main(String[] args) {
        Scanner pi = new Scanner (System.in);
        System.out.print("Digite um número: ");
        int num = pi.nextInt();
        if (num % 2 == 0) {
            System.out.println("O número digitado é PAR");
        } else{
            System.out.println("O número digitado é IMPAR");
        }

        if (num > 0) {
            System.out.println("O número "+ num+ " é POSITIVO");
        } else if (num < 0) {
            System.out.println("O número "+ num+ " é NEGATIVO");
        } else {
            System.out.println("O número é ZERO");
        }
    }
}