package ExerciciosDiversificados;

import java.util.Scanner;

public class ExercicioComArray {
    public static void main(String[] args) {

        Scanner input = new Scanner (System.in);

        String[] nomes = new String[3];
        int contador = 0;

        while (contador != nomes.length) {
            System.out.print("Nome " + contador + ": ");
            nomes[contador] = input.next();
            contador++;
        }
        System.out.println("\nOs nomes dentro do Array são: \n" + String.join(", ", nomes));

        input.close();

    }
}
