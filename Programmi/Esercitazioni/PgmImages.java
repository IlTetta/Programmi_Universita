import java.io.FileInputStream;
import java.util.Scanner;

public class PgmImages {

    String filePath="image.pgm";
    FileInputStream inputFile = new FileInputStream(filePath);
    Scanner scan=new Scanner(inputFile);

    scan.nextLine();

    scan.nextLine();

    int picWidth=scan.nextInt();
    int picHeught=scan.nextInt();
    int maxValue=scan.nextInt();

    inputFile.close();

    inputFile


    
}
