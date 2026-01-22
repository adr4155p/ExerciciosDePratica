package POO.heranca;

public class Cachorro extends Animal {

    @Override
    void emitirSom() {
        System.out.println(nome + " está emitindo um som");
    }
    public void abanarRabo() {
        System.out.println(nome + " está Abanando o rabo");
    }
}
