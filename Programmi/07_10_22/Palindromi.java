//parola palindroma

import prog.io.*;

class Palindromi {

    public static void main(String[] args) {

        ConsoleInputManager in = new ConsoleInputManager();
        ConsoleOutputManager out = new ConsoleOutputManager();

        String stringa = in.readLine("Inserire la stringa da esaminare ");

        // String output;
        boolean palindroma = true;
        int lung = stringa.length();

        for (int i = 0; i < lung && palindroma == true; i = i + 1)
            if (stringa.charAt(i) != stringa.charAt(lung - i - 1))
                palindroma = false;

        if (palindroma)
            out.println("La stringa " + stringa + " e' palindroma");
        else
            out.println("La stringa " + stringa + " non e' palindroma");

    }
}