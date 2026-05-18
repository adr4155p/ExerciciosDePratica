package ReaprendendoAsBases.Logica;
import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Digite um número: ");
        int n = input.nextInt();
        int i = 1;

        /*System.out.println("\nTabuada do número " + n);
        for (int i = 1; i <= 10; i++) {
            System.out.println(n + " X " + i + " = " + (n * i));
        }*/

        while (i <= 10) {
            System.out.println(n + " X " + i + " = " + (n * i));
            i++;
        }
    }
}
