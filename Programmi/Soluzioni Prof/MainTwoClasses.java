package scontrino;


class Prodotto{
    private String nome;
    private double prezzo;
    private double sconto;

    private double prezzoSconto;

    public Prodotto(String nome, double prezzo, double sconto){
        this.nome=nome;
        this.prezzo=prezzo;
        this.sconto=sconto;
        this.prezzoSconto = -prezzo * (sconto / 100.0);
    }

    @Override
    public String toString() {
        String str = "";
        str += nome + " \t " + prezzo + '\n';
        if(sconto > 0) {
            str += "SCONTO " + sconto + "% \t " + prezzoSconto + '\n';
        }
        return str;
    }

    public double getPrezzoComplessivo() {
        return prezzo + prezzoSconto;
    }
}

class Scontrino2{
    private static final int MAX_PRODOTTI = 100;
    Prodotto[] prodotti = new Prodotto[MAX_PRODOTTI];
    private int index = 0;

    public Scontrino2(){
        // popolare lo scontrino
        prodotti[index++] = new Prodotto("Pane", 2, 0);
        prodotti[index++] = new Prodotto("Pesce", 12, 0);
        prodotti[index++] = new Prodotto("Spinaci", 5, 50);
        prodotti[index++] = new Prodotto("Castagne", 8, 70);
    }

    @Override
    public String toString() {
        String str = "";
        // stampare lo scontrino
        double totale = 0;
        for (int i=0; prodotti[i] != null; i++){
            str += prodotti[i];
            totale += prodotti[i].getPrezzoComplessivo();
        }
        str += "TOTALE \t " + totale + '\n';
        return str;
    }
}

public class MainTwoClasses {
    public static void main(String[] args) {
        Scontrino2 scontrino = new Scontrino2();
        System.out.println(scontrino);
    }
}
