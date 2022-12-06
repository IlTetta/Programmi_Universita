
//Esercizio 4_19
import prog.io.*;
import prog.utili.*;

class Esercizio4_19 {
    public static void main(String[] args) {
        ConsoleInputManager in = new ConsoleInputManager();
        ConsoleOutputManager out = new ConsoleOutputManager();

        int Giorno = in.readInt("Inserisci giorno ");
        int Mese = in.readInt("Inserisci mese ");
        int Anno = in.readInt("Inserisci anno ");

        Data nascita = new Data(Giorno, Mese, Anno);
        Data oggi = new Data();

        GiornoDellaSettimana GiornoSett = nascita.getGiornoDellaSettimana();
        MeseDellAnno MeseAnno = oggi.getMeseDellAnno();

        GiornoDellaSettimana GiornoSett2 = oggi.getGiornoDellaSettimana();
        MeseDellAnno MeseAnno2 = oggi.getMeseDellAnno();

        int Giorno2 = oggi.getGiorno();
        int Anno2 = oggi.getAnno();

        int Diff = nascita.quantoManca(oggi);

        out.println("Data di nascita " + GiornoSett.toString() + " " + Giorno + " " + MeseAnno.toString() + " " + Anno);
        out.println(
                "Data di oggi " + GiornoSett2.toString() + " " + Giorno2 + " " + MeseAnno2.toString() + " " + Anno2);
        out.println("Differenza rispetto a oggi  " + Diff + " giorni");

    }
}