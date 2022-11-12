package concessionaria;

public class Suv extends Auto {

    private boolean is4x4;
    private boolean ruotePerIlFango;

    public Suv(String nome, int numPorte, boolean is4x4, boolean ruotePerIlFango) {
        super(nome, numPorte);
        this.is4x4 = is4x4;
        this.ruotePerIlFango = ruotePerIlFango;
    }

    @Override
    public String toString() {
        String str = super.toString();
        str += " - Suv " + (is4x4 ? "4x4" : "");
        str += (ruotePerIlFango ? " con ruote per il fango" : "");
        return str;
    }
}