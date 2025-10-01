package ManipulacaoDeStrings;

public class ClasseStringBuilder {
    public static void main(String[] args) {

        //Para construções mais complexas e eficientes, especialmente em laços de repetição, é recomendado usar a classe StringBuilder ou StringBuffer.

        StringBuilder sb = new StringBuilder();
        sb.append("Olá ");
        sb.append("Maria");
        String mensagem = sb.toString();
        System.out.println(mensagem);
    }
}
