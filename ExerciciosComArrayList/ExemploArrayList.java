package ExerciciosComArrayList;

import java.util.ArrayList;

public class ExemploArrayList {
    public static void main(String[] args) {
        // Criando uma lista de frutas
        ArrayList<String> frutas = new ArrayList<>();

        // Adicionando elementos
        frutas.add("Maçã");
        frutas.add("Banana");
        frutas.add("Laranja");

        // Exibindo o tamanho
        System.out.println("Quantidade: " + frutas.size()); // 3

        // Acessando um elemento
        System.out.println("Primeira fruta: " + frutas.get(0)); // Maçã

        // Alterando um elemento
        frutas.set(1, "Uva");

        // Removendo um elemento
        frutas.remove(2);

        // Mostrando todos os elementos
        for (String fruta : frutas) {
            System.out.println(fruta);
        }
        // Saída:
        // Maçã
        // Uva
    }
}
