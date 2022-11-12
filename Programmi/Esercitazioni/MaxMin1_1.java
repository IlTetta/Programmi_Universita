
//Esercitazione 1 Es. 1
import prog.io.*;

class MaxMin1_1 {
    public static void main(String[] args) {
        ConsoleOutputManager out = new ConsoleOutputManager();
        ConsoleInputManager in = new ConsoleInputManager();

        int num1 = in.readInt("Inserisci il primo numero: ");
        int num2 = in.readInt("Inserisci il secondo numero: ");

        if (num1 > num2) {
            out.println("Il numero piu' grande e': " + num1);
            out.println("Il numero piu' piccolo e': " + num2);
        } else {
            out.println("Il numero piu' grande e': " + num2);
            out.println("Il numero piu' piccolo e': " + num1);

        }

    }
}