import prog.io.*;
import prog.utili.*;

public class StringheCorrette {
    public static void main(String[] args) {
        ConsoleInputManager in = new ConsoleInputManager();
        ConsoleOutputManager out = new ConsoleOutputManager();

        Sequenza<String> sequenza = new Sequenza<>();
        String s;
        while ((s = in.readLine()).length() > 0)
            sequenza.add(s);

        for (String str : sequenza) {
            if (corrette(str)) {
                int m = 0;
                for (int i = 0; i < str.length(); i++)
                    if (Character.isLowerCase(str.charAt(i)))
                        m++;
                out.println("...");
            }
        }

    }

    public static boolean corrette(String s) {
        for (int i = 0; i < s.length(); i++) {
            if (!Character.isLetter(s.charAt(i))) {
                return false;
            }

        }
        int M = 0, m = 0;
        for (int i = 0; i < s.length(); i++) {
            if (Character.isUpperCase(s.charAt(i)))
                M++;
            if (Character.isLowerCase(s.charAt(i)))
                m++;
        }
        return M > m;
    }
}
