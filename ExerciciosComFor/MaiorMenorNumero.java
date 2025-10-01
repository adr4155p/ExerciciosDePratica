package ExerciciosComFor;

public class MaiorMenorNumero {
    public static void main(String[] args) {
        int[] numeros = {4, 9, 2, 7, 5};
        int maiorNumeroEncontrado = numeros[0];
        int menorNumeroEncontrado = numeros[0];
        for (int numero : numeros) {
            if (numero > maiorNumeroEncontrado){
                maiorNumeroEncontrado = numero;
            }

            if (numero < menorNumeroEncontrado) {
                menorNumeroEncontrado = numero;
            }
        }
        System.out.println("Maior número encontrado: " + maiorNumeroEncontrado);
        System.out.println("Menor número encontrado: " + menorNumeroEncontrado);
    }
}
