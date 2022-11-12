
//Esercitazione 2 Es. 4
import prog.io.*;
import prog.utili.Sequenza;

class SequenzaUnivoca2_3 {
    public static void main(String[] args) {
        ConsoleInputManager in = new ConsoleInputManager();
        ConsoleOutputManager out = new ConsoleOutputManager();

        Sequenza<Integer> sequenza = creaSequenza(in);
        stampaSequenza(out, sequenza);

        Sequenza<Integer> sequenzaUnivoca = rimuoviDoppioni(sequenza);
        stampaSequenza(out, sequenzaUnivoca);
    }

    public static Sequenza<Integer> creaSequenza(ConsoleInputManager in) {
        Sequenza<Integer> sequenza = new Sequenza<Integer>();
        int n = 0;
        do {
            n = in.readInt("Inserisci un numero (0 per terminare): ");
            if (n != 0)
                sequenza.add(n);

        } while (n != 0);
        return sequenza;
    }

    public static void stampaSequenza(ConsoleOutputManager out, Sequenza<Integer> sequenza) {
        out.println("La sequenza e': " + sequenza.toString());
    }

    public static Sequenza<Integer> rimuoviDoppioni(Sequenza<Integer> sequenza) {
        Sequenza<Integer> sequenzaUnivoca = new Sequenza<Integer>();
        for (Integer integer : sequenza) {
            if (!sequenzaUnivoca.contains(integer)) {
                sequenzaUnivoca.add(integer);
            }
        }
        return sequenzaUnivoca;
    }
}