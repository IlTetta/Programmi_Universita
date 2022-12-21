public enum GruppoSanguigno {
    A, B, AB, O;

    public boolean puoRicevereDa(GruppoSanguigno x) {
        boolean y = false;
        switch (this) {
            case A:
                return (x == A || x == O);

            case B:
                return (x == B || x == O);

            case O:
                return (x == O);

            case AB:
                return true;

            default:
                System.out.println("Non esiste questo gruppo");
                break;

        }
        return false;
    }

}
