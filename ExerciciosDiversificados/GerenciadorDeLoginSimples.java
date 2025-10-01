package ExerciciosDiversificados;

import java.util.Scanner;

public class GerenciadorDeLoginSimples {
    public static void main(String[] args) {

        String usuarioCorreto = "admin";
        String senhaCorreta = "12345";

        boolean loginSucesso = false;
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 3; i++) {
            System.out.println("Tentativa " + (i + 1) + " de 3:");
            System.out.print("Digite seu nome de usuário: ");
            String usuarioDigitado = scanner.next();

            System.out.print("Digite sua senha: ");
            String senhaDigitada = scanner.next();

            if (usuarioDigitado.equals(usuarioCorreto) && senhaDigitada.equals(senhaCorreta)) {
                System.out.println("Login bem-sucedido! Bem-vindo.");
                loginSucesso = true;
                break;
            } else {
                System.out.println("Usuário ou senha incorretos. Tente novamente.");
            }
        }
        if (!loginSucesso) {
            System.out.println("Suas 3 tentativas terminaram. O programa será encerrado.");
        }

        scanner.close();
    }
}
