package ExerciciosDiversificados;

import java.util.Scanner;
public class ContadorImparPar {
    public static void main(String[] args) {
        int contador;
        Scanner input = new Scanner(System.in);
            System.out.print("Digite um número: ");
            contador = input.nextInt();

            int i = 1;

        while (i <= contador) {
            if (i % 2 == 0) {
                System.out.println(i + " é par");
            } else {
                System.out.println(i + " é impar");
            }
            i++;
        }
        input.close();
    }
}
