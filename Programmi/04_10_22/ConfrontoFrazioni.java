// Confronto tra frazioni

import prog.io.*;
import prog.utili.Frazione;

class ConfrontoFrazioni {
	public static void main (String [] args) {
		ConsoleInputManager in = new ConsoleInputManager ();
		ConsoleOutputManager out = new ConsoleOutputManager ();
		
		int num, den;
		
		//lettura e costruzioni della prima frazione
		num = in.readInt("Numeratore prima frazione ");
		den = in.readInt("Denominatore prima frazione ");
		Frazione f1 = new Frazione(num, den);
		
		//lettura e costruzioni della seconda frazione
		num = in.readInt("Numeratore seconda frazione ");
		den = in.readInt("Denominatore seconda frazione ");
		Frazione f2 = new Frazione(num, den);
		
		//confronto
		if (f1.equals(f2)) //chiedere con == perchè non funzione
			out.println ("Le due frazioni sono uguali");
		else
			out.println("Le due frazioni sono diverse");
		
		out.println("Bravo, il programma e' riuscito!!!");
	}
}