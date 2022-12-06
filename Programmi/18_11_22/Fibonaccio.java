public class Fibonaccio {
    public static int serie(int n) {
        if (n == 1 || n == 2)
            return 1;
        else {
            int f1 = serie(n - 1);
            int f2 = serie(n - 2);
            int ris = f1 + f2;
            return ris;
        }

    }

}
