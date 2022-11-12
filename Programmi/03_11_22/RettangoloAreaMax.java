// Scrivere un'applicazione per determinare il rettangolo con area maggiore in una sequenza di rettangoli forniti da tastiera
//implementato con la classe Quadrato

import prog.io.*;
import prog.utili.Rettangolo;
import prog.utili.Quadrato;

class RettangoloAreaMax {

    public static void main(String[] args) {

        ConsoleInputManager in = new ConsoleInputManager();
        ConsoleOutputManager out = new ConsoleOutputManager();

        Rettangolo rAreaMax = null;
        boolean continuare;

        do {
            // Leggi i dati di un rettangolo
            Rettangolo r = leggiRettangolo(in, out);

            // Confronta il rettangolo con quello di area maggiore
            if (rAreaMax == null || r.haAreaMaggiore(rAreaMax))
                rAreaMax = r;

            continuare = in.readSiNo("Voui inserire i dati di un altro rettangolo? (s/n) ");
        } while (continuare);

        // Comunica le caratteristiche del rettangolo di area maggiore
        out.print("La figura di area maggiore e' un ");
        if (rAreaMax instanceof Quadrato)
            out.println("quadrato: ");
        else
            out.println("rettangolo: ");
        out.println("  " + rAreaMax.toString());
        out.println("  area= " + rAreaMax.getArea() + ", perimetro= " + rAreaMax.getPerimetro());
    }

    private static Rettangolo leggiRettangolo(ConsoleInputManager in, ConsoleOutputManager out) {

        // Leggi i dati del rettangolo
        out.println("Inserisci i dati di un rettangolo:");
        double x = in.readDouble(" - base? "), y = in.readDouble(" - altezza");

        while (x < 0 || y < 0) {
            out.println("I dati inseriti non rappresentano un rettangolo.");
            out.println("Inserisci i  dati di un rettangolo:");
            x = in.readDouble(" - base? ");
            y = in.readDouble(" - altezza? ");
        }

        Rettangolo r;
        if (x == y) {
            r = new Quadrato(x);
            out.println("La figura e' un quadrato:");
        } else {
            r = new Rettangolo(x, y);
            out.println("La figura e' un rettangolo:");
        }
        out.println("  " + r.toString());
        out.println("  area= " + r.getArea() + ", perimetro= " + r.getPerimetro());
        out.println();
        return r;
    }
}
