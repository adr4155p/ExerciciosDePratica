package ExerciciosComFor;

public class Fatorial {
    public static void main(String[] args) {
        int num = 5;
        int fatorial = 1;

        for (int i = 1; i <= num; i++) {
            fatorial *= i;
        }
        System.out.println("Fatorial de " + num + " é: " + fatorial);
    }
}
