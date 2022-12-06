public class Funzione {
    public static int funzione(int a, int b) {

        if (a <= 3 && b <= 3)
            return a + b;
        else
            return (funzione(a - 1, b - 1) + 2 * (funzione(b - 2, a - 2)));

    }

    public static void main(String[] args) {
        int x = 5, y = 6;
        System.out.println(funzione(x, y));
    }

}
