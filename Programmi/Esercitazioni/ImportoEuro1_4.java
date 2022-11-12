
//Esercitazione 1 Es. 4
import prog.io.*;
import prog.utili.*;

class ImportoEuro1_4 {
    public static void main(String[] args) {

        ConsoleInputManager in = new ConsoleInputManager();
        ConsoleOutputManager out = new ConsoleOutputManager();

        int x = in.readInt("Prezzo: euro?"), y = in.readInt("Cent? "), sconto = in.readInt("Sconto precentuale? ");

        Importo I1 = new Importo(x, y), I2 = I1.per(sconto), I3 = I2.diviso(100);
        Importo IFinale = I1.meno(I3);
        int IFinale_Lire = IFinale.toLire();

        out.println("Prezzo: EURO " + I1.toString());
        out.println("Sconto: EURO " + I3.toString());
        out.println("Prezzo scontato: EURO " + IFinale.toString() + " (Lire " + IFinale_Lire + ")");
    }
}