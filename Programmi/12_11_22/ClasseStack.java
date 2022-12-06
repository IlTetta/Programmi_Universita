import prog.io.*;
import java.util.*;

public class ClasseStack {
    public static void main(String[] args) {

        ConsoleInputManager in = new ConsoleInputManager();
        ConsoleOutputManager out = new ConsoleOutputManager();
        // Diverse situazione anomale:
        // 1)L'espressione contiene una divisione per zero
        // 2)L'utente inserisce caratteri non corretti
        // 3)L'espressione contiene un numero insufficiente di operandi
        // 4)L'espressione contiene troppi operandi (no errore in esecuzione ma
        // risultato scorretto)
        try {
            Stack<Integer> pila = new Stack<Integer>();

            out.println("Inserire l'espressione da esaminare");
            out.println("(un elemnto per riga, = per terminare)");
            String riga = in.readLine();
            while (!riga.equals("=")) {
                // elaborazione della riga letta
                Integer sx, dx, risultato;
                char selettore = riga.charAt(0);
                switch (selettore) {
                    case '+':
                    case '-':
                    case '*':
                    case '/':
                        dx = pila.pop();
                        sx = pila.pop();
                        risultato = calcola(sx, dx, selettore);
                        pila.push(risultato);
                        break;
                    default: // se non e' un'operazione, dev'essere un numero
                        // Integer numero = new Integer(riga);
                        // pila.push(numero);
                        break;
                }

                // lettura di un'altra riga
                riga = in.readLine();
            }

            // preleva il risultato dalla pila e lo comunica
            Integer risultato = pila.pop();
            // come trattare l'anomalia (4)
            if (pila.empty())
                out.println("Il numero e' " + risultato);
            else
                out.println("L'epressione contiene troppi operandi");
        } // se voglio generalizzare i tipi di anomalie usao semplicemente 'Exception',
          // altrimenti le differenzio
          // catch (Exception ) {
          // out.println("Errore: " + e.toString());

        catch (ArithmeticException e) {
            out.println("Erroe: divisione per zero");
        } catch (NumberFormatException e) {
            out.println("Input scorretto; " + e.toString());
        } catch (EmptyStackException e) {
            out.println("L'espressione contiene un munero insufficiente di opreandi");
        }
    }

    private static int calcola(int opSx, int opDx, char segno) {
        int ris = 0;
        switch (segno) {
            case '+':
                ris = opSx + opDx;
                break;
            case '-':
                ris = opSx - opDx;
                break;
            case '*':
                ris = opSx * opDx;
                break;
            case '/':
                ris = opSx / opDx;
                break;
        }
        return ris;

    }
}
