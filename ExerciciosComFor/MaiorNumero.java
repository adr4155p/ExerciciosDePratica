package ExerciciosComFor;

public class MaiorNumero {
    public static void main(String[] args) {
        int[] numeros = {10, 27, 38, 984, 75, 856};
        int MaiorNumeroEncontrado = numeros[0];
        for (int numero : numeros) {
            if (numero > MaiorNumeroEncontrado) {
                MaiorNumeroEncontrado = numero;
            }
        }
        System.out.println("O maior número é: " + MaiorNumeroEncontrado);
    }
}
