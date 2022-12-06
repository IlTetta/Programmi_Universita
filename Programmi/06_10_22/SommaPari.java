//somma di numeri pari
import prog.io.*;

class SommaPari{

public static void main (String [] args){

ConsoleInputManager in =new ConsoleInputManager();

int x, somma=0;
boolean continua=true;
do {
    x=in.readInt();
    if(x==0)
    continua=false;
    else if(x%2 ==0)
    somma +=x; // uguale a scrivere somma=somma+x
}while(continua);

System.out.println(somma);
}

}