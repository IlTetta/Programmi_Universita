
//Sequenza Frazioni
import prog.io.*;
import prog.utili.Frazione;

class SequenzaFrazioni {
    public static void main(String[] args) {

        // Canali di comunicazione
        ConsoleInputManager in = new ConsoleInputManager();
        ConsoleOutputManager out = new ConsoleOutputManager();

        final int MAX = 10;
        Frazione[] frazioni = new Frazione[MAX];

        // Fase lettura
        for (int pos = 0; pos < MAX; pos++) {
            out.println("Lettura della frazione " + (pos + 1));
            int num = in.readInt("Numeratore? ");
            int den = in.readInt("Denominatore? ");
            frazioni[pos]=new Frazione (num,den);
        }
        // Fase di scrittura
        for (int pos = 0; pos < frazioni.length; pos++)
            out.println(frazioni[pos].toString());

    }
}