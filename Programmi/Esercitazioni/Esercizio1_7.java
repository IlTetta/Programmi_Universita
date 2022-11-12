
//Esercitazione 1 Es. 7
import prog.io.*;

class Esercizio1_7 {
    public static void main(String[] args) {
        ConsoleInputManager in = new ConsoleInputManager();
        ConsoleOutputManager out = new ConsoleOutputManager();
        int x = in.readInt();
        // for(int i=10; i>=x;i++)
        for (int i = 1; i <= x; i = i + 2)
            out.println(i);

    }
}