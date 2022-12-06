public class Cliente {
    private String nome;
    private String codFisc;

    public Cliente(String nome, String codFisc) {
        this.nome = nome;
        this.codFisc = codFisc;
    }

    public String getNome() {
        return nome;
    }

    public String getcodFisc() {
        return codFisc;
    }

    public boolean equals(Cliente altro) {
        return (getNome() == altro.getNome() && getcodFisc() == altro.getcodFisc() ? true : false);

    }

    public String toString() {
        String str = getNome();
        return str += ", CF: " + getcodFisc();
    }

}
