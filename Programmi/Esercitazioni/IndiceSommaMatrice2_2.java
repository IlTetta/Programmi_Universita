
//Esercitazione 2 Es. 2
import prog.io.*;

class IndiceSommaMatrice2_2 {
    public static void main(String[] args) {
        ConsoleInputManager in = new ConsoleInputManager();
        ConsoleOutputManager out = new ConsoleOutputManager();

        int N = in.readInt("numero di righe ");
        int M = in.readInt("numero di colonne ");
        int[][] matrice = inserisciMatrice(in, N, M);

        getIndiceSommaMax(out, matrice);
    }

    public static int[][] inserisciMatrice(ConsoleInputManager in, int x, int y) {
        int[][] matrice = new int[x][y];
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                matrice[i][j] = in.readInt("Inserisci elemento in posizione " + "[" + i + "," + j + "]" + ": ");

            }
        }
        return matrice;
    }

    public static void stampaMatrice(ConsoleOutputManager out, int[][] matrice) {
        for (int i = 0; i < matrice.length; i++) {
            for (int j = 0; j < matrice[i].length; j++) {
                out.print(matrice[i][j] + " ");
            }
            out.println();
        }
    }

    public static void getIndiceSommaMax(ConsoleOutputManager out, int[][] matrice) {
        int maxRiga = -1000000;
        int indiceRiga = 0;
        for (int i = 0; i < matrice.length; i++) {
            int somma = 0;
            for (int j = 0; j < matrice[i].length; j++) {
                somma += matrice[i][j];
            }
            if (somma > maxRiga) {
                maxRiga = somma;
                indiceRiga = i + 1;
            }
        }
        out.println("La somma piu' alta e': " + maxRiga + " in posizione " + indiceRiga + " (Riga).");

        int maxColonna = -1000000;
        for (int i = 0; i < matrice.length; i++) {
            int somma = 0;
            for (int j = 0; j < matrice[i].length; j++) {
                somma += matrice[j][i];
            }
            if (somma > maxColonna) {
                maxColonna = somma;
                indiceRiga = i + 1;
            }
        }
        out.println("La somma piu' alta e': " + maxColonna + " in posizione " + indiceRiga + " (Colonna).");

    }
}