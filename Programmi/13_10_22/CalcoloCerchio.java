import prog.io.*;

//import static java.lang.Math.PI;
class CalcoloCerchio {
    public static void main(String[] args) {

        ConsoleInputManager in = new ConsoleInputManager();
        ConsoleOutputManager out = new ConsoleOutputManager();

        double DblRaggio, DblArea, DblCirconferenza;
        // final double PI=3.14; "final" indica che PI è una costante

        // Lettura del raggio
        DblRaggio = in.readDouble("Inserire al lunghezza del raggio ");

        // Clacolo di area e circonferenza
        // area=raggio*raggio*PI;
        // circonferenza=raggio*2*PI;
        DblArea = DblRaggio * DblRaggio * Math.PI; // oppure importarla da java.lang
        DblCirconferenza = DblRaggio * 2 * Math.PI;

        out.println(
                "L'area del cerchio e': " + DblArea + "\n" + "La circonferenza del cerchio e': " + DblCirconferenza);

    }

}