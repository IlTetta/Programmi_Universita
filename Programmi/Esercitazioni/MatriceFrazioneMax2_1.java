
//Esercitazione 2 Es. 1
import prog.io.*;
import prog.utili.Frazione;

class MatriceFrazioneMax2_1 {
    public static void main(String[] args) {
        ConsoleInputManager in = new ConsoleInputManager();
        ConsoleOutputManager out = new ConsoleOutputManager();

        int N = in.readInt("numero di righe");
        int M = in.readInt("numero di colonne");
        Frazione[][] matrice = inserisciMatrice(in, N, M);
        stampaMatrice(out, matrice);

        Frazione maggiore = getMax(matrice);
        out.println("La frazione piu' grande inserita e':" + maggiore);
    }

    public static Frazione[][] inserisciMatrice(ConsoleInputManager in, int x, int y) {
        Frazione[][] matrice = new Frazione[x][y];
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                int numeratore = in.readInt("Inserisci numeratore posizione  " + i + ": ");
                int denominatore = in.readInt("Inserisci denominatore posizione  " + j + ": ");
                matrice[i][j] = new Frazione(numeratore, denominatore);
            }
        }
        return matrice;
    }

    public static void stampaMatrice(ConsoleOutputManager out, Frazione[][] matrice) {
        for (int i = 0; i < matrice.length; i++) {
            for (int j = 0; j < matrice[i].length; j++) {
                out.print(matrice[i][j] + " ");
            }
            out.println("");
        }

    }

    public static Frazione getMax(Frazione[][] matrice) {
        Frazione max = matrice[0][0];
        for (int i = 0; i < matrice.length; i++) {
            for (int j = 0; j < matrice[i].length; j++) {
                if (matrice[i][j].isMaggiore(max)) {
                    max = matrice[i][j];
                }
            }
        }
        return max;
    }
}