//Esercizio 3.7 slide 90

import prog.io.*;

class EsercizioStringa {

    public static void main(String[] args) {

        ConsoleInputManager in = new ConsoleInputManager();
        ConsoleOutputManager out = new ConsoleOutputManager();

        String Str1 = in.readLine("Inserisci la prima parola: "), Str2 = in.readLine("Insersici la seconda parola: ");
        int a = Str1.compareTo(Str2), Lung1 = Str1.length(), Lung2 = Str2.length();
        if (a < 0) {
            out.println("Le due stringhe sono diverse");
            out.println("Ordine alfabetico: " + "\n" + Str1 + "\n" + Str2);

        }

        else if (a > 0) {
            out.println("Le due stringhe sono diverse");
            out.println("Ordine alfabetico: " + "\n" + Str2 + "\n" + Str1);
        } else
            out.println("Le due stringhe sono uguali");
        if (Lung1 < Lung2)
            out.println("Ordine di lunghezza: " + "\n" + Str2 + "\n" + Str1);
        else if (Lung1 > Lung2)
            out.println("Ordine di lunghezza: " + "\n" + Str1 + "\n" + Str2);
        else
            out.println("Le due stringhe hanno la stessa lunghezza");
    }

}