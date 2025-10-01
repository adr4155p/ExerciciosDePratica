package ManipulacaoDeStrings;

public class MetodoTrim {
    public static void main(String[] args) {
        //trim(): Remove espaços em branco do início e do fim da string.

        String texto = "   exemplo com espaços   ";
        System.out.println(texto);
        System.out.println(texto.trim());
    }
}
