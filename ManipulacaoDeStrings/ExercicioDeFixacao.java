package ManipulacaoDeStrings;

public class ExercicioDeFixacao {
    public static void main(String[] args) {
        String frase = "Aprender Java é muito legal";

        // 1. Usa split() para transformar a frase em um array de palavras.
        String[] palavras = frase.split(" ");

        // Cria o StringBuilder para construir a nova frase invertida
        StringBuilder fraseFinal = new StringBuilder();

        // 2. Itera sobre o array de palavras DE TRÁS PARA FRENTE.
        // O loop começa no último índice do array (palavras.length - 1)
        // e vai até o primeiro (i >= 0), decrementando.
        for (int i = palavras.length - 1; i >= 0 ; i--) {

            // Pega a palavra atual do array
            String palavraAtual = palavras[i];

            // 3. Usa um novo StringBuilder para INVERTER a palavra atual.
            StringBuilder palavraInvertida = new StringBuilder(palavraAtual);
            palavraInvertida.reverse();

            // 4. Adiciona a palavra invertida à nossa StringBuilder final.
            fraseFinal.append(palavraInvertida);

            // Adiciona um espaço, exceto para a última palavra.
            if (i > 0) { // O último item a ser processado será o do índice 0.
                fraseFinal.append(" ");
            }
        }

        System.out.println("Frase original: " + frase);
        System.out.println("Frase invertida: " + fraseFinal.toString());
    }
}
