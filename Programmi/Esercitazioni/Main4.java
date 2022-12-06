
// Scrivere su un ByteArrayOutputStream dei numeri interi
// Utilizzare un InputStream per leggere il primo intero (205) dalla sequenza di byte prodotta dal 
// OutputStream.
import java.io.*;

public class Main4 {
    public static void main(String[] args) throws IOException {
        int[] arr = { 205, 502, 11, 2022, 6 };
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        DataOutputStream dos = new DataOutputStream(bos);
        for (int i = 0; i < arr.length; i++) {
            dos.writeInt(arr[i]);
        }

        InputStream inStream = new ByteArrayInputStream(bos.toByteArray());
        int val = getFirstInt(inStream);// metodo da realizzare
        System.out.println(val == 205 ? "Corretto! " + val : "Sbagliato!");
    }

    int getFirstInt(InputStream stream) {
        return stream.findFirst();
    }
}
