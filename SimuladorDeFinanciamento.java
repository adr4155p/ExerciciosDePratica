public class SimuladorDeFinanciamento {
    public static void main(String[] args) {
        double valorTotal = 30000;
        System.out.println("Valor total: R$" + valorTotal);
        System.out.println("Opções de financiamento:\n");
        for (int parcela = 1; parcela <= 100; parcela++) {
            double valorParcela = valorTotal / parcela;
            if (valorParcela > 1000){
                continue;
            }
            System.out.printf("%dX de R$%.2f\n",parcela, valorParcela);
        }
    }
}
