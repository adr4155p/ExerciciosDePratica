package POO.heranca;

public class VeiculoTest {
    public static void main(String[] args) {

        Carro carro = new Carro();
        carro.marca = "Fiat";
        carro.ano = 2020;

        carro.ligar();
        carro.acelerar();
    }
}
