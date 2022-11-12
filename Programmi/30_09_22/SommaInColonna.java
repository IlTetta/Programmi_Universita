//SommaInColonna

import prog.io.*;

class SommaInColonna {
	public static void main (String [] args){
		
		ConsoleInputManager in = new ConsoleInputManager ();
		ConsoleOutputManager out = new ConsoleOutputManager ();
		
		//le righe utilizzate per costruire il risultato
		String rigaMeno ="----------"; //la linea di separazione conitene al massimo 10 caratteri per il limite max degli interi
									  
		String spazi ="         ";//9 sapzi
		
		int num1,num2,somma; //variabili operazione
		
		//lettura dati
		num1= in.readInt ("Inserisci il primo numero:");
		num2= in.readInt ("Inserisci il secondo numero:");
		
		somma= num1+num2;
		
		//stringhe che rappresentano i valori
		String strNum1= String.valueOf(num1);
		String strNum2= String.valueOf(num2);
		String strSomma= String.valueOf(somma);
		
		//righe da stampare
		String riga1 = spazi.substring(0, strSomma.length() - strNum1.length()) + strNum1 + "+";
		
		String riga2 = spazi.substring(0, strSomma.length() - strNum2.length()) + strNum2 + "=";
		
		String riga3 = rigaMeno.substring(0, strSomma.length());
		
		//visualizzazione della somma
		out.println(riga1);
		out.println(riga2);
		out.println(riga3);
		out.println(strSomma);
	}
}
		
		
		