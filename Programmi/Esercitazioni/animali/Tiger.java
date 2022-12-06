package animali;

public class Tiger extends Mammal {

    private String mantello;

    public Tiger(String specie, int numGAllattamento, String mantello) {
        super(specie, numGAllattamento);
        this.mantello = mantello;
    }

    @Override
    public String toString() {
        String str = super.toString();
        str += ", coloreMantello: " + mantello;
        return str;
    }
}
