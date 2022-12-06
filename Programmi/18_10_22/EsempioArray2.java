import prog.io.*;

class EsempioArray2 {
    public static void main(String[] args) {

        // Canali di comunicazione
        ConsoleOutputManager out = new ConsoleOutputManager();
        ConsoleInputManager in = new ConsoleInputManager();

        int N = in.readInt("Dimensione dell'array? ");
        double[] a = new double[N]; // Dichiaro array a
        // a = new double[N]; // Creo l'array a

        for (int i = 0; i < N; i++)
            a[i] = Math.random(); // Inizializzo con numeri random

        for (int i = 0; i < N; i++)
            out.println(a[i]);
        // Trovo il massimo
        double max = Double.NEGATIVE_INFINITY; // numero negativo minore che riesce a rappresentare java
        for (int i = 0; i < N; i++)
            if (a[i] > max)
                max = a[i];
        out.println("max " + max);
        // calcolo della media

        double somma = 0.0;
        for (int i = 0; i < N; i++)
            somma += a[i];

        double media = somma / N;
        out.println("media " + media);

        // Creare vettore inverso
        double[] b = new double[N];
        for (int i = 0; i < N; i++)
            b[N - i - 1] = a[i];
        out.println("Array inverso: ");
        for (int i = 0; i < N; i++)
            out.println(b[i]);

    }
}
