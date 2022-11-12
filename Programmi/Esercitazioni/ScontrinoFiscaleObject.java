//Programma che stamapa uno scontrino con vari elementi e i relativi prezzi e sconti implementando con gli oggetti

class Scontrino {
    public static final int MAX_PRODOTTI = 100;
    // Campi di una classe devono essere "private" per evitare possibili errori
    private String[] nomeProdotti = new String[MAX_PRODOTTI];
    private double[] prezzoProdotti = new double[MAX_PRODOTTI];
    private double[] scontoProdotii = new double[MAX_PRODOTTI];

    public Scontrino() {

        // Popolare lo scontrino
        nomeProdotti[0] = "Pane";
        prezzoProdotti[0] = 2;
        scontoProdotii[0] = 0;
        nomeProdotti[1] = "Pesce";
        prezzoProdotti[1] = 12;
        scontoProdotii[1] = 0;
        nomeProdotti[2] = "Spinaci";
        prezzoProdotti[2] = 5;
        scontoProdotii[2] = 50;
        nomeProdotti[3] = "Castagne";
        prezzoProdotti[3] = 8;
        scontoProdotii[3] = 70;
    }

    @Override
    public String toString() {
        String str = "";
        double totale = 0;
        for (int i = 0; nomeProdotti[i] != null; i++) {
            str += nomeProdotti[i] + " \t " + prezzoProdotti[i];
            System.out.println(nomeProdotti[i] + "\t" + prezzoProdotti[i]);
            totale += prezzoProdotti[i];
            if (scontoProdotii[i] > 0) {
                double valoreSconto = -prezzoProdotti[i] * (scontoProdotii[i] / 100.0);

                System.out.println("SCONTO " + scontoProdotii[i] + "% \t " + valoreSconto);
                totale += valoreSconto;
            }
        }
        str += ("Totale \t " + totale);

        return str;
    }
}

class ScontrinoFiscaleObject {

    public static void main(String[] args) {
        Scontrino scontrino = new Scontrino();
        System.out.println(scontrino);

    }
}