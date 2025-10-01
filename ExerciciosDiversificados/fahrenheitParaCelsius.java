package ExerciciosDiversificados;

import java.util.Scanner;

public class fahrenheitParaCelsius {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.print("Informe a temperatura em F°: ");
        float F = input.nextFloat();

        input.close();

        float C = ((F - 32) * 5) / 9;
        System.out.println("CONVERTENDO TEMPERATURA...\n");
        System.out.printf("%.1f° Fahrenheit é igual a: %.1f° Celsius%n", F, C);
    }
}
