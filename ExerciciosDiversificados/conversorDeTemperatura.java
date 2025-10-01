package ExerciciosDiversificados;/*Escreva um programa que realize a conversão de graus Celsius (C)  para graus Fahrenheit (F). Utilize a fórmula abaixo:

F = ( 9 C) 5
*/

import java.util.Scanner;

public class conversorDeTemperatura {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Informe a temperatura em C°: ");
        float C = input.nextFloat();

        input.close();

        float F = (C * 9 / 5) + 32;
        System.out.println("CONVERTENDO TEMPERATURA...\n");
        System.out.printf("%.1f° Celsius convertido para Fahrenheit é: %.1f° Fahrenheit%n", C, F);

    }
}
