package ManipulacaoDeStrings;

public class MetodosStartsEndsWith {
    public static void main(String[] args) {
        //startsWith() e endsWith(): Verificam se a string começa ou termina com uma substring específica.

        String arquivo = "documento.pdf";
        System.out.println(arquivo.startsWith("arquivo"));
        System.out.println(arquivo.endsWith(".pdf"));
    }
}
