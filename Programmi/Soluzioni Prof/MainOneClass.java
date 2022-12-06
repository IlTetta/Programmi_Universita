package scontrino;


import java.util.Arrays;

class Scontrino{
    private static final int MAX_PRODOTTI = 100;
    private String[] nomeProdotti = new String[MAX_PRODOTTI];
    private double[] prezzoProdotti = new double[MAX_PRODOTTI];
    private double[] scontoProdotti = new double[MAX_PRODOTTI];

    public Scontrino(){
        // popolare lo scontrino
        nomeProdotti[0] = "Pane";
        prezzoProdotti[0] = 2;
        scontoProdotti[0] = 0;
        nomeProdotti[1] = "Pesce";
        prezzoProdotti[1] = 12;
        scontoProdotti[1] = 0;
        nomeProdotti[2] = "Spinaci";
        prezzoProdotti[2] = 5;
        scontoProdotti[2] = 50;
        nomeProdotti[3] = "Castagne";
        prezzoProdotti[3] = 8;
        scontoProdotti[3] = 70;
    }

    @Override
    public String toString() {
        String str = "";
        // stampare lo scontrino
        double totale = 0;
        for (int i=0; nomeProdotti[i] != null; i++){
            str += nomeProdotti[i] + " \t " + prezzoProdotti[i] + '\n';
            totale += prezzoProdotti[i];
            if(scontoProdotti[i] > 0) {
                double valoreSconto = -prezzoProdotti[i] * (scontoProdotti[i] / 100.0);
                str += "SCONTO " + scontoProdotti[i] + "% \t " + valoreSconto + '\n';
                totale += valoreSconto;
            }
        }
        str += "TOTALE \t " + totale + '\n';
        return str;
    }
}

public class MainOneClass {
    public static void main(String[] args) {
        Scontrino scontrino = new Scontrino();
        System.out.println(scontrino);
    }
}
