
//Sequenza Ordinata
import prog.io.*;
import prog.utili.SequenzaOrdinata;

class PappagalloOrdinato {
    public static void main(String[] args) {
        ConsoleInputManager in = new ConsoleInputManager();
        ConsoleOutputManager out = new ConsoleOutputManager();

        SequenzaOrdinata<String> memo = new SequenzaOrdinata<String>();

        String s = in.readLine("Inserisci una stringa ");
        while (!s.equals("")) {
            memo.add(s);
            s = in.readLine();
        }
        for (String x : memo)
            out.println(x);

    }
}