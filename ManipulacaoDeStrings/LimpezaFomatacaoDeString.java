package ManipulacaoDeStrings;

public class LimpezaFomatacaoDeString {
    public static void main(String[] args) {

        String dadosSujos = "   java; python; c++   ";

        // 1. Usa trim() para remover os espaços em branco do início e do fim.
        String dadosLimpos = dadosSujos.trim();

        // 2. Usa split(";") para transformar a string em um array de strings.
        // O resultado será um array com 3 elementos: ["java", "python", "c++"]
        String[] linguagens = dadosLimpos.split(";");

        // 3. StringBuilder para juntar as palavras.
        StringBuilder sb = new StringBuilder();


        // Agora, percorre o array para adicionar cada palavra ao builder.
        // Usa um loop for-each, que é mais simples para arrays.
        for (String linguagem : linguagens) {
            // Adiciona a linguagem atual
            sb.append(linguagem.trim()); // usa trim() para remover espaços extras, se houver.

            // Adiciona a vírgula e o espaço, exceto na última palavra.
            // Para isso, verificamos se a palavra atual não é a última do array.
            if (!linguagem.equals(linguagens[linguagens.length - 1])) {
                sb.append(", ");
            }
        }

        // 4. Converte o StringBuilder final para String e imprime.
        String resultado = sb.toString();
        System.out.println("String original: \"" + dadosSujos + "\"");
        System.out.println("String formatada: \"" + resultado + "\"");
    }
}
