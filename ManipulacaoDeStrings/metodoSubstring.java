package ManipulacaoDeStrings;

public class metodoSubstring {
    public static void main(String[] args) {
        //Para obter uma parte da string, usamos o metodo substring(int beginIndex, int endIndex) ou substring(int beginIndex).

        String texto = "Programação";
        System.out.println(texto.substring(0, 4));
        System.out.println(texto.substring(4));
    }
}
