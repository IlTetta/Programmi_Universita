
//Esercitazione 2 Es. 3
import prog.io.*;
import prog.utili.Sequenza;
import prog.utili.SequenzaOrdinata;

class OrdinaSequenza2_3 {

    public static void main(String[] args) {
        Sequenza<Integer> sequenzaNumeri = creaSequenza();
        stampaSequenza(ordinaSequenzaNumeri(sequenzaNumeri));
    }

    public static Sequenza<Integer> creaSequenza() {
        ConsoleInputManager in = new ConsoleInputManager();
        Sequenza<Integer> sequenzaNumeri = new Sequenza<Integer>();
        Integer numero = 0;
        do {
            numero = in.readInt("Inserisci un numero (0 per terminare): ");
            sequenzaNumeri.add(numero);
        } while (numero != 0);
        sequenzaNumeri.remove(0);
        return sequenzaNumeri;
    }

    public static Sequenza<Integer> ordinaSequenzaNumeri(Sequenza<Integer> sequenzaNumeri) {
        return SequenzaOrdinata.fromSequenza(sequenzaNumeri);
    }

    public static void stampaSequenza(Sequenza<Integer> sequenzaNumeri) {
        ConsoleOutputManager out = new ConsoleOutputManager();
        if (!sequenzaNumeri.isEmpty()) {
            out.println("La sequenza ordinata e': ");
            for (Integer n : sequenzaNumeri) {
                out.println(n);
            }
        } else {
            out.println("La sequenza e' vuota");
        }
    }

}
