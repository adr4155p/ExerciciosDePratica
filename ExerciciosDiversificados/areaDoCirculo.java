package ExerciciosDiversificados;

import java.util.Scanner;

public class areaDoCirculo {
    public static void main(String[] args) {
        final double PI = 3.14159;
        double A = 0;
        Scanner raio = new Scanner (System.in);
        System.out.print("Informe o raio do círculo: ");
        double R = raio.nextDouble();

        A = PI * R * R;
        System.out.printf("A área de um círculo de raio %.2f é: %.2f%n ", R, A);

    }
}
