import javax.sound.sampled.SourceDataLine;

public enum GruppoSanguigno {
    A, B, AB, O;

    public boolean puoRicevereDa(GruppoSanguigno x) {
        boolean y = false;
        switch (this) {
            case A:
                if (x == A || x == O)
                    return true;
                else
                    return false;

            case B:
                if (x == B || x == O)
                    return true;
                else
                    return false;

            case O:
                if (x == O)
                    return true;
                else
                    return false;
            case AB:
                return true;

            default:
                System.out.println("Non esiste questo gruppo");
                break;

        }
        return false;
    }

}
