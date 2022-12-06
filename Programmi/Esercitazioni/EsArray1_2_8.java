
//Esercitazione 2 Es. 8
import prog.io.*;
import java.util.Random;

class EsArray1_2_8 {

    /*
     * Restituisce un array in int della dimensione specificata in cui
     * ogni posizione contiene un valore compreso fra 0 e valoreMax.
     */

    public static int[] arrayIntRandom(int dimArray, int valoreMax) {
        Random generatore = new Random();
        int[] array = new int[dimArray];
        for (int i = 0; i < array.length; i++)
            array[i] = generatore.nextInt(valoreMax);
        return array;
    }

    /*
     * Restituisce la stringa che descrive l'array specificato come
     * argomento, i valori dell'array sono separati dalla stringa
     * specificata come secondo argomento.
     */
    public static String toString(int[] array, String separatore) {
        String risultato = "";
        for (int i = 0; i < array.length; i++)
            risultato += array[i] + (i < array.length - 1 ? separatore : "");
        return risultato;
    }

    /*
     * Restituisce l'array che contiene gli stessi elementi di a ma in
     * ordine inverso. Il metodo assume che a sia diverso da null.
     */

    public static int[] reverse(int[] a) {
        int[] risultato = new int[a.length];
        for (int i = 0; i < a.length; i++)
            risultato[i] = a[(a.length - 1) - i];
        return risultato;
    }

    /*
     * Restituisce l'array che contiene posizione per posizione il
     * massimo fra i valori nella corrispondente posizione di a e b. Il
     * metodo assume che a e b siano diversi da null e della stessa
     * dimensione.
     */

    public static int[] maxPosizioni(int[] a, int[] b) {
        int[] risultato = new int[a.length];
        for (int i = 0; i < a.length; i++)
            risultato[i] = a[i] >= b[i] ? a[i] : b[i];
        return risultato;
    }

    public static void main(String[] args) {
        
        ConsoleOutputManager out = new ConsoleOutputManager();

        final int DIMENSIONE = 10, BOUND = 100;

        int[] a = arrayIntRandom(DIMENSIONE, BOUND), b = arrayIntRandom(DIMENSIONE, BOUND);

        out.println("          a=[" + toString(a, ",") + "]");
        out.println("          b=[" + toString(b, ",") + "]");

        int[] aReverse = reverse(a);

        out.println("reverse di a =[" + toString(aReverse, ",") + "]");
        out.println();

        int[] maxPosizioni = maxPosizioni(a, b);

        out.println("maxPosizioni=[" + toString(maxPosizioni, ",") + "]");
    }

}