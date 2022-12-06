//Pappagallo con memoria

import prog.io.*;
import prog.utili.Sequenza;

class PappMem {
    public static void main(String[] args) {

        ConsoleInputManager in = new ConsoleInputManager();
        ConsoleOutputManager out = new ConsoleOutputManager();
        // Predisposizione della memoria
        Sequenza<String> memo = new Sequenza<String>();

        // Fase di lettura
        String s = in.readLine();
        while (!s.equals("")) {
            memo.add(s);
            s = in.readLine();
        }

        // Fase di scirttura
        for (String x : memo)
            out.println(x);

    }
}