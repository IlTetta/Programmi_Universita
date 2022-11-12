
//Esercitazione 1 Es. 3
import prog.io.*;

class StringaAlfaNumerica1_3 {
    // converte i caratteri alfabetici in posizione pari in stampatello minuscolo e
    // quelli in posizione dispari in stampatello maiuscolo partendo da 0
    public static void main(String[] args) {
        ConsoleOutputManager out = new ConsoleOutputManager();
        ConsoleInputManager in = new ConsoleInputManager();

        String str = in.readLine("Inserisci la stringa: ");
        String ret = "";

        for (int i = 0; i < str.length(); i++) {
            String s = "" + str.charAt(i);
            if (i % 2 == 0)
                s = s.toLowerCase();
            else
                s = s.toUpperCase();

            ret = ret + s;
        }
        out.println("La stringa risultante e': " + ret);

    }
}