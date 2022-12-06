
//Esercitazione 1 Es. 5
import prog.io.*;

class EstraiCifre1_5 {
    /*
     * Scrivere un'applicazione che, letto un numero intero comunichi se
     * il numero è negativo o positivo e visualizzi su linee separate le
     * cifre che lo compongono dalla meno significativa alla più
     * significativa.
     */
    public static void main(String[] args) {
        ConsoleInputManager in = new ConsoleInputManager();
        ConsoleOutputManager out = new ConsoleOutputManager();

        int numero = in.readInt("Inserisci un numero intero: ");
        boolean numeroNegativo = numero < 0;

        if (numeroNegativo) {
            numero = -numero;
            out.println("Il numero inserito e' nagtivo");
        } else
            out.println("Il numero inserito e' positivo");

        int contacifre = 0;
        while (numero != 0) {
            int ultimaCifra = numero % 10;
            numero = numero / 10;
            out.println("La cifra in posizione [" + contacifre++ + "] e' " + ultimaCifra);
        }

    }
}