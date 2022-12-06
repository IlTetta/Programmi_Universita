public class PotenzaRicorsiva {
    public static int potenza(int x, int y) {
        if (y == 0)
            return 1;
        else
            return x * potenza(x, y - 1);
    }

    public static void main(String[] args) {
        int x = 0, y = 0;
        System.out.println(potenza(x, y));
    }

}
