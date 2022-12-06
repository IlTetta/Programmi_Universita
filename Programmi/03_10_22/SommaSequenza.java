//Somma Sequenza

import prog.io.*;
import prog.utili.Frazione;

class SommaSequenza {
	public static void main (String [] args) {
		
		ConsoleInputManager in = new ConsoleInputManager ();
		ConsoleOutputManager out = new ConsoleOutputManager ();
		
		int num, den;
		
		Frazione somma = new Frazione (0);
		boolean continua;
		
		do {
			num = in.readInt("Numeratore? ");
			den = in.readInt("Denominatore? ");
			somma = somma.piu(new Frazione(num, den));
			continua = in.readSiNo("Vuoi inserire un'altra frazione (s/n)? ");
		} while (continua);
		
		out.println ("La somma e' " + somma.toString());
		out.println("Bravo, il programma e' riuscito!!!");
	}
}