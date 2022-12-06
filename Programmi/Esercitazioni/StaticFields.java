import java.util.ArrayList;

interface Figura {
    double area();
}

class Cerchio implements Figura {
    private static int count = 0;
    private double raggio; // costante?

    public Cerchio(double raggio) {
        this.raggio = raggio;
        count++;
    }

    public double area() {
        return 2 * Math.PI * raggio;
    }

    public static int getCount() {
        return count;
    }
}

class Rettangolo implements Figura {
    private double base;
    private double altezza;
    private static int count = 0;

    public Rettangolo(double base, double altezza) {
        this.base = base;
        this.altezza = altezza;
        count++;
    }

    public double area() {
        return base * altezza;
    }

    public static int getCount() {
        return count;
    }
}

public class StaticFields {
    public static void main(String[] args) {
        ArrayList<Figura> figures = new ArrayList<>();
        for (int i = 0; i < Math.random() * 1000; i++) {
            figures.add(Math.random() < 0.5 ? new Cerchio(i * Math.random()) : new Rettangolo(i, i + 1));
        }
        double sommaAree = 0;
        for (Figura f : figures) {
            sommaAree += f.area();
        }
        System.out.println("Area totale delle figure: " + sommaAree);
        System.out.println("Num. Cerchi creati: " + Cerchio.getCount());
        System.out.println("Num. Rettangoli creati: " + Rettangolo.getCount());
        System.out.println("Num. Figure in totale: " + figures.size());
        System.out.println(figures.size() == Cerchio.getCount() + Rettangolo.getCount() ? "Corretto!" : "Sbagliato!");
    }
}
