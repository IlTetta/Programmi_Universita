//Esempio classe Rettangolo

import prog.io.*;
import prog.utili.Rettangolo;

class EsempioRettangolo {
    public static void main(String[] args) {
        ConsoleInputManager in = new ConsoleInputManager();
        ConsoleOutputManager out = new ConsoleOutputManager();

        out.println("Inserire i dati del rettangolo: ");
        double b, a;
        while ((b = in.readDouble("base? ")) < 0)
            out.println("Attenzione: la base di un rettangolo non puo' essere negativa!");

        while ((a = in.readDouble("altezza? ")) < 0)
            out.println("Attenzione: l'altezza di un rettangolo non puo' essere negativa!");

        Rettangolo r = new Rettangolo(b, a);

        out.print("Rettangolo letto: ");
        out.println(r.toString());
        out.println("L'area e' " + r.getArea());
        out.println("Il perimetro e' " + r.getPerimetro());

    }
}