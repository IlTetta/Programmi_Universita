
//Esercitazione 2 Es. 10
import prog.io.*;
import java.util.Random;

class EsMatrice2_2_10 {

    /*
     * Restituisce la matrice di int della dimensione specificata in cui
     * ogni posizione contiene un valore compreso fra -bound e
     * bound.
     */
    public static int[][] matriceIntRandom(int righe, int colonne, int bound) {

        Random ran = new Random();
        int[][] matrice = new int[righe][colonne];
        for (int i = 0; i < matrice.length; i++) {
            for (int j = 0; j < matrice[i].length; j++) {
                matrice[i][j] = ran.nextBoolean() ? ran.nextInt(bound) : -ran.nextInt(bound);
            }
        }
        return matrice;
    }

    /*
     * Restituisce la stringa che descrive la matrice spcificata come
     * argomento, i valori delle righe sono sono separati dalla stringa
     * sepColonne, le righe sono separate dalla stringa sepRighe. Il
     * metodo assume che tutti gli argomenti siano diversi da null.
     */

    public static String toString(int[][] matrice, String sepColonne, String sepRighe) {
        String str = "";
        for (int i = 0; i < matrice.length; i++) {
            String risultato = "";
            for (int j = 0; j < matrice[i].length; j++) {
                risultato += matrice[i][j] + (j < matrice[i].length - 1 ? sepColonne : "");
            }
            str += risultato + (i < matrice.length - 1 ? sepRighe : "");
        }
        return str;
    }

    /*
     * Restituisce la somma dei valori contenuti nella matrice. Il
     * metodo assume che matrice sia diverso da null.
     */

    private static int sommaValori(int[][] matrice) {
        int somma = 0;

        for (int i = 0; i < matrice.length; i++) {
            for (int j = 0; j < matrice[i].length; j++) {
                somma += matrice[i][j];
            }
        }
        return somma;
    }

    /*
     * Restituisce true se e solo se la matrice fornita come argomento è
     * quadrata. Il metodo assume che matrice sia diverso da null.
     */

    private static boolean isQuadrata(int[][] matrice) {
        for (int i = 0; i < matrice[i].length; i++)
            if (matrice.length != matrice[i].length)
                return false;
        return true;
    }

    /*
     * Restituisce l'array corrispondente alla diagonale della matrice
     * fornita come argomento. Il metodo assume che matrice sia diverso
     * da null e che faccia riferimento ad una matrice quadrata.
     */

    public static int[] diagonale(int[][] matrice) {
        int[] diagonale = new int[matrice.length];

        for (int i = 0; i < matrice.length; i++)
            diagonale[i] = matrice[i][i];
        return diagonale;
    }

    /*
     * Restituisce la stringa che descrive l'array spcificato come
     * argomento, i valori dell'array sono separati dalla stringa
     * specificata come secondo argomento. Il metodo assume che tutti
     * gli argomenti siano diversi da null.
     */

    public static String toString(int[] array, String separatore) {
        String risultato = "";

        for (int i = 0; i < array.length; i++) {
            risultato += array[i] + (i < array.length - 1 ? separatore : "");
        }
        return risultato;
    }

    public static void main(String[] args) {
        ConsoleOutputManager out = new ConsoleOutputManager();

        Random generatore = new Random();
        final int RIGHE = generatore.nextInt(5) + 1, COLONNE = generatore.nextInt(5) + 1, BOUND = 10;

        int[][] matrice = matriceIntRandom(RIGHE, COLONNE, BOUND);

        out.println("== Matrice genrata");
        out.println(toString(matrice, ",", "\n"));
        out.println("La somma dei valori contenuti nella matrice e' " + sommaValori(matrice));

        boolean isQuadrata = isQuadrata(matrice);
        out.println("La matrice " + (isQuadrata ? "" : "non ") + "e' quadrata");

        if (isQuadrata) {
            int[] diagonale = diagonale(matrice);
            out.println("La diagonale e' [" + toString(diagonale, ",") + "]");
        }
    }
}
