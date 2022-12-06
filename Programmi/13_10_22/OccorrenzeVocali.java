//Occorrenze vocali in una parola

import prog.io.*;

class OccorrenzeVocali {

    public static void main(String[] args) {

        ConsoleInputManager in = new ConsoleInputManager();
        ConsoleOutputManager out = new ConsoleOutputManager();

        String s = in.readLine("Inserire la stringa da esaminare ");
        int na = 0, ne = 0, ni = 0, no = 0, nu = 0;
        char c;

        for (int i = 0; i < s.length(); i = i+1) {
            c = s.charAt(i);
            if (c == 'a' || c == 'A')
                na++;
            else if (c == 'e' || c == 'E')
                ne++;
            else if (c == 'i' || c == 'I')
                ni++;
            else if (c == 'o' || c == 'O')
                no++;
            else if (c == 'u' || c == 'U')
                nu++;
        }

        // comunicazione risultati
        out.println("Numero di occorrenze della vocale a: " + na);
        out.println("Numero di occorrenze della vocale e: " + ne);
        out.println("Numero di occorrenze della vocale i: " + ni);
        out.println("Numero di occorrenze della vocale o: " + no);
        out.println("Numero di occorrenze della vocale u: " + nu);

    }

}