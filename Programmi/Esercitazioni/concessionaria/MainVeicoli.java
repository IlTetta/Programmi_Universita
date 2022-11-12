//Implementare un sistema per modellare l'insieme dei veicoli del concessionario e per stamparne la 
// lista completa di caratteristiche per ogni veicolo
package concessionaria;

import java.util.ArrayList;

class MainVeicoli {
    public static void main(String[] args) {
        ArrayList<Veicolo> veicoli = new ArrayList<>();

        // Inizializzo l'insieme dei veicoli
        veicoli.add(new Auto("Audi A3", 2));
        veicoli.add(new Auto("Honda-Ninja", 5));
        veicoli.add(new Moto("Cagiva-STX", true));
        veicoli.add(new Moto("Kawasaki-H683", false));
        veicoli.add(new Camion("Fiat-M4", 3));
        veicoli.add(new Suv("Suzuki-Jump", 3, true, true));
        veicoli.add(new Sedan("Opel-Sx", 5, true));

        // Stampare tutti i veicoli
        for (Veicolo v : veicoli) {
            System.out.println(v);
        }
    }
}