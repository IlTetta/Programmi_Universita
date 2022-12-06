
public class Importo {

    // campi
    private int importInt;
    private int importDec;

    // costruttori
    public Importo(int intero, int centesimi) {
        importInt = intero;
        importDec = centesimi;
    }

    // metodi
    public boolean equals(Importo altro) {
        return this.importInt == altro.importInt && this.importDec == altro.importDec;
    }

    public boolean isMinore(Importo altro) {
        return this.importInt < altro.importInt
                || (this.importInt == altro.importInt && this.importDec < altro.importDec);
    }

    public boolean isMaggiore(Importo altro) {
        return this.importInt > altro.importInt
                || (this.importInt == altro.importInt && this.importDec > altro.importDec);
    }

    public int getEuro() {
        return this.importInt;
    }

    public int getCent() {
        return this.importDec;
    }

    public String toString() {
        String stringCent = (importDec == 0 ? "0" : "") + importDec;
        return importInt + "," + stringCent;
    }

    // public String toLetterString() {
    // String stringCent = (importDec == 0 ? "0" : "") + importDec;

    // }

}
