public class calculoMMC {

    // Função para calcular o MDC usando o algoritmo de Euclides
    public static int mdc(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    // Função para calcular o MMC de dois números
    public static int mmc(int a, int b) {
        return (a * b) / mdc(a, b);
    }

    // Função para calcular o MMC de um array de vários números
    public static int mmcDeVarios(int[] numeros) {
        int resultado = numeros[0];
        for (int i = 1; i < numeros.length; i++) {
            resultado = mmc(resultado, numeros[i]);
        }
        return resultado;
    }

    public static void main(String[] args) {
        int[] numeros = {17, 23, 36};

        int resultado = mmcDeVarios(numeros);
        System.out.println("MMC de 17, 23 e 36 é: " + resultado);
    }
}

