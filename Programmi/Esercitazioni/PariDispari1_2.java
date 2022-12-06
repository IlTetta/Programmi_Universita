
//Esercitazione 1 Es. 2
import prog.io.*;

class PariDispari1_2 {
    public static void main(String[] args) {
        ConsoleOutputManager out = new ConsoleOutputManager();
        ConsoleInputManager in = new ConsoleInputManager();

        int num = in.readInt("Inserisci un numero: ");
        if (num % 2 == 0)
            out.println("Il numero " + num + " e' pari");
        else
            out.println("Il numero " + num + " e' dipari");

    }
}