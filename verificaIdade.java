import java.util.Scanner;

public class verificaIdade {
    public static void main(String[] args) {
        Scanner fe = new Scanner (System.in);
        System.out.print("Informe sua idade: ");
        int idade = fe.nextInt();
        if (idade <= 12) {
            System.out.println("CRIANÇA");
        } else if (idade < 18) {
            System.out.println("ADOLESCENTE");
        } else if (idade < 61) {
            System.out.println("ADULTO");
        } else {
            System.out.println("IDOSO");
        }
    }
}
