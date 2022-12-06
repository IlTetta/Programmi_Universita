package concessionaria;

public class Auto extends Veicolo {

    private int numPorte;

    public Auto(String nome, int numPorte) {
        super(nome);
        this.numPorte = numPorte;
    }

    @Override
    public String toString() {
        String str = getNome();
        return str + " - Auto " + numPorte + " porte";
    }
}