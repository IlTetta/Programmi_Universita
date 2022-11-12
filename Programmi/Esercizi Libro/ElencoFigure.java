//Leggere i dati relativi a una sequenza di figure (rettangoli, quadrati e cerchi) e nel produrre un
// elenco di tutte le figure inserite, suddiviso per tipi.

import prog.io.*;
import prog.utili.*;

class ElencoFigure {
    public static void main(String[] args) {

        // predisposizione dei canali di comunicazione
        ConsoleInputManager in = new ConsoleInputManager();
        ConsoleOutputManager out = new ConsoleOutputManager();

        Sequenza<Figura> figure = new Sequenza<Figura>();

        do {
            // Leggi i dati di una gifura e inseriscila nella sequenza
            Figura r = leggiFigura(in, out);
            figure.add(r);
        } while (in.readSiNo("Voui inserire i dati di un'altra figura? (s/n) "));

        // Elenco dei cerchi inseriti
        out.print("\n*** ELENCO DEI CERCHI ***");
        for (Figura f : figure)
            if (f instanceof Cerchio)
                out.println(f.toString());
        out.println();

        // Elenco dei quadrati inseriti
        out.print("\n*** ELENCO DEI QUADRATI ***");
        for (Figura f : figure)
            if (f instanceof Quadrato)
                out.println(f.toString());
        out.println();

        // Elenco dei rettangoli inseriti
        out.print("\n*** ELENCO DEI RETTANGOLLI ***");
        for (Figura f : figure)
            if (f instanceof Rettangolo && !(f instanceof Quadrato))
                out.println(f.toString());
        out.println();
    }

    private static Figura leggiFigura(ConsoleInputManager in, ConsoleOutputManager out) {
        Figura r = null;

        do {
            // scelta della figura
            out.println("   Scegli la figura da inserire: ");
            out.println();
            out.println(" r Inserimento di un rettangolo");
            out.println(" q Inserimento di un quadrato");
            out.println(" c Inserimento di un cerchio");
            out.println();
            char scelta = in.readChar("   Scelta? ");
            out.println("");

            // leggi i dati di una figura del tipo selezionato
            switch (scelta) {
                case 'r':
                    out.println("Inserimento di un rettangolo:");
                    double x = in.readDouble(" - base? "), y = in.readDouble(" - altezza? ");
                    if (x < 0 || y < 0)
                        out.println("I dati isneriti non rappresentano un rettangolo");
                    else
                        r = x == y ? new Quadrato(x) : new Rettangolo(x, y);
                    break;
                case 'q':
                    out.println("Inserimento di un quadrato:");
                    x = in.readDouble(" - lato? ");
                    if (x < 0)
                        out.println("Attenzione: il lato di un quadrato non puo' essere negativo!");
                    else
                        r = new Quadrato(x);
                    break;
                case 'c':
                    out.println("Inserimento di un cerchio:");
                    x = in.readDouble(" - raggio? ");
                    if (x < 0)
                        out.println("Attenzione: il raggio di un cerchio non puo' essere negativo!");
                    else
                        r = new Cerchio(x);
                    break;

                default:
                    out.println("   Scelta non valida\n\n");
                    break;
            }

        } while (r == null);

        // visualizza le caratteristiche della figura letta
        out.println("   " + r.toString());
        out.println("   area = " + r.getArea() + ", perimetro = " + r.getPerimetro());
        out.println();

        return r;

    }
}