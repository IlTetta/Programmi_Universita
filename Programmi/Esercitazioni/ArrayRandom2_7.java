
//Esercitazione 2 Es. 7
import prog.io.*;
import java.util.Random;

class ArrayRandom2_7 {

    public static void main(String[] args) {
        ConsoleInputManager in = new ConsoleInputManager();
        ConsoleOutputManager out = new ConsoleOutputManager();

        int dimensione = in.readInt("Inserisci la dimensione dell'array > ");
        int valoreMax = in.readInt("Inserisci il valore massimo da generare > ");

        Random generatore = new Random();

        int[] array = new int[dimensione];

        for (int i = 0; i < dimensione; i++) {
            boolean positivo = generatore.nextBoolean();
            int valore = generatore.nextInt(valoreMax);
            array[i] = positivo ? valore : -valore;
        }

        String risultato = "";
        String separatore = ",";

        for (int i = 0; i < array.length; i++)
            risultato += array[i] + (i < array.length - 1 ? separatore : "");

        out.println("[" + risultato + "]");

    }
}