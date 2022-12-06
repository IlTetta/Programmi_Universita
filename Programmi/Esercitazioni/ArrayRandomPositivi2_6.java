
//Esercitazione 2 Es. 6
import prog.io.*;
import java.util.Random;

class ArrayRandomPositivi2_6 {

    public static void main(String[] args) {
        ConsoleInputManager in = new ConsoleInputManager();
        ConsoleOutputManager out = new ConsoleOutputManager();

        // Leggiamo i valori richiesti
        int dimensione = in.readInt("Inserisci la dimensione dell'array > ");
        int valoreMax = in.readInt("Inserisci il valore massimo da generare > ");

        // Costruiamo un generatore di numeri random
        Random generatore = new Random();

        // Costruiamo l'array
        int[] array = new int[dimensione];

        // Inizializiamo le posizioni dell'array
        for (int i = 0; i < array.length; i++) {
            array[i] = generatore.nextInt(valoreMax);
        }

        // Stampiamo l'array
        String risultato = "";
        String separatore = ",";

        // Costruiamo la stringa risultato
        for (int i = 0; i < array.length; i++) {
            risultato += array[i] + (i < array.length - 1 ? separatore : "");
        }
        out.println("[" + risultato + "]");
    }
}
