//esercizio 3.3 pag. 82

class Eserciziopag82 {
public static void main (String [] args ) {

int x, y, z;

x=0; y=1; z=0;

if(x!=0)
    if(y==1)
        if(x==y)
            z=x+y;
        else
            z=x*y;
    else
        z=x-y;
if(x==0)
    System.out.println("X e' 0, valore non valido");
    else
    System.out.println("Il valore di z e':"+z);

}


}