package concessionaria;

public class Sedan extends Auto {

    private boolean stationVagon;

    public Sedan(String nome, int numPorte, boolean stationVagon) {
        super(nome, numPorte);
        this.stationVagon = stationVagon;
    }

    @Override
    public String toString() {
        String str = super.toString();
        str += " - Sedan " + (stationVagon ? "Station Vagon" : "");
        return str;
    }
}