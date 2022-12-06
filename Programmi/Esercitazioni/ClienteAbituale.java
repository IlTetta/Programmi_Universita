public class ClienteAbituale extends Cliente {
    private int tessera;

    public ClienteAbituale(String nome, String codFisc, int tessera) {
        super(nome, codFisc);
        this.tessera = tessera;
    }

}
