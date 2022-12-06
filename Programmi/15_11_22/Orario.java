import java.util.Calendar;
import java.util.GregorianCalendar;

public class Orario {
    // campi
    private int ore, min;

    // costruttori
    public Orario(int hh, int mm) {
        ore = hh;
        min = mm;
    }

    public Orario() {
        GregorianCalendar adesso = new GregorianCalendar();
        ore = adesso.get(Calendar.HOUR_OF_DAY);// costanti inizializzate quando viene creato l'oggetto
        min = adesso.get(Calendar.MINUTE);
    }

    public Orario(String s) {
        ore = Integer.parseInt(s.substring(0, 2));
        min = Integer.parseInt(s.substring(3, 5));
    }

    // metodi
    public boolean equals(Orario altro) {
        return this.ore == altro.ore && this.min == altro.min;
    }

    public boolean isMinore(Orario altro) {
        return ore < altro.ore || (ore == altro.ore && min < altro.min);
    }

    public boolean isMaggiore(Orario altro) {
        return ore > altro.ore || (ore == altro.ore && min > altro.min);
    }

    public int quantoManca(Orario altro) {
        return (altro.ore - ore) * 60 + altro.min - min;
    }

    public int getOre() {
        return ore;
    }

    public int getMinuti() {
        return min;
    }

    public String toString() {
        String stringMain = (min < 10 ? "0" : "") + min;
        return ore + ":" + stringMain;
    }

}