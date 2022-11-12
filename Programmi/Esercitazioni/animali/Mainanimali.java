//Creare un programma per catalogare questi animali e inserire e stampare tutte le tigri e i pappagalli 
// generando un output 
package animali;

import java.util.ArrayList;

class MainAnimali {

    public static void main(String[] args) {
        ArrayList<Animal> animali = new ArrayList<>();

        // Inizializzo l'insieme degli animali
        animali.add(new Bird("Pappagallo Cacatua", 3, "giallo/verde"));
        animali.add(new Bird("Pappagallo Caicco", 1, "bianche"));
        animali.add(new Bird("Pappagallo Cacatua", 2, "rosa/nero"));
        animali.add(new Bird("Pappagallo Ara", 2, "bianche"));
        animali.add(new Tiger("Tigre siberiana", 101, "bianco"));
        animali.add(new Tiger("Tigre siberiana", 497, "rosso/bianco/nero"));
        animali.add(new Tiger("Tigre indocinese", 437, "bianco/nero"));
        animali.add(new Tiger("Tigre siberiana", 247, "bianco/nero"));

        // Stampare tutti gli animali
        for (Animal a : animali) {
            System.out.println(a);
        }
    }

}