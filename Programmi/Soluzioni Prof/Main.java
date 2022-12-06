package scontrino;

class ProdottoScontato extends Prodotto2{
    private double sconto;
    private double prezzoSconto;

    public ProdottoScontato(String nome, double prezzo, double sconto){
        super(nome, prezzo);
        this.sconto=sconto;
        this.prezzoSconto = -prezzo * (sconto / 100.0);
    }

    @Override
    public String toString() {
        String str = super.toString();
        if(sconto > 0) {
            str += "SCONTO " + sconto + "% \t " + prezzoSconto + '\n';
        }
        return str;
    }

    public double getPrezzoComplessivo() {
        return getPrezzo() + prezzoSconto;
    }
}

class Prodotto2{
    private String nome;
    private double prezzo;

    public Prodotto2(String nome, double prezzo){
        this.nome=nome;
        this.prezzo=prezzo;
    }

    public double getPrezzo(){
        return prezzo;
    }

    @Override
    public String toString() {
        String str = "";
        str += nome + " \t " + prezzo + '\n';
        return str;
    }

    public double getPrezzoComplessivo() {
        return prezzo;
    }
}

class Scontrino3{
    private static final int MAX_PRODOTTI = 100;
    Prodotto2[] prodotti = new Prodotto2[MAX_PRODOTTI];
    private int index = 0;

    public Scontrino3(){
        // popolare lo scontrino
        prodotti[index++] = new Prodotto2("Pane", 2);
        prodotti[index++] = new Prodotto2("Pesce", 12);
        prodotti[index++] = new ProdottoScontato("Spinaci", 5, 50);
        prodotti[index++] = new ProdottoScontato("Castagne", 8, 70);
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

public class Main {
    public static void main(String[] args) {
        Scontrino3 scontrino = new Scontrino3();
        System.out.println(scontrino);
    }
}
