package ManipulacaoDeStrings;

public class InversaoDeString {
    public static void main(String[] args) {
        String nomeCompleto = "Adriel Amaral Barbosa";

        // Criamos uma variável para armazenar o nome invertido
        String nomeInvertido = "";

        // O loop 'for' vai do último caractere (length - 1) até o primeiro (0)
        for (int i = nomeCompleto.length() - 1; i >= 0; i--) {
            // Em cada iteração, pegamos o caractere na posição 'i'
            char caractere = nomeCompleto.charAt(i);

            // E o adicionamos ao final da nossa nova string
            nomeInvertido = nomeInvertido + caractere;
        }

        System.out.println("Nome original: " + nomeCompleto.toUpperCase());
        System.out.println("Nome invertido: " + nomeInvertido.toUpperCase());
    }
}