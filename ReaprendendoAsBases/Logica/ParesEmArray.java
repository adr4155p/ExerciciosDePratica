package ReaprendendoAsBases.Logica;

import java.util.Scanner;

public class ParesEmArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] numeros = new int[5];
        int pares = 0;
        System.out.print("Digite 5 números: ");
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = input.nextInt();
            if (numeros[i] % 2 == 0) {
                pares++;
            }
        }
        /*for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] % 2 == 0) {
                pares++;
            }
        }*/
        System.out.println("Quantidade de numeros pares: " + pares);
    }
}
