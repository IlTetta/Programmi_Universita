package concessionaria;

public class Moto extends Veicolo {

    private boolean isCross;

    public Moto(String nome, boolean isCross) {
        super(nome);
        this.isCross = isCross;
    }

    @Override
    public String toString() {
        String str = getNome();
        str += " - Moto " + (isCross ? "Cross" : "");
        return str;
    }
}