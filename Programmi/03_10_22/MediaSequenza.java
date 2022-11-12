// Media sequenza

import prog.io.*;
import prog.utili.Frazione;

class MediaSequenza {
	public static void main (String [] args) {
		
		ConsoleInputManager in = new ConsoleInputManager ();
		ConsoleOutputManager out = new ConsoleOutputManager ();
		
		int num, den;
		Frazione somma = new Frazione (0);
		int contaFrazioni = 0;
		
		//inserimento e calcolo della somma
		boolean continua = in.readSiNo("Vuoi inserire una frazione (s/n)? ");
		
		while (continua) {
			num = in.readInt("Numeratore? ");
			den = in.readInt("Denominatore? ");
			somma = somma.piu(new Frazione(num, den));
			contaFrazioni = contaFrazioni + 1;
			continua = in.readSiNo("Vuoi inserire un'altra frazione (s/n)? ");
		}
		//comunicazione dei risultati
		if (contaFrazioni == 0)
			out.println("Non e' stata inserita nessuna frazione");
		else {
			Frazione media = somma.diviso(new Frazione(contaFrazioni));
			out.println("La somma e' " + somma.toString() + "; la media e'" +media.toString());
		}
	}
}