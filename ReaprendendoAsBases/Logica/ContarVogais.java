package ReaprendendoAsBases.Logica;

public class ContarVogais {
    public static void main(String[] args) {
        String texto = "banana";
        int vogais = 0;

        for (int i = 0; i < texto.length(); i++) {
            if (texto.charAt(i) == 'a'|| texto.charAt(i) == 'e' || texto.charAt(i) == 'i' || texto.charAt(i) == 'o' || texto.charAt(i) =='u') {
                vogais++;
            }
        }
        System.out.println(vogais);
    }
}
