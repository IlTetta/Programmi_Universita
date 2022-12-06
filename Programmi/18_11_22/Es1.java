import prog.io.*;

public class Es1 {
    public static void main(String[] args) {
        ConsoleInputManager in = new ConsoleInputManager();
        String str = in.readLine("Inserisci una stringa");
        int lc = maxLettereConsecutive(str);
        System.out.println("La stringa insertia ha " + lc + " lettere consecutive");
        ;

    }

    public static int maxLettereConsecutive(String s) {
        int a = 0, b = 0;
        char c;

        for (int i = 0; i < s.length(); i++) {
            c = s.charAt(i);
            if (Character.isLetter(c) && (c + 1) != 032)
                a += 1;

        }
        return a;
    }
}