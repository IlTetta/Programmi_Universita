package scontrino;

public class MainNoClasses {
    public static final int MAX_PRODOTTI = 100;

    public static void main(String[] args) {
        String[] nomeProdotti = new String[MAX_PRODOTTI];
        double[] prezzoProdotti = new double[MAX_PRODOTTI];
        double[] scontoProdotti = new double[MAX_PRODOTTI];

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

        // stampare lo scontrino
        double totale = 0;
        for (int i=0; nomeProdotti[i] != null; i++){
            System.out.println(nomeProdotti[i] + " \t " + prezzoProdotti[i]);
            totale += prezzoProdotti[i];
            if(scontoProdotti[i] > 0) {
                double valoreSconto = -prezzoProdotti[i] * (scontoProdotti[i] / 100.0);
                System.out.println("SCONTO " + scontoProdotti[i] + "% \t " + valoreSconto);
                totale += valoreSconto;
            }
        }
        System.out.println("TOTALE \t " + totale);
    }
}
