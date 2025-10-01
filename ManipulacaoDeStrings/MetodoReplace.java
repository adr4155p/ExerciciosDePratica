package ManipulacaoDeStrings;

public class MetodoReplace {
    public static void main(String[] args) {
        //replace(): Substitui uma sequência de caracteres por outra.

        String texto = "Eu amo gatos";
        String novoTexto = texto.replace("gatos", "cães");
        System.out.println(texto);
        System.out.println(novoTexto);
    }
}
