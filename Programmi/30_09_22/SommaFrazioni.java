//Esercizio somma di frazioni//

import prog.io.*; //inmport di tutta la libreria ".*"//
import prog.utili.Frazione;

class SommaFrazioni {
	public static void main (String [] args) {
	
		 //dichiarazione variabili i.o
		 ConsoleInputManager in = new ConsoleInputManager ();
		 ConsoleOutputManager out = new ConsoleOutputManager ();
		 
		 //lettura e scrittura della rpima frazione
		 int num = in.readInt ("Numeratore prima frazione?");
		 int den = in.readInt ("Denominatore prima frazione?");
		 Frazione f1 = new Frazione (num,den);
		 
		 //lettura e scrittura della seconda frazione
		 num = in.readInt ("Numeratore seconda frazione?");
		 den= in.readInt ("Denominatore seconda frazione?");
		 Frazione f2 = new Frazione (num,den);
		 
		 //calcolo della somma
		 Frazione somma = f1.piu(f2);
		 
		 //comunicazione
		 out.print("La somma e' ");
		 out.println(somma.toString());
	}
}
