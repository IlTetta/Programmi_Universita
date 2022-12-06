import prog.io.ConsoleOutputManager;
import prog.io.ConsoleInputManager;

class Pappagallo {
	public static void main(String[] args) {
		// predisposizione dei canali di comunicazione
		ConsoleInputManager tastiera = new ConsoleInputManager();
		ConsoleOutputManager video = new ConsoleOutputManager();
		ConsoleOutputManager stringa = new ConsoleOutputManager();
		stringa.println("Cosa vuoi far dire al pappagallo?");

		// lettura e comunicazione
		String messaggio = tastiera.readLine();
		video.println(messaggio);
	}
}