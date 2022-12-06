
//Matrice di interi
import prog.io.*;
import prog.utili.Frazione;

class MatriceFrazioni {
    public static void main(String[] args) {

        ConsoleInputManager in = new ConsoleInputManager();
        ConsoleOutputManager out = new ConsoleOutputManager();

        int N = in.readInt("Numero di righe? ");
        int M = in.readInt("Nunero di colonne? ");
        // Dichiaro e creo la matrice NxM ACTIVE
        Frazione[][] A = new Frazione[N][M];
        // Lettura
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                out.println("Posizione " + i + ", " + j);
                int num = in.readInt("NUmeratore ");
                int den = in.readInt("Denominatore ");
                A[i][j] = new Frazione(num, den);

            }
        }
        out.println("Stampo la matrice ");
        // A.length è la lunghezza della matrice = numero di colonne
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[i].length; j++) {
                out.print(A[i][j].toString() + "\t");
            }
            out.println();
        }
        // Trovo il massimo
        Frazione max = A[0][0];
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[i].length; j++) {
                if (A[i][j].isMaggiore(max))
                    max = A[i][j];
            }

        }
        out.println("Il massimo della matrice e' " + max.toString());

        // Trovo la media
        Frazione sum = new Frazione(0);
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[i].length; j++) {
                sum = A[i][j].piu(sum);
            }
        }
        Frazione media = sum.diviso(new Frazione(N * M));
        out.println("Media " + media.toString());

        // Matrice trasposta=inverto righe con colonne
        // Assumo matrice anche non qudrata, M e N vanno scambiate
        Frazione[][] B = new Frazione[M][N];
        for (int i = 0; i < B.length; i++) {
            for (int j = 0; j < B[i].length; j++) {
                B[i][j] = A[j][i];
            }
        }
        // Stampo matrice trasposta
        for (int i = 0; i < B.length; i++) {
            for (int j = 0; j < B[i].length; j++) {
                out.print(B[i][j].toString() + "\t");
            }
            out.println();
        }

    }

}