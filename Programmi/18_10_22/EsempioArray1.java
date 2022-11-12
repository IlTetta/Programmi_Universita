import prog.io.*;

class EsempioArray1 {
    public static void main(String[] args) {

        // Canali di comunicazione
        ConsoleOutputManager out = new ConsoleOutputManager();
        String[] nomi = new String[4]; // nomi = {"","","",""}; stringhe vuote
        // Fase di scirttura
        for (int pos = 0; pos < nomi.length; pos++) {
            // Metodo .toString() non funziona su elementi null, errore in fase di
            // esecuzione
            out.println(nomi[pos].toString());

        }

    }
}