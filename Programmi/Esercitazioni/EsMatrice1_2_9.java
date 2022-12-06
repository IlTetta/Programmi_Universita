
//Esercitazione 2 Es. 9
import prog.io.*;
import java.util.Random;

class EsMAtrice1_2_9 {

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
     * Restituisce la stringa che descrive la matrice specificata come
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

    public static void main(String[] args) {

        ConsoleOutputManager out = new ConsoleOutputManager();

        Random generatore = new Random();
        final int RIGHE = generatore.nextInt(10) + 1, COLONNE = generatore.nextInt(10) + 1, BOUND = 10;

        int[][] matrice = matriceIntRandom(RIGHE, COLONNE, BOUND);

        out.println("== Matrice generata");
        out.println(toString(matrice, ",", "\n"));
    }
}
