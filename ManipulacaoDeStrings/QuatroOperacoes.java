package ManipulacaoDeStrings;

import java.util.Scanner;

public class QuatroOperacoes {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Digite o primeiro número: ");
        int n1 = input.nextInt();
        System.out.print("Digite o segundo número: ");
        int n2 = input.nextInt();

        int soma = n1 + n2;
        int subtracao = n1 - n2;
        int multiplicacao = n1 * n2;

        if (n2 != 0) {
            int divisao = n1 / n2;
            int resto = n1 % n2;
            System.out.printf("\n- %s / %s = %s", n1, n2, divisao);
            System.out.printf("\n- O resto da divisão de %s por %s é: %s", n1, n2, resto);
        } else {
            System.out.println("\nNão é possível dividir por zero.");
        }

        System.out.print("\n\nResultados:");
        System.out.printf("\n- %s + %s = %s", n1, n2, soma);
        System.out.printf("\n- %s - %s = %s", n1, n2, subtracao);
        System.out.printf("\n- %s * %s = %s", n1, n2, multiplicacao);





    }
}
