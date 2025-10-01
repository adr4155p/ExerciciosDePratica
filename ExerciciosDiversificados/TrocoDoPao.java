package ExerciciosDiversificados;

public class TrocoDoPao {
    public static void main(String[] args) {

        int dinheiro = 20;
        int precoDoPao = 2;
        int  quantidadeDePao = dinheiro / precoDoPao;
        int troco = dinheiro - (quantidadeDePao * 2);

        System.out.println("Quantos pães você pode comprar: " + quantidadeDePao + "\nTroco: " + troco);
    }
}