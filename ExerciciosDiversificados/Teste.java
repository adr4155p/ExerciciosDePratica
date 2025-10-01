package ExerciciosDiversificados;

public class Teste {
    public static void main(String[] args) throws InterruptedException {
        StringBuffer buffer = new StringBuffer();

        // Cria e inicia 5 threads que adicionam letras ao buffer
        Thread t1 = new Thread(() -> adicionarLetras(buffer, 'a'));
        Thread t2 = new Thread(() -> adicionarLetras(buffer, 'b'));
        Thread t3 = new Thread(() -> adicionarLetras(buffer, 'c'));
        Thread t4 = new Thread(() -> adicionarLetras(buffer, 'd'));
        Thread t5 = new Thread(() -> adicionarLetras(buffer, 'e'));

        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();

        // Espera todas as threads terminarem
        t1.join();
        t2.join();
        t3.join();
        t4.join();
        t5.join();

        System.out.println("Comprimento final do StringBuffer: " + buffer.length());
        System.out.println("Conteúdo (será completo, mas a ordem pode variar): " + buffer);
    }

    private static void adicionarLetras(StringBuffer sb, char letra) {
        for (int i = 0; i < 1000; i++) {
            sb.append(letra);
        }
    }
}
