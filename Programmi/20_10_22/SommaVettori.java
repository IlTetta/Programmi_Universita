
//Somma di vettori
import prog.io.*;

class SommaVettori {
    public static void main(String[] args) {

        ConsoleInputManager in = new ConsoleInputManager();
        ConsoleOutputManager out = new ConsoleOutputManager();

        // Lettura lunghezza vettori
        int lunghezza = in.readInt("Lunghezza dei vettori? ");

        out.println("Lettura primo vettore");
        int[] vett1 = new int[lunghezza];
        for (int i = 0; i < vett1.length; i++)
            vett1[i] = in.readInt("Elemento " + i + "? ");

        out.println("Lettura secondo vettore");
        int[] vett2 = new int[lunghezza];
        for (int i = 0; i < vett2.length; i++)
            vett2[i] = in.readInt("Elemento " + i + "? ");

        // Clacolo il vettore somma
        int[] somma = new int[lunghezza];
        for (int i = 0; i < somma.length; i++)
            somma[i] = vett1[i] + vett2[i];

        // Stringhe che rappresentano i vettori
        String strVett1 = "";
        for (int i = 0; i < vett1.length; i++)
            strVett1 += vett1[i] + (i < vett1.length - 1 ? " " : "");

        String strVett2 = "";
        for (int i = 0; i < vett2.length; i++)
            strVett2 += vett2[i] + (i < vett2.length - 1 ? " " : "");

        String strSomma = "";
        for (int i = 0; i < somma.length; i++)
            strSomma += somma[i] + (i < somma.length - 1 ? " " : "");

        out.println("Vettore 1: [" + strVett1 + "]");
        out.println("Vettore 2: [" + strVett2 + "]");
        out.println("Vettore 3: [" + strSomma + "]");

    }
}