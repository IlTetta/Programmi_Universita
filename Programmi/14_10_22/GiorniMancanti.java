//Giorni Mancanti

import prog.io.*;
import prog.utili.MeseDellAnno;
import prog.utili.Data;

class GiorniMancanti {

    public static void main(String[] args) {
        // Predisposizione dei canali di comunicazione
        ConsoleOutputManager out = new ConsoleOutputManager();

        // Costruzione della data odierna
        Data oggi = new Data();
        // Calcolo del mese
        MeseDellAnno mese = oggi.getMeseDellAnno();
        // Calcolo dei giorni del mese
        int GiorniNelMese = mese.numeroGiorni(oggi.getAnno());
        // Calcolo dei giorni mancanti alla fine del mese
        int GiorniAFineMese = GiorniNelMese - oggi.getGiorno();
        // Calcolo dei giorni mancanti alla fine dell'anno
        int GiorniAFineAnno = GiorniAFineMese;
        switch (mese.successivo()) {
            case GENNAIO:
                GiorniAFineAnno += 30;
            case FEBBRAIO:
                GiorniAFineAnno += oggi.isInAnnoBisestile() ? 29 : 28;
            case MARZO:
                GiorniAFineAnno += 31;
            case APRILE:
                GiorniAFineAnno += 30;
            case MAGGIO:
                GiorniAFineAnno += 31;
            case GIUGNO:
                GiorniAFineAnno += 30;
            case LUGLIO:
                GiorniAFineAnno += 31;
            case AGOSTO:
                GiorniAFineAnno += 31;
            case SETTEMBRE:
                GiorniAFineAnno += 30;
            case OTTOBRE:
                GiorniAFineAnno += 31;
            case NOVEMBRE:
                GiorniAFineAnno += 30;
            case DICEMBRE:
                GiorniAFineAnno += 31;
        }
        // Comunicazione dei risultati
        out.println("Mancano " + GiorniAFineMese + " giorni alla fine del mese");
        out.println("e " + GiorniAFineAnno + " alla fine dell'anno");

    }
}