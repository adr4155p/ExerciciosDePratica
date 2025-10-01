package ManipulacaoDeStrings;

public class MetodoSplit {
    public static void main(String[] args) {
        //split(): Divide a string em um array de strings com base em um delimitador.

        String frase = "Java é muito legal";
        String[] palavras = frase.split(" ");
        for (String palavra : palavras) {
            System.out.println(palavra);
        }
    }
}
