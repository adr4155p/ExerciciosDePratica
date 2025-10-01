package ExerciciosDiversificados;

import java.util.Scanner;

public class VerificaNota {
    public static void main(String[] args) {
        Scanner notas = new Scanner (System.in);
        System.out.print("Digite a primeira nota: ");
        double nota1 = notas.nextDouble();
        System.out.print("Digite a segunda nota: ");
        double nota2 = notas.nextDouble();
        System.out.print("Digite a terceira nota: ");
        double nota3 = notas.nextDouble();

        double media = (nota1 + nota2 + nota3) / 3;
        System.out.println("Média final: "+ media);
        if (media >= 7) {
            System.out.println("Aluno aprovado!");
        } else if (media >= 5) {
            System.out.println("Aluno em recuperação!");
        } else {
            System.out.println("Aluno reprovado!");
        }

    }
}