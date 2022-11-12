//parola palindroma2

import prog.io.*;
class Palindromi2 {

    public static void main (String [] args){

        ConsoleInputManager in=new ConsoleInputManager();
        ConsoleOutputManager out=new ConsoleOutputManager();

        String s=in.readLine("Inserire la stringa da esaminare ");

        boolean palindroma=true;
        

        for(int sx=0, dx=s.length()-1;sx<dx;sx=sx+1, dx=dx-1)
        if (s.charAt(sx) != s.charAt(dx))
        palindroma=false;

        if(palindroma)
        out.println("La stringa "+s+" e' palindroma");
        else
        out.println("La stringa "+s+" non e' palindroma");

    }
}