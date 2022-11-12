
//Esercitazione 1 Es. 9
import prog.io.*;

class Esercizio1_9 {
    public static void main(String[] args) {
          
        ConsoleOutputManager out = new ConsoleOutputManager();

        int i = 1;
        // parte 1
        // for (int i = 1; i <= 20; i = i+2)
        while (i <= 20) {
            out.println(i);
            i = i + 2;
        }

        // parte 2
        // for(int i= 10; i!=-10; i = i-2)
        while (i != -10) {
            out.println(i);
            i = i - 2;
        }

    }
}