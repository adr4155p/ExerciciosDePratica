package ReaprendendoAsBases.Logica;
import java.util.*;

public class Soma {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Digite um número: ");
        int n = input.nextInt();
        int soma = 0;
        int i = 1;

        /*for (int i = 1; i <= n; i++) {
            soma += i;
        }*/

        while (i <= n) {
            soma += i;
            i++;
        }
        System.out.println(soma);
    }
}
