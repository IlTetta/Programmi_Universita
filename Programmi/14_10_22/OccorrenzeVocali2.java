
//Occorrenze vocali con switch
import prog.io.*;

class OccorrenzeVocali2 {
    public static void main(String[] args) {

        ConsoleInputManager in = new ConsoleInputManager();
        ConsoleOutputManager out = new ConsoleOutputManager();

        String s = in.readLine("Inserire la stringa da esaminare ");
        int na = 0, ne = 0, ni = 0, no = 0, nu = 0;
        

        for (int i = 0; i < s.length(); i = i + 1) {
            switch (s.charAt(i)) {
                case 'a':
                case 'A':
                    na++;
                    break;
                case 'e':
                case 'E':
                    ne++;
                    break;
                case 'i':
                case 'I':
                    ni++;
                    break;
                case 'o':
                case 'O':
                    no++;
                    break;
                case 'u':
                case 'U':
                    nu++;
                    break;
            }
        }

        // comunicazione risultati
        out.println("Numero di occorrenze della vocale a: " + na);
        out.println("Numero di occorrenze della vocale e: " + ne);
        out.println("Numero di occorrenze della vocale i: " + ni);
        out.println("Numero di occorrenze della vocale o: " + no);
        out.println("Numero di occorrenze della vocale u: " + nu);

    }
}