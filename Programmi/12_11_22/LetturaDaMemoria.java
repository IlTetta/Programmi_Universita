import prog.io.*;
import java.io.*;

public class LetturaDaMemoria {
    public static void main(String[] args) throws IOException {
        ConsoleOutputManager out = new ConsoleOutputManager();

        int i;
        StringReader sr = new StringReader("pippo");

        while ((i = sr.read()) != -1)
            out.print((char) i);
        sr.close();

        char[] a = { 'a', 'b', 'c' };
        CharArrayReader cr = new CharArrayReader(a);
        out.println();

        while ((i = cr.read()) != -1)
            out.print((char) i);
        cr.close();

    }

}
