package ManipulacaoDeStrings;

public class ContagemDeVogais {
    public static void main(String[] args) {
        String frase = "O rato roeu a roupa do rei de roma";
        int contadorVogais = 0;
        String fraseMinuscula = frase.toLowerCase();

        for (int i = 0; i < frase.length(); i++) {
            char caractere = fraseMinuscula.charAt(i);

            if (caractere == 'a' || caractere == 'e' || caractere == 'i' || caractere == 'o' || caractere == 'u') {
                contadorVogais++;
            }
        }

        System.out.println("A frase é: " + frase);
        System.out.println("Número de vogais: " + contadorVogais);
    }
}
