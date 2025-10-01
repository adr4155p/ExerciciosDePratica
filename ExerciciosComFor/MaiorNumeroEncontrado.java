package ExerciciosComFor;

public class MaiorNumeroEncontrado {
    public static void main(String[] args) {
        int[] numeros = {15, 3, 28, 4, 10};
        int maiorNumeroEncontrado = numeros[0];

        for (int numero : numeros) {
            if(numero > maiorNumeroEncontrado) {
                maiorNumeroEncontrado = numero;
            }
        }

        System.out.println("O maior número é: " + maiorNumeroEncontrado);
    }
}
