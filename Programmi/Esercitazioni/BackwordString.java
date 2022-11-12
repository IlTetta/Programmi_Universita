
public class BackwordString implements CharSequence {
    private String invStr;

    public BackwordString(String src) {

        this.invStr = "";
        for (int i = src.length() - 1; i >= 0; i--) {
            this.invStr += src.charAt(i);
        }

    }

    @Override
    public int length() {
        return invStr.length();
    }

    @Override
    public char charAt(int index) {
        return invStr.charAt(index);
    }

    @Override
    public CharSequence subSequence(int start, int end) {
        // String s = "";
        // for (int i = start; i < end; i++) {
        // s += charAt(i);
        // }
        // return s;
        return invStr.subSequence(start, end);
    }

    @Override
    public String toString() {
        return invStr.toString();
    }

    public static void main(String[] args) {
        String src = "Nel mezzo del cammin di nostra vita mi ritrovai per una selva oscura, ché la diritta via era smarrita.";
        BackwordString bs = new BackwordString(src);
        for (int i = 0; i < bs.length(); i++) {
            System.out.print(bs.charAt(i));
        }
        System.out.println();

        System.out.print(bs.subSequence(0, 10));
        // System.out.println(bs);

    }

}
