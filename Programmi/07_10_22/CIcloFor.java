//Somma primi 10 N naturali

class CicloFor {

    public static void main(String[] args) {

        int i;
        // visualizza sequenza di numeri da 1 a 10
        for (i = 0; i <= 10; i = i + 1) {
            System.out.println(i);
        }
        System.out.println("Valore finale di i = " + i);

        int somma = 0;
        for (i = 1; i <= 10; i = i + 1) {
            somma = somma + i;
        }
        System.out.println("i=" + i);
        System.out.println("somma=" + somma);
    }
}