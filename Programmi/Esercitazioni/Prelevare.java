public class Prelevare {
    public static void main(String[] args) {
        Customer customers[] = {
                new Customer("Nish", 1001, 10000.0),
                new Customer("Shubh", 1002, 12000.0),
                new Customer("Sush", 1003, 5600.0),
                new Customer("Abhi", 1004, 999.0),
                new Customer("Akash", 1105, 1100.0)
        };

        for (Customer c : customers) {
            System.out.print(c);
            try {
                System.out.println("withddrawn " + c.withdraw(1000));
            } catch (TooLowerBalanceException e) {
                System.out.println("" + e.getMessage());
            }
        }
    }

}

class TooLowerBalanceException extends Exception {
    TooLowerBalanceException() {
    }

    TooLowerBalanceException(String messaggio) {
        super(messaggio);
    }
}

class Customer {
    private String name;
    private int contoCorr;
    private double saldo;

    public Customer(String name, int contoCorr, double saldo) {
        this.name = name;
        this.contoCorr = contoCorr;
        this.saldo = saldo;
    }

    public double getSaldo() {
        return saldo;
    }

    public double withdraw(double importo) throws TooLowerBalanceException {
        if (importo > saldo) {
            throw new TooLowerBalanceException("*** Il saldo e' minore di " + importo + " ***");
        }
        saldo -= importo;
        return importo;
    }

    public String toString() {
        return "Customer{name='" + name + "', accountNum=" + contoCorr + ", balance=" + saldo + "}";
    }

}
