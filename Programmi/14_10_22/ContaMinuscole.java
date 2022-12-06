//Conta Minuscole

import prog.io.*;

class ContaMinuscole {
    public static void main(String[] args) {

        ConsoleInputManager in = new ConsoleInputManager();
        ConsoleOutputManager out = new ConsoleOutputManager();

        // Lettura della stringa
        String s = in.readLine("Inserire la stringa da esaminare: ");

        // Conteggio delle lettere minuscole
        int nMinuscole = 0;
        char c;
        for (int i = 0; i < s.length(); i++) {
            c = s.charAt(i);
            if (Character.isLowerCase(c))
                nMinuscole = nMinuscole + 1;
        }
        // Comunicazione del risultato
        out.println("La stringa " + s + " contiene ");
        out.println(nMinuscole + " lettere minuscole");

    }

}