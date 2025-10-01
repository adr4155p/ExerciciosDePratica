package ExerciciosComFor;

public class ContagemDeImpares {
    public static void main(String[] args) {
        int[] numeros = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int contadorImpares = 0;

        for (int num : numeros) {
            if (num % 2 == 1) {
                contadorImpares++;
            }
        }
        System.out.println("Quantidade de números impares: " + contadorImpares);
    }
}