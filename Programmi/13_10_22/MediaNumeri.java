import prog.io.*;

class MediaNumeri {

    public static void main(String[] args) {

        ConsoleInputManager in = new ConsoleInputManager();
        ConsoleOutputManager out = new ConsoleOutputManager();

        int x, y, z;
        // se inizializzo media come int ho due soluzioni: scrive il denominatore come
        // 3.0 o castare double prima della somma
        double media;

        x = in.readInt("Inserisci il primo numero ");
        y = in.readInt("Inserisci il secondo numero ");
        z = in.readInt("Inserisci il terzo numero ");
        // java se vede che le operazioni sono con variabili int da il risultato in int
        // e non
        // va bene, quindi bisgona comunque invertire in double
        media = (double) (x + y + z) / 3;
        out.println("La media e': " + media);

    }

}