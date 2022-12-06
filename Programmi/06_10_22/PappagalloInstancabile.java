//Pappagallo instancaile

import prog.io.*;

class PappagalloInstancabile {
	public static void main (String [] args) {
		ConsoleInputManager in = new ConsoleInputManager ();
		ConsoleOutputManager out = new ConsoleOutputManager();
		
        String messaggio = "";

		while (!messaggio.equals("stanco")){
         messaggio = in.readLine();
        String risposta = messaggio.toUpperCase();
        out.println (risposta);

        }
		
		
	}
}