//Esercizio 1.9

import prog.io.*;

class E1_9 {
    public static void main(String[] args) {

        ConsoleInputManager in = new ConsoleInputManager();
        ConsoleOutputManager out = new ConsoleOutputManager();
        // int a,b=1;
        // do {
        // out.println("Inserisci un numero ");
        // a = in.readInt();
        // out.println("Il numero inserito e': " + a);
        // b *= a;
        // } while (a != 0);
        // out.println("\n" + "Siccome il numero inserito e' " + a + ": interruzione del
        // ciclo");

        int a;
        int max = in.readInt("Quanti numeri vuoi inserire? ");
        int i;
        int b = 1;

        for (i = 0; i < max; i++) {

            a = in.readInt("Inserisci un numero ");
            out.println("Il numero inserito e': " + a);
            if (a == 0) {
                out.print("sei fuori");
                break;
            }
            b *= a;
        }
        out.print("il prodotto dei numeri e' " + b);

    }
}
