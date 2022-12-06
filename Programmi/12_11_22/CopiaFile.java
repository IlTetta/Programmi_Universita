import prog.io.*;
import java.io.*;

public class CopiaFile {
    public static void main(String[] args) throws IOException {
        if (args.length == 2) {
            FileReader frd = new FileReader(args[0]);
            FileWriter fwr = new FileWriter(args[1]);

            int i;
            while ((i = frd.read()) != -1)
                fwr.write(i);

            // flush (forzare la scrittura immediata del file) e chisusra di stream per
            // lettura e scrittura
            fwr.flush();
            fwr.close();
            frd.close();
        } else {
            ConsoleOutputManager out = new ConsoleOutputManager();
            out.print("Uso: java CopiaFile <file_da_copiare> <file_copia>");
        }
    }
}
