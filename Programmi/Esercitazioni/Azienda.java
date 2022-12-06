
class Azienda {
    public static void main(String[] args) {
        Cliente max1 = new Cliente("max", "MMAAXX11E22X333Y");
        Cliente anna1 = new Cliente("anna", "AAANNN11E33X333Y");
        Cliente max2 = new ClienteAbituale("max", "MMAAXX11E22X333Y", 1000);
        Cliente anna2 = new ClienteAbituale("anna", "AAANNN11E33X333Y", 300);

        System.out.println(max1 + "\t e' uguale a \t" + max2 + "\t:" + max1.equals(max2));
        System.out.println(anna1 + "\t e' uguale a \t" + anna2 + "\t:" + anna1.equals(anna2));
        System.out.println(max2 + "\t e' uguale a \t" + max1 + "\t:" + max2.equals(max1));
        System.out.println(anna2 + "\t e' uguale a \t" + anna1 + "\t:" + anna2.equals(anna1));
        System.out.println(max1 + "\t e' uguale a \t" + anna1 + "\t:" + max1.equals(anna1));
        System.out.println(max1 + "\t e' uguale a \t" + anna2 + "\t:" + max1.equals(anna2));
        System.out.println(max2 + "\t e' uguale a \t" + anna1 + "\t:" + max2.equals(anna1));
        System.out.println(max2 + "\t e' uguale a \t" + anna2 + "\t:" + max2.equals(anna2));
    }
}