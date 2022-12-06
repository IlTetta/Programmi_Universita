package animali;

public class Mammal extends Animal {

    private int numGAllattamento;

    public Mammal(String specie, int numGAllattamento) {
        super(specie);
        this.numGAllattamento = numGAllattamento;
    }

    @Override
    public String toString() {
        String str = getSpecie();
        return str + ": ha allattato i suoi piccoli per " + numGAllattamento + " giorni";
    }
}
