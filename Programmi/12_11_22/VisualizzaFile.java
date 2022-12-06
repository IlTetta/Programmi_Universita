import prog.io.*;
import java.io.FileReader;
import java.io.IOException;
import java.io.BufferedReader;

//esempio: visualizzazione di un file di caratteri

public class VisualizzaFile {
    public static void main(String[] args) throws IOException {
        ConsoleOutputManager out = new ConsoleOutputManager();
        // costruzione dello stream di caratteri
        FileReader frd = new FileReader(args[0]);
        BufferedReader bfr = new BufferedReader(frd);

        String str;

        // int i;
        // lettura e visualizzazione
        // while ((i = frd.read()) != -1)
        // out.print((char) i);
        while ((str = bfr.readLine()) != null)
            out.println(str);

        // chisura dello stream
        bfr.close();
        frd.close();

    }

}
