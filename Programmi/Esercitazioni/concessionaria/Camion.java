package concessionaria;

public class Camion extends Veicolo {

    private int numAssi;

    public Camion(String nome, int numAssi) {
        super(nome);
        this.numAssi = numAssi;
    }

    @Override
    public String toString() {
        String str = getNome();
        str += " - Camion " + numAssi + " assi";
        return str;
    }
}