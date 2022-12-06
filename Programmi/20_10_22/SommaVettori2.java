
//Somma di vettori con metodi creati
import prog.io.*;

class SommaVettori2 {
    public static void main(String[] args) {

        ConsoleInputManager in = new ConsoleInputManager();
        ConsoleOutputManager out = new ConsoleOutputManager();

        // Lettura lunghezza vettori
        int lunghezza = in.readInt("Lunghezza dei vettori? ");
        // Lettura primo vettore
        out.println("Lettura primo vettore");
        int[] vett1 = leggiVettore(in, lunghezza);

        // Lettura secondo vettore
        out.println("Lettura secondo vettore");
        int[] vett2 = leggiVettore(in, lunghezza);

        // Clacolo il vettore somma
        int[] somma = new int[lunghezza];
        for (int i = 0; i < somma.length; i++)
            somma[i] = vett1[i] + vett2[i];

        // Stringhe che rappresentano i vettori
        String strVett1 = generaStringa(vett1);

        String strVett2 = generaStringa(vett2);

        String strSomma = generaStringa(somma);

        out.println("Vettore 1: [" + strVett1 + "]");
        out.println("Vettore 2: [" + strVett2 + "]");
        out.println("Vettore 3: [" + strSomma + "]");

    }

    private static String generaStringa(int[] vettore) {
        String risultato = "";
        for (int i = 0; i < vettore.length; i++)
            risultato += vettore[i] + (i < vettore.length - 1 ? "  " : "");
        return risultato;
    }

    private static int[] leggiVettore(ConsoleInputManager input, int lung) {
        int[] vettore = new int[lung];
        for (int i = 0; i < vettore.length; i++)
            vettore[i] = input.readInt("Elemento " + i + "? ");
        return vettore;
    }

}