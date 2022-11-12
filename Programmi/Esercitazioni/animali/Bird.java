package animali;

public class Bird extends Animal {

    private int numUova;
    private String piumaggio;

    public Bird(String specie, int numUova, String piumaggio) {
        super(specie);
        this.numUova = numUova;
        this.piumaggio = piumaggio;
    }

    @Override
    public String toString() {
        String str = getSpecie();
        return str + ": colore piume: " + piumaggio + ", ha deposto " + numUova + " uova";

    }
}
