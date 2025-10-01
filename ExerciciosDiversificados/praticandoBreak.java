package ExerciciosDiversificados;

public class praticandoBreak {
    public static void main(String[] args) {
        for (int i = 1; i <= 100000; i++) {
            if (i % 17 == 0 && i % 23 == 0 && i % 36 == 0) {
                System.out.println("O primeiro número divisivel por 17, 23 e 36 é: " + i);
                break;
            }
        }
    }
}
