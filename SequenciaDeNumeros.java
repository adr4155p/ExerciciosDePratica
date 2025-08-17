import java.util.Scanner;

public class SequenciaDeNumeros {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int totalPares = 0;
        int totalImpares = 0;
        int totalPositivos = 0;
        int totalNegativos = 0;
        int totalZeros = 0;

        for (int i = 0; i < 10; i++) {
            System.out.print("Digite o número " + (i + 1) + ": ");
            int numero = input.nextInt();

            if (numero % 2 == 0) {
                totalPares++;
            } else {
                totalImpares++;
            }

            if (numero > 0) {
                totalPositivos++;
            } else if (numero < 0){
                totalNegativos++;
            } else {
                totalZeros++;
            }
        }

        System.out.println("--- Resumo ---");
        System.out.println("Total de pares: " + totalPares);
        System.out.println("Total de ímpares: " + totalImpares);
        System.out.println("Total de positivos: " + totalPositivos);
        System.out.println("Total de negativos: " + totalNegativos);
        System.out.println("Total de zeros: " + totalZeros);

        input.close();
    }
}
