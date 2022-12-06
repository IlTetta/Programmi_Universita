

class EsempioIfElse {
public static void main (String [] args) {




int x,y,z;
x=1; y=1; z=0;

if (x == 1){
    System.out.println("sono nel primo if");

    if (y==1){
            System.out.println("sono nel secondo if");

        z=x+y;
    }

    else {
        System.out.println("sono nel primo if");
        z=x*y;
    }
    
}
else {
    System.out.println("sono nel secondo if");
    z=x-y;
}

System.out.println("z="+z);
}
}