
//Esercitazione 2 Es. 5
import prog.io.*;

class ArrayStringaUnivoca2_5 {

    public static void main(String[] args) {

        ConsoleInputManager in = new ConsoleInputManager();
        ConsoleOutputManager out = new ConsoleOutputManager();

        String frase = inserisciStringa(in);
        String[] fraseArray = stringToArray(frase);
        int duplicazioni = rimuoviDuplicati(fraseArray);
        if (duplicazioni > 0) {
            out.println("La stringa senza duplicati e': " + ricostruisciStringa(fraseArray));
        } else {
            out.println("Il testo inserito non contiene parole duplicate.");
        }
    }

    public static String inserisciStringa(ConsoleInputManager in) {
        String frase = "";
        do {
            frase = in.readLine("Inserisci stringa: ");
        } while (frase.equals(""));
        return frase;
    }

    public static String[] stringToArray(String frase) {
        // Il metodo split() della classe String permetto di suddividere una stringa in
        // base ad una espressione regolare come spazio, virgola, punto, ecc.
        return frase.split(" ");
    }

    public static int rimuoviDuplicati(String[] frase) {
        int count = 0;
        for (int i = 0; i < frase.length; i++) {
            for (int j = i + 1; j < frase.length; j++) {
                if (frase[i].equals(frase[j])) {
                    frase[j] = "";
                    count++;
                }
            }
        }
        return count;
    }

    public static String ricostruisciStringa(String[] frase) {
        String risultato = "";
        for (int i = 0; i < frase.length; i++) {
            if (!frase[i].equals("")) {
                risultato = risultato + frase[i] + " ";
            }
        }
        return risultato;

    }
}