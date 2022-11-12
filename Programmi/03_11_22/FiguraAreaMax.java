//Si scriva un’applicazione per determinare la figura con area maggiore in una
// sequenza di rettangoli, quadrati e cerchi fornita da tastiera.

import prog.io.*;
import prog.utili.*;

class FiguraAreaMax {

    public static void main(String[] args) {

        ConsoleInputManager in = new ConsoleInputManager();
        ConsoleOutputManager out = new ConsoleOutputManager();

        Figura fAreaMax = null;
        boolean continuare;

        do {
            // Leggi i dati di un rettangolo
            Figura f = leggiFigura(in, out);

            // Confronta il rettangolo con quello di area maggiore
            if (fAreaMax == null || f.haAreaMaggiore(fAreaMax))
                fAreaMax = f;

            continuare = in.readSiNo("Voui inserire i dati di un'altra figura? (s/n) ");
        } while (continuare);

        // Comunica le caratteristiche del rettangolo di area maggiore
        out.print("La figura di area maggiore e' un ");
        if (fAreaMax instanceof Quadrato)
            out.println("quadrato: ");
        else if (fAreaMax instanceof Rettangolo)
            out.println("rettangolo: ");
        else
            out.println("cerchio: ");

        out.println("  " + fAreaMax.toString());
        out.println("  area= " + fAreaMax.getArea() + ", perimetro= " + fAreaMax.getPerimetro());
    }

    private static Figura leggiFigura(ConsoleInputManager in, ConsoleOutputManager out) {

        // Leggi i dati della figura
        boolean figura = in.readSiNo("La figura che vuoi costruire e' un rettangolo? (s/n) ");
        while (figura) {
            out.println("Inserisci i dati di un rettangolo:");
            double x = in.readDouble(" - base? "), y = in.readDouble(" - altezza");

            while (x < 0 || y < 0) {
                out.println("I dati inseriti non rappresentano un rettangolo.");
                out.println("Inserisci i  dati di un rettangolo:");
                x = in.readDouble(" - base? ");
                y = in.readDouble(" - altezza? ");
            }

            Figura f;
            if (x == y) {
                f = new Quadrato(x);
                out.println("La figura e' un quadrato:");
            } else {
                f = new Rettangolo(x, y);
                out.println("La figura e' un rettangolo:");
            }
            out.println("  " + f.toString());
            out.println("  area= " + f.getArea() + ", perimetro= " + f.getPerimetro());
            out.println();
            return f;

        }

        out.println("Inserisci i dati di un cerchio:");
        double z = in.readDouble(" - raggio? ");
        while (z < 0) {
            out.println("I dati inseriti non rappresentano un cerchio.");
            out.println("Inserisci i  dati di un cerchio:");
            z = in.readDouble(" - raggio? ");
        }

        Figura f = new Cerchio(z);
        out.println("La figura e' un cerchio: ");
        out.println("  " + f.toString());
        out.println("  area= " + f.getArea() + ", perimetro= " + f.getPerimetro());
        out.println();
        return f;
    }
}
