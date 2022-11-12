//Importa le librerie che ti servono con import + nome libreria
import prog.io.*;

//Crea la classe e dalle un nome che inizia con una lettera MAIUSCOLA
class ClasseEsempio{

    //Imposta il metodo main
    //RICORDATI DI String[] args TRA LE PARENTESI
    public static void main(String[] args) {
        
        //Da qui scrivi le operazioni che il metodo deve fare

        //Per interagire con il programma:
        //Per gestire gli input nel programma
        ConsoleInputManager VariabileEsempioIn = new ConsoleInputManager();
        //Per gestire gli output del programma
        ConsoleOutputManager VariabileEsempioOut = new ConsoleOutputManager();

        //Per dichiarare una variabile scrivi il tipo della variabile seguita dal nome
        int VariabileEsempioIntero;
        //Quando dichiari una variabile puoi anche assegnsrgli subito un valore
        String VariabileEsempioStringa1 = "Stringa di esempio: ", VariabileEsempioStringa2;

        //La prossima riga la spiego dopo
        VariabileEsempioOut.println("Scrivi un numero: ");

        /*Per far assegnare all'utente un valore alla variabile:
        1) nome della variabile a cui vuoi far assegnare il valore
        2) =
        3) nome della variabile usata per gestire gli input (VariabileEsempioIn)
        4) . + funzione a seconda del tipo di variabile (readInt() per gli interi)*/
        VariabileEsempioIntero = VariabileEsempioIn.readInt();
        /*Se si vuole far visualizzare un messaggio prima di inserire il valore
        si possono mettere "" tra le parentesi e il messaggio al loro interno*/
        VariabileEsempioStringa2 = VariabileEsempioIn.readLine("Messaggio di esempio: ");
        
        /*Per stampare un messaggio a video:
        1) nome della varibile usata per gestire gli output (VariabileEsempioOut)
        2) . + nome della funzione a seconda della funzionalità (.println(...) va a capo alla fine del messaggio);
        */
        VariabileEsempioOut.print("Il numero: ");
        VariabileEsempioOut.println(VariabileEsempioIntero);
        VariabileEsempioOut.print(VariabileEsempioStringa1);
        VariabileEsempioOut.println(VariabileEsempioStringa2);

        //Per usare un int come stringa:
        String NumeroComeStringa = String.valueOf(VariabileEsempioIntero);
        VariabileEsempioOut.println(NumeroComeStringa);

        //Per unire due o più stringhe:
        String StringheUnite = VariabileEsempioStringa2 + " " + NumeroComeStringa;
        VariabileEsempioOut.println(StringheUnite);

        //Per tagliare una parte di stringa
        String StringaDaTagliare = "Taglio1 Taglio2";
        String StringaTagliata = StringaDaTagliare.substring(0, 7);
        //.substring(posizione di inizio della parte di stringa da tenere, posizione di fine...)
        VariabileEsempioOut.println(StringaTagliata);
        StringaTagliata = StringaDaTagliare.substring(8);
        //Per prendere la stringa da una posizione in poi basta mettere solo la posizione di inizio
        VariabileEsempioOut.println(StringaTagliata);

        //Per sapere da quanti caratteri è formata una stringa:
        String Lunghezza = "123456789";
        int LunghezzaStringa = Lunghezza.length();
        VariabileEsempioOut.println(LunghezzaStringa);
    }
}