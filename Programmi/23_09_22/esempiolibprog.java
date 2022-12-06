//* esempio lib prog */
import prog.io.ConsoleOutputManager;
import prog.io.ConsoleInputManager;

class BuonaGiornataATe {
			public static void main (String [] args) {
				ConsoleInputManager in = new ConsoleInputManager();
				ConsoleOutputManager out = new ConsoleOutputManager ();
				String nome = in.readLine ("Inserisci il tuo nome");
				out.println ("Ciao " + nome + ", ti auguro una buona giornata !");
				}
			}